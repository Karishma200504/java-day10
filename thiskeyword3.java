import java.util.*;
public class thiskeyword3{
    String name;
    thiskeyword3(String name)
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String args[]){
        thiskeyword3 o=new thiskeyword3("harshith");
        o.agt();
    }
}
class teacher{
    public void teach(thiskeyword3 s)
{
    s.dis1();
}
}