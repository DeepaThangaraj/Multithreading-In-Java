class ThreadDemo
{
           public static void main(String[] args)
           {
                   NewThreadDemo n=new NewThreadDemo();
                   n.t.start();
                    try
                    {
                           Thread.sleep(2000);               
                         
                     }
                    catch(InterruptedException e)
                    {

                           System.out.println("Main thread is interrupted"+e);
                     }
                     System.out.println("Main thread finished excecution");

           }

}
class NewThreadDemo implements Runnable
{
      Thread t;
       NewThreadDemo()
      {
          t=new Thread(this,"SecondThread");
      }
       public void run()
       {
              try
               {
                     for(int i=0;i<10;i++)
                     {
                             System.out.println(i);
                             Thread.sleep(200);

                     }
             }
             catch(InterruptedException e)
              {

                          System.out.println("Second Thread interrupted...");
               }

      }


}