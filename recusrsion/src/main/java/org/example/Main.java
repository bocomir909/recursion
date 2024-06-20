package org.example;

public class Main {

    public static void main(String[] args) {

        /*
        SumAlgorithm sumAlgorithm = new SumAlgorithm();
        System.out.println(sumAlgorithm.iteration(5));

        System.out.println(sumAlgorithm.recursion(5));
        */

        Recursion recursion = new Recursion();
        //recursion.headRecursion(5);
        //recursion.tailRecursion(5);
        //recursion.factHead(4);
        recursion.factTail(4,1);

        Factorial factorial = new Factorial();
        System.out.println(factorial.headRecursion(5));
        System.out.println(factorial.tailRecursion(5,1));

        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.head(10));
        System.out.println(fibonacci.tail(10,0,1));
    }
}