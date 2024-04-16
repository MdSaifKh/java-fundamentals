package generics_in_java.generic_method;

public class GenericMethod {
    public static < E > void printArray(E[] elements){
        for(E element: elements)
            System.out.println(element);
    }

    public static void main( String []args){
        Integer[] intArray = {1,2,3,4,5};
        printArray(intArray);

        String[] strArray = {"hi", "hello","world"};
        printArray(strArray);
    }
}
