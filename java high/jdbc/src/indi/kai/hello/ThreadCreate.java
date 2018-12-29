package indi.kai.hello;


public class ThreadCreate extends Thread{
    //run方法称为线程体
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Thread"+i);
        }
    }


}
