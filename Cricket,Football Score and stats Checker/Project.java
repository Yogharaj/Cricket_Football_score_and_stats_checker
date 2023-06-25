class Aq extends Thread
{
   Main1 obj;
   public void run()
   {
	   
   }
   Aq(Main1 m)
   {
      this.obj=m;
      this.obj.start();
   }
}
class Bq extends Thread
{
	public void run()
	   {
		   
	   }
    Main1 obj1;
    Bq(Main1 m)
    {
       this.obj1=m;
       this.obj1.start();  
    }
}
class C extends Thread
{
	public void run()
	   {
		   
	   }
    C(Main1 m)
    {
        Aq a1=new Aq(m);
        Bq b1=new Bq(m);   
        a1.start();b1.start();
    }
}
class Main1 extends Thread
{
    public  void run()
    {
        for(int i=0;i<10;i++)
        {
          try
          {
           System.out.print("."+i);
           Thread.sleep(1000);
          }
          catch(Exception e)
          {
             System.out.println(e);
          }
        }
    }
    public static void main(String args[])
    {
       Main1 m1=new Main1();
       C c=new C(m1);
       c.start();
    }
}
