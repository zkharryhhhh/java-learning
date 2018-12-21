package indi.kai.hello;

import java.util.InputMismatchException;
import java.util.Scanner;
public class throwtest {
    public void chu(int x,int y){
        if(x==y||y==0){
            System.out.println("抛出算术异常");
            throw new ArithmeticException();
        }
        else{
            System.out.println("x/y="+(x/y));
        }
    }

    public static void main (String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("---除法运算---");
        try{
            System.err.println("输入被除数:");
            int x=input.nextInt();
            System.err.println("输入除数:");
            int y=input.nextInt();
            throwtest t=new throwtest();
            t.chu(x,y);//捕获异常
        }catch (ArithmeticException e){

            e.printStackTrace();

        }

    }
}
