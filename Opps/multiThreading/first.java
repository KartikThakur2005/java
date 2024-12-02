public class first {

    public static void main(String[] args) 
    {
        //  Mythread t1  = new Mythread(1, 2);

        //  t1.start();
        //  System.out.println("In main");


        ByRun obj = new ByRun(1, 2);
        
        new Thread(obj).start();
       
    }
}


class Mythread extends Thread
{
    int x,  y;
    Mythread(int x, int y)
    {
         this.x = x;
         this.y = y;
    }

    public void run()
    {
         System.out.println(x + " "+y);
    }
}

class ByRun implements Runnable
{
    int x, y;
    ByRun(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
   public void run()
   {
     System.out.println(x + " "+ y);
   }

}