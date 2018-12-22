
import java.util.Date;


public class ThreadSleep implements Runnable{
    boolean flag=true;
    public void run(){
        System.out.println("子线程执行");
        while(flag){
            System.out.println("---"+new Date()+"---");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("中断子程序，跳出循环");
                break;
            }

        }
    }
    public static void main (String[] args)  {
        indi.kai.hello.ThreadSleep s=new indi.kai.hello.ThreadSleep();
        Thread t=new Thread(s);
        System.out.println("主线程执行");
        System.out.println("主线程睡眠6秒");

        t.start();
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e1){
            e1.printStackTrace();
        }
        System.out.println("主线程执行");
        t.interrupt();


    }
}
