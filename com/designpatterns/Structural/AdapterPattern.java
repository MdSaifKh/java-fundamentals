package com.designpatterns.Structural;
class OldPrinter{
    void oldPrinter(){
        System.out.println("Old printer");
    }
}
interface Printer{
    void print();
}
public class AdapterPattern implements Printer{
    OldPrinter printer = new OldPrinter();
    @Override
    public void print() {
        printer.oldPrinter();
    }
}
