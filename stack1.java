package com;

import java.util.Arrays;
import java.util.Scanner;

public class stack1 {
    static int top = -1;
    static int top2 = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Stack = new int[n];
        int[] Stack2 = new int[n];
        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if (op == 1) {
                int ele = sc.nextInt();
                push(Stack, ele);
                if (top2 == -1 || Stack2[top2] > ele) {
                    push2(Stack2, ele);
                }
            } else if (op == 2) {
                int ele = pop(Stack, Stack2);
                System.out.println(ele);
            } else if (op == 3) {
                System.out.println(peek(Stack));
            } else if (op == 4) {
                System.out.println(getMin(Stack));
            }
        }
        System.out.print("[");
        for (int i = 0; i < Stack.length; i++) {
            if (Stack[i] == 0) break;   // stop at first zero
            System.out.print(Stack[i]);
            if (i < Stack.length - 1 && Stack[i + 1] != 0)
                System.out.print(",");
        }
        System.out.println("]");
    }

    public static void push2(int[] arr2, int ele) {
        ++top2;
        arr2[top2]=ele;
    }

    public static void push(int[] arr, int ele) {
        ++top;
        arr[top] = ele;
    }

    public static int pop(int[] arr, int[] arr2) {
        int ele = arr[top];
        if (ele == arr2[top2]) {
            --top2;
        }
        --top;
        return ele;
    }

    public static int peek(int[] arr) {
        return arr[top];
    }

    public static int getMin(int[] arr) {
        int ele = arr[top2];
        --top2;
        return ele;
    }
}
