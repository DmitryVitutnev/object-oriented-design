package ru.omsu.imit;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();

        for(Integer i : stack) {
            System.out.println(i);
        }


    }


}
