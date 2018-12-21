package indi.kai.hello;

import java.util.Scanner;
public class trycatch {

    public static void main (String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("---除法运算---");
        try{
            System.err.println("输入被除数:");
            int x=input.nextInt();
            System.err.println("输入除数:");
            int y=input.nextInt();
            System.out.println("运算结果为"+(x/y));
        }catch (ArithmeticException e){
            System.out.println("除数为0的异常");
            e.printStackTrace();
        }

    }
}
