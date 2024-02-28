/*class Mythread extends Thread{
    public void run()
    {
        System.out.println("Current thread name:"+Thread.currentThread().getName());
        System.out.println("run() my method called");

    }


}*/ 
/*class Multithread implements Runnable{
    public void run()
    {
        System.out.println("thread is running");
    }
    public static void main(String[]args)
    {
        Multithread t = new Multithread();
        Thread t1 = new Thread(t);
        t1.start();
      
        
    } 
}*/

/*class ThreadA extends Thread
{
    public void run()
    {
        for(int i =1;i<=5;i++)
        {
            System.out.println("Thread A i="+(-1*i));
        }
        System.out.println("Exiting thread A");
    }
}
class ThreadB extends Thread
{
    public void run()
    {
        for(int j=1;j<=4;j++)
        {
            System.out.println("Thread B j="+(-2*j));

        }
        System.out.println("Exiting thread B");
    }
}
class ThreadC extends Thread
{
    public void run()
    {
        for(int k=1;k<=4;k++)
        {
            System.out.println("Thread B k="+(-3*k));

        }
        System.out.println("Exiting thread C");
    }
}


class MultiThread
{
    public static void main(String[] args) {
        
       /*  Thread t = Thread.currentThread();
        System.out.println("current thread:"+t);
        System.out.println("Name:"+t.getName());
        t.setName("New thread");
        System.out.println("new name:"+t.getName());
        try{
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
     }     */

    /* */ // ThreadA t1 = new ThreadA();
      //ThreadB t2 = new ThreadB();
     // ThreadC t3 = new ThreadC();
     // t1.start();
      //t2.start();
    //  t3.start();



   // }  
//}*//**/* */ */

/* */

/*class First {
    public synchronized void display(String msg)
    {
        System.out.println("["+msg);
        
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("]");
        
    }
}
class Second extends Thread{
    String msg;
    First fobj;

    Second(First fp,String str)
    {
        msg = str;
        fobj =fp;
    }
    public void run(){
        fobj.display(msg);
        
    }
}

class MultiThread{
    public static void main(String[] args) {
        First fn = new First();
        Second ss = new Second(fn,"welcome");
        Second ss1 = new Second(fn, "new");
        Second ss2 = new Second(fn,"Programmer");
        ss.start();
        ss1.start();
        ss2.start();
    }
}*/

/*class Jawa extends Thread{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try{

                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName());


            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }

            }
        }
    }

    class MultiThread 
    {
        public static void main(String[] args) {
            Jawa t1 = new Jawa();
            Jawa t2 = new Jawa();
            Jawa t3 = new Jawa();

            t1.start();
            t2.suspend();
            t3.start();
            t3.resume();

        }
    }*/

    
