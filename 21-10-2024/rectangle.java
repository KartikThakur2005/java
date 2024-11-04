/**
 * rectangle
 */
public class rectangle  extends quad
{

     double length;
     double width;

     rectangle(double length, double width)
     {
         this.length = length;
         this.width = width;
     }

     public double area()
     {
         return length * width;
     }

     public void name()
     {
         System.out.println("quad");
     }
    
}