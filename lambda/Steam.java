
import java.util.*;
import java.util.stream.*;
public class Steam 
{
   public static void main(String[] args) 
   {
      List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
      List<Integer> oddList = list.stream().filter((num)->
      {
        return num % 2 == 1;
      }).collect(Collectors.toList());

      System.out.println(oddList);
    
   }    
}
