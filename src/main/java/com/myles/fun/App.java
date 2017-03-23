package com.myles.fun;

import org.joda.time.DateTime;


public class App {
    
    private static int[] a;
    
    public static void main( String[] args ){
        int targetIndex = args.length>0?Integer.parseInt(args[0]):50;
        a = new int[targetIndex];
        for (int i=0; i<targetIndex;i++){
            a[i]=0;
        }
        
        /* bruce force*/
        System.out.println("Bruce force fib started at:" + DateTime.now());
        System.out.println(fib_bf(targetIndex-1));
        System.out.println("Bruce force fib ended at:" + DateTime.now());
            
        /* dp fib*/
        System.out.println("DP fib started at:" + DateTime.now());
        System.out.println(dp_bf(targetIndex-1));
        System.out.println("DP fib ended at:" + DateTime.now());
        
        for (int i=0; i<targetIndex;i++){
            System.out.print(a[i]+ " ");
        }
        
    }
    
    public static int fib_bf(int i){
        if (i < 2){
            return 1;
        }else{
            return fib_bf(i-1)+fib_bf(i-2);
        }
    }
    
    public static int dp_bf(int i){
        if (a[i]!=0){
            return a[i];
        }else{
            if (i < 2){
                a[i]=1;
                return a[i];
            }else{
                a[i]= dp_bf(i-1)+dp_bf(i-2);
                return a[i];
            }
        }
    }
    
}
