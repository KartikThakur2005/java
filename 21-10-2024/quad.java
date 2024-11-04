abstract class quad implements shapes
{
    
        public int sides()
        {
            return 4;
        }

        public void name()
        {
            System.out.println("quad");
        }
        public abstract double area();
}

