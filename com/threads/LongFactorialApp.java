package com.threads;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongFactorialApp {
    public static void main(String []args) throws InterruptedException {
        List<Long> numbers = Arrays.asList(12L, 56111L,90L,435L, 1000L);

        List<LongFactorial> threads = new ArrayList<>();
        for(long number: numbers){
            threads.add(new LongFactorial(number));
        }

        for(LongFactorial thread: threads){
            thread.start();
        }

        for(LongFactorial thread: threads){
            thread.join(1000);
        }

        for(LongFactorial thread: threads){
            if(thread.getIsFinished())
                System.out.println("Factorial of "+ thread.getNumber()+" is = "+thread.getResult());
            else
                System.out.println("Calculation is in progress for  "+ thread.getNumber());
        }
    }
}

class LongFactorial extends Thread{
    private boolean isFinished;
    private BigInteger result = BigInteger.ZERO;
    private long number;
    LongFactorial(long number){
        this.number = number;
        this.isFinished = false;
    }
    public BigInteger getResult(){
        return this.result;
    }
    public boolean getIsFinished(){
        return this.isFinished;
    }
    public long getNumber(){
        return this.number;
    }
    public void run(){
        result = calculateFactorial(number);
        isFinished = true;
    }

    private BigInteger calculateFactorial(long number) {
        BigInteger tempResult = BigInteger.ONE;
        for(long i = 1; i <=number ; i++){
            tempResult = tempResult.multiply(new BigInteger(Long.toString(i)));
        }
        return tempResult;
    }
}
