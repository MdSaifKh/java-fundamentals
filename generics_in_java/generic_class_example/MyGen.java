package generics_in_java.generic_class_example;

public class MyGen<T> {
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T get(){
        return this.obj;
    }
}
class Main{
    public static void main(String[] args){
        MyGen<Integer> obj1 = new MyGen<>();
        //obj1.add("saif");  compile time error
        obj1.add(12);
        System.out.println(obj1.get());

        MyGen<String> obj2 = new MyGen<>();
        //obj2.add(12); compile time error
        obj2.add("Saif");
        System.out.println(obj2.get());
    }
}
