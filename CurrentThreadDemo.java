class CurrentThreadDemo
{
   /* notes:  1.main threadd is created automatically when the program is 
         started.
        2.It can be controlled by a thread object.
         3.For that we must obtain a reference to it by calling the currentThread().
     */
    public static void main(String args[])
    {

           Thread t=Thread.currentThread();
           System.out.println("Current Thread name   "+t );
           //changing name of the thread
            t.setName("JavaThreadExample");
            System.out.println("After name change..."+t);
            try
             {
                  for(int i=0;i<10;i++)
                  {
                             System.out.println(i);
                             Thread.sleep(1000);
                   }
               }catch(InterruptedException e)
                         {

                                   System.out.println("main thread is interrupted");
                              }

       }       

/*output:
Current Thread name   Thread[main,5,main]
After name change...Thread[JavaThreadExample,5,main]
0
1
2
3
4
5
6
7
8
9
*/
/*
   In above output main is the name of the thread,5 is the thread priority,main is the threadgroup

*/

}