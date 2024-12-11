/*interface*/
import java.util.*;
interface mobileapp{
    public void menu();
    public void rating();
    public void contact();
}
class b implements mobileapp
{
    public void menu()
    {
System.out.println("hello");
    }
    public void rating()
    {
        System.out.println("hello raju");
    }
    public void contact()
    {
        System.out.println("8934567889");
    }
}
public class main{
    public static void main(String args[])
    {
        b o=new b();
        o.contact();
    }
}