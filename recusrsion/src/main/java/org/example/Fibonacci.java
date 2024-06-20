package org.example;

public class Fibonacci {

    public int head(int n){
        //base case
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        //call recursions till you get to base cases
        int fib1 = head(n-1);
        int fib2 = head(n-2);

        //then do logic
        int result = fib1+fib2;

        return result;
    }

    //tail(10,0,1)
    public int tail(int n,int a,int b){
        if(n==0){
            return a;
        }

        return tail(n-1,b,a+b);
    }
}


