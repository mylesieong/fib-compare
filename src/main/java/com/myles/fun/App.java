package com.myles.fun;

import org.joda.time.DateTime;


public class App 
{
    public static void main( String[] args ){
        int targetIndex = args.length>0?Integer.parseInt(args[0]):50;
        
        /* bruce force*/
        System.out.println("Start quick sort at:" + DateTime.now());
        System.out.println(fib_bf(targetIndex));
        System.out.println("Finish quick sort at:" + DateTime.now());
    }
    
    public static int fib_bf(int i){
        if (i < 2){
            return 1;
        }else{
            return fib_bf(i-1)+fib_bf(i-2);
        }
    }
}
