package org.example;

public class SumAlgorithm {

    public int iteration(int n){
        int result = 0;

        for(int num = 1;num<=n;num++){
            result+= num;
        }

        return result;
    }

    public int recursion(int n){
        //base case. When to terminate the algorithm (no need to call the method recursively)
        if(n == 0){
            return 0;
        }

        return n + recursion(n-1);
    }
}
