class MultipleThreadDemo
{
            public static void main(String[] args)
           {
             NewThread one=new NewThread("One");
              NewThread two=new NewThread("two");
              NewThread three=new NewThread("three");
               one.t.start();
                two.t.start();
                three.t.start();
               try
               {
      
                one.t.join(); 
                two.t.join();
                 three.t.join();
              }
               catch(InterruptedException e)
               {
                   System.out.println("Main thread is interrupted....");

                 }
             System.out.println("One thread is alive"+ one.t.isAlive());
             System.out.println("two thread is alive"+ two.t.isAlive());
              System.out.println("third thread is alive"+ three.t.isAlive());

          }


}
class NewThread  implements Runnable
{
        Thread t;
         NewThread(String name)
          {
               t=new Thread(this,name);

 
          }
          public void run()
         {
               try
                 {
                        for(int i=0;i<5;i++)
                         {
                                 System.out.println(i +"    " +t.getName());
                                  Thread.sleep(100);

                         }
                }
                 catch(InterruptedException e)
                  {

                          System.out.println("Child Thread interrupted");
                 }


        }
        

}