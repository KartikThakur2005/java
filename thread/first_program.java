public class first_program 
{
   public static void main(String[] args) throws Exception
   {
       counter obj =  new counter();
        Mythread arr[] = new Mythread[20];

        for(int i = 0; i < 20; i++)
        { 
           arr[i] = new Mythread(obj);
           arr[i].start();
        }

        for(int i = 0; i < 20; i++)
        {
           arr[i].join();
        }

        System.out.println(obj.count);
      
   }    
}

class counter
{
     int count;
     counter()
     {
       this.count = 0;
     }

     public synchronized void  incre()
     {
        this.count += 10000;
     }
}


class Mythread extends Thread
{
   public counter obj;
   Mythread(counter obj)
   {
       this.obj = obj;
   }
   public void run()
   {
         obj.incre();
   }
}
