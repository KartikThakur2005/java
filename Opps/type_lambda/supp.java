import java.util.function.*;
public class supp 
{
     public static void main(String[] args) 
     {
           Function<Integer, Integer> clac_bonus = (salry)->
           {

                 return  salry / 10;
           }; 
           Predicate<Integer> check = (bonus)-> bonus > 5000;
           
           Consumer<emp> print_details = (obj)->
           {
               System.out.println("The name of person is " + obj.name + " its salary is " + obj.salary) ;
           };

        emp obj = new emp(60000,"Kartik");
        int bonus = clac_bonus.apply(obj.salary);
        if(check.test(bonus))print_details.accept(obj);
     }
     
}

class emp
{
    int salary;
    String name;
    emp(int salary, String name)
    {
          this.salary = salary;
          this.name = name;
    }
}