package com;

import java.util.Scanner;

class Sum{
//    int a;
//    Sum(int a, int b){
//        System.out.printf("com.Sum of %d and %d is %d\n", a, b, a+b);
//    }
    void print(){
        System.out.println("hello");
    }
}
class Product{
    void product(int a, int b){
        System.out.println("com.Product of "+a+" and "+b +" is "+(a*b) );
    }

}

class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println(new Sum());
        new Sum().print();
        Product p = new Product();
        p.product(a,b);
        System.out.println("hello");
    }
}

