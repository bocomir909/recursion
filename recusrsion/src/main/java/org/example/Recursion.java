package org.example;

public class Recursion {

    public void headRecursion(int n){
        //has backtracking!
        System.out.printf("Calling the function with n="+n+"\n");

        if(n==0) return;

        headRecursion(n-1);

        System.out.println("The value n="+n);
    }

    public void tailRecursion(int n){
        //no backtracking!
        System.out.printf("Calling the function with n="+n+"\n");

        if(n==0) return;

        System.out.println("The value n="+n);

        tailRecursion(n-1);
    }


    public int factHead(int n){
        //has backtracking!
        if(n == 0){
            System.out.println("Base case");
            return 1;
        }

        System.out.println("Before recursion res="+n);

        int result = n * factHead(n-1);

        System.out.println("After recursion res="+result);
        return result;
    }

    public int factTail(int n,int acc){
        //no backtracking!
        if(n == 0){
            System.out.println("Base case");
            return acc;
        }

        System.out.println("Before recursion res="+n);
        int result = factTail(n-1,n*acc);
        System.out.println("After recursion res="+result);
        return  result;
    }

}
