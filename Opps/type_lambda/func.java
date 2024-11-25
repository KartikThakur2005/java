import java.util.function.*;
public class func 
{
     
    public static void main(String[] args) 
    {
       
        Function<String, Integer> fun1 = (str)->
        {
             return str.length();
        };

       Function<Integer, Integer> fun2 = (n)-> n*n;

       System.out.println(fun1.andThen(fun2).apply("kartik"));
    //    System.out.println(fun1.compose(fun2).apply(2));

        
    }    
}
