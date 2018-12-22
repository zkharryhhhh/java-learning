class ThreadCreate extends Thread{//thread类创建线程
    //run方法称为线程体
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Thread"+i);
        }
    }


}
class RunnableCreate implements Runnable{//runnable接口创建线程

    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Runnable"+i);
        }
    }
}

public class TestRun {
    public static void main (String[] args)  {

        System.out.println("主线程开始执行");
        indi.kai.hello.RunnableCreate c=new indi.kai.hello.RunnableCreate();
        Thread r=new Thread(c);
        r.start();
        indi.kai.hello.ThreadCreate t=new indi.kai.hello.ThreadCreate();
        t.start();

        System.out.println("主线程执行结束");

    }
}