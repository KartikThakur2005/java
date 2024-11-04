 class circle implements shapes 
{
     public double r;

     circle (double r)
     {  
         this.r = r;
     }
    public double area()
    {
         return 3.14*r*r;
    }  
    

    public void name()
    {
         System.out.println("Circle");
    }
    public int side()
    { 
        return 0;
    }
}
