package indi.kai.hello;
import java.util.Base64;
import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
//生产玩具Rabbit
class Rabbit{
    int id;
    Rabbit(int id){
        this.id=id;
    }
    public String toString(){
        return "玩具："+id;//重写toString方法
    }
}

//存放小兔子玩具的栈
class Stack{
    int index=0;
    indi.kai.hello.Rabbit[] rabbitArray=new indi.kai.hello.Rabbit[6];
    public synchronized void push(indi.kai.hello.Rabbit wt){
        while(index==rabbitArray.length){
            try{
                this.wait();//存放玩具的栈满，等待消费者消费
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.notifyAll();
        rabbitArray[index]=wt;
        index++;
    }
    public synchronized indi.kai.hello.Rabbit pop(){
        while(index==0){
            try{
                this.wait();//等待生产玩具
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.notifyAll();
        index--;
        return rabbitArray[index];
    }
}

class Producer implements Runnable{
    indi.kai.hello.Stack st=null;
    Producer(indi.kai.hello.Stack st){
        this.st=st;
    }
    public void  run(){
        for(int i=0;i<10;i++){
            indi.kai.hello.Rabbit r=new indi.kai.hello.Rabbit(i);
            st.push(r);
            System.out.println("生产-"+r);
            try{
                Thread.sleep((int)(Math.random())*200);//生产完一个，睡眠

            }catch (InterruptedException e){

            }
        }
    }

}

class Consumer implements Runnable{
    indi.kai.hello.Stack st=null;
    Consumer(indi.kai.hello.Stack st){
        this.st=st;
    }
    public void run(){
        for(int i=0;i<10;i++){
            indi.kai.hello.Rabbit r=st.pop();
            System.out.println("消费-"+r);
            try{
                Thread.sleep((int)(Math.random())*1000);//生产完一个，睡眠

            }catch (InterruptedException e){

            }
        }
    }
}

public class ProducerConsumer {
    public static void main (String[] args)  {
        indi.kai.hello.Stack s=new indi.kai.hello.Stack();
        indi.kai.hello.Producer p=new indi.kai.hello.Producer(s);
        indi.kai.hello.Consumer c=new indi.kai.hello.Consumer(s);
        new Thread(p).start();
        new Thread(p).start();
        new Thread(p).start();
        new Thread(c).start();

    }
}
