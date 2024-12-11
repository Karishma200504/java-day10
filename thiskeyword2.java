import java.util.*;
public class thiskeyword2{
    void display()
    {
        System.out.println("hello students");
    }
    void dis1()
    {
        this.display();
    }
    public static void main(String args[]){
        thiskeyword2 o=new thiskeyword2();
        o.dis1();
    }
}