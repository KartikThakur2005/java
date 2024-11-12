import java.util.*;
import java.util.function.*;
public class sup
{
      public static void main(String[] args) 
      {
        // Supplier<Integer> randomGen = ()->{return (int) (Math.random()*100d);};
        
        // System.out.println(randomGen.get());

        // Function<String, Integer> getStringLength = (str)->{return str.length();};

        // System.out.println(getStringLength.apply("kartik"));

        // Function<Integer, Integer> sqare_Root = (x)->{return (int)Math.sqrt(x);};
        // System.out.println(sqare_Root.apply(2));

        // Function<String, String> upper_Case = (str)->{return str.toUpperCase();};
        // System.out.println(upper_Case.apply("abc"));

        // Function<String, String>rem_white = (str)->{
        //     String ans = "";
        //     for(int i = 0; i < str.length(); i++)
        //     {
        //          if(str.charAt(0) ==' ' || str.charAt(str.length()-1) ==' ') 
        //          {
        //              continue;
        //          }
        //          else ans = ans + str.charAt(i);
        //     }
        //     return  ans;
        // };


        // System.out.println(rem_white.apply(" kartik "));

        Function<Supplier<String>, Consumer<String>> gen_Uid = (supp)->
        {
            String randomSupplier = supp.get();
            Consumer<String> consumer = (randomConsumwr)->
            {
               for (int i = 0; i < 10; i++){
                System.out.println(i + " "+randomConsumwr+" "+ randomSupplier); 
               }
             
            };
            return consumer;
        };

        gen_Uid.apply(()->  
        {
            return String.valueOf("random --Id -- " + (Math.random()*1000)+ "-- ");
        }).accept("Log System");;
        
        

      }
}
