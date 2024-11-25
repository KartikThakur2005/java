
 interface temp
 {
     int add(int a, int b);
 }
public class func 
{
    public static void main(String[] args) 
    {
        temp obj = (a, b)->
        {
                return a + b;
        };

        System.out.println(obj.add(2, 4));
         

      
    }    
}
