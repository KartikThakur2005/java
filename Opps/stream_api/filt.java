import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class filt 
{
  public static void main(String[] args) 
  {
    //  List<Integer> num = Arrays.asList(1,2,3,4,5,6);
    //  List<Integer> ans = new ArrayList<>();
    //  ans = num.stream().filter((number)->number%2==0 ).collect(Collectors.toList());
    //  System.out.println(ans);
   
    //  num.stream().filter((n)-> n % 2 ==0).forEach((n)->System.out.println(n));

    List<String> name = Arrays.asList("Kartik", "Thakur", "abcderfg", "aiojdsuefwioj", "abcd", "ewiojkjfj");

    name.stream().filter((n)-> n.length() > 3 && n.length() < 7).forEach((n)->System.out.println(n));
  }   
}
