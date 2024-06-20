package org.example;

public class Factorial {

    public int headRecursion(int n){
        //base case
        if(n==1){
            return 1;
        }
        //first we call recursion
        int res1 = headRecursion(n-1);

        //then we do logic
        int result = n*res1;

        return result;
    }


    public int tailRecursion(int n,int acc){
        //base case
        if(n==1){
            return acc;
        }
        //do logic
        //then call recursion
        return tailRecursion(n-1,n*acc);
    }
}
