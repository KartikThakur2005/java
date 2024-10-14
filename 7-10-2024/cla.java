import java.util.*;
public class cla
{
    int a;
    int b;
    cla(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    cla(int a)
    {
         this.a = a;
    }
    cla(cla copy){
        this.a = copy.a;
        this.b = copy.b;
    }
   public static void main(String[] args) 
    {
        // cla one = new cla(1);
        // cla two = new cla(3, 2);
        // cla three = new cla(two);
 
        //  System.out.println(one.a);
        //  System.out.println(two.a + " "+ two.b);
        //  System.out.println(three.a + " "+ three.b);



       
    }
}