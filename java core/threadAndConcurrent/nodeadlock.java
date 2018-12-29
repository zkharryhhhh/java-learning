package indi.kai.hello;
import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
public class NoDeadLock implements Runnable{
    public int flag=1;
    public static Object obj1=new Object();
    public static Object obj2=new Object();
    public static final Semaphore s1=new Semaphore(1);//计数信号量
    public static final Semaphore s2=new Semaphore(1);//计数信号量

    public void run(){
        System.out.println("当前执行的线程是"+Thread.currentThread().getName()+" flag="+flag);
        if(flag==1){
            try{
                while(true){
                    if(NoDeadLock.s1.tryAcquire(1,TimeUnit.SECONDS)){
                        System.out.println(Thread.currentThread().getName()+"：锁定资源1，"+new Date().toString());
                        //1秒后尝试获得许可
                        if(NoDeadLock.s2.tryAcquire(1,TimeUnit.SECONDS)){
                            System.out.println(Thread.currentThread().getName()+"：锁定资源2，"+new Date().toString());
                            Thread.sleep(30*1000);
                        }
                        else{
                            System.out.println(Thread.currentThread().getName()+"：锁定资源2失败，"+new Date().toString());
                        }
                        NoDeadLock.s1.release();//释放
                        NoDeadLock.s2.release();
                        Thread.sleep(3000);
                    }
                    else{
                        System.out.println(Thread.currentThread().getName()+"：锁定资源1失败，"+new Date().toString());
                    }
                }
            }
            catch(InterruptedException e){

            }
        }
        if(flag==0){
            try{
                while(true){
                    if(NoDeadLock.s2.tryAcquire(1,TimeUnit.SECONDS)){
                        System.out.println(Thread.currentThread().getName()+"：锁定资源2，"+new Date().toString());
                        //1秒后尝试获得许可
                        if(NoDeadLock.s1.tryAcquire(1,TimeUnit.SECONDS)){
                            System.out.println(Thread.currentThread().getName()+"：锁定资源1，"+new Date().toString());
                            Thread.sleep(30*1000);
                        }
                        else{
                            System.out.println(Thread.currentThread().getName()+"：锁定资源1失败，"+new Date().toString());
                        }
                    }
                    else{
                        System.out.println(Thread.currentThread().getName()+"：锁定资源2失败，"+new Date().toString());
                    }
                    NoDeadLock.s1.release();//释放
                    NoDeadLock.s2.release();
                    Thread.sleep(3000);
                }
            }
            catch(InterruptedException e){

            }
        }
    }
    public static void main (String[] args)  {
        NoDeadLock d1=new NoDeadLock();//创建类对象
        NoDeadLock d2=new NoDeadLock();
        d1.flag=1;
        d2.flag=0;
        Thread t1=new Thread(d1);//创建线程
        Thread t2=new Thread(d2);
        t1.setName("thread1");
        t2.setName("thread2");
        t1.start();
        t2.start();



    }
}
