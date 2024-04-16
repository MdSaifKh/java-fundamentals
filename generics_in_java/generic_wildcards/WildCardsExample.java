package generics_in_java.generic_wildcards;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle");
    }
}
public class WildCardsExample {
    public static void drawShape(List<? extends Shape> list){
        for(Shape s: list){
            s.draw();
        }
    }

    public static void main(String[] args){
        List<Rectangle> rec = new ArrayList<>();
        rec.add(new Rectangle());
        rec.add((new Rectangle()));

        List<Circle> cir = new ArrayList<>();
        cir.add(new Circle());

        drawShape(rec);
        drawShape(cir);
    }
}
