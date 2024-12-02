public class first 
{
    static int count = 0;

    public static void main(String[] args) throws java.lang.Exception
    {

        //  -> By Lambda functions
        // Thread t = new Thread(()->{

        //     for(int i = 0; i < 20; i++)count++;
        // });

        // t.start();
        // t.join();
        // System.out.println(count);


        //  By implementing Runnable

    }

    class x implements Runnable
    {
        public void run()
        {
             System.out.println("Hello");
        }
    }
}