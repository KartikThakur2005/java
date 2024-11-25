import java.util.function.*;
import java.util.*;
public class pred 
{
   public static void main(String[] args) 
   {
      employee obj1 = new employee("Kartik", 4, 50000);

       Predicate<employee> prd = (obj)->
       {
           if(obj.salary > 30000 && obj.exp > 3) return true;
           return false;
       };

        Predicate<employee> prd2 = (obj)->
        {
             if(obj.name.length() < 3)return true;
             return false;
        };
         
        if(prd.and(prd2).test(obj1))System.out.println(obj1.name);
        else System.out.println("Noot ");
   }
    
}


class employee
{
     String name;
     int exp, salary;

     employee(String name, int exp, int salary)
     {
         this.name = name;
         this.exp = exp;
         this.salary = salary;
     }
}