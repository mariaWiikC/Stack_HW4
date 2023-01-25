package com.company;

import ibadts.Stack;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        int capacity = 3;
        IntStack test = new IntStack(capacity);

        System.out.println("The stack is empty: " + test.isEmpty());
        System.out.println("The stack is full: " + test.isFull());
        test.push(1);
        test.push(2);
        System.out.println("Deleted element: " + test.pop());

        test.push(8);
        test.push(5);
        System.out.println("The stack is empty: " + test.isEmpty());
        System.out.println("The stack is full: " + test.isFull());
        System.out.println(test);
    }
}

class IntStack
{
    int capacity;
    int[] stack;
    int counter = 0;

    public IntStack(int capacity)
    {
        this.capacity = capacity;
        stack = new int[capacity];
    }

    void push(int item)
    {
        stack[counter] = item;
        counter++;
    }

    int pop()
    {
        counter--;
        int popped = stack[counter];
        stack[counter] = 0;
        return popped;
    }

    boolean isEmpty()
    {
        if (counter == 0)
            return true;
        else
            return false;
    }

    boolean isFull()
    {
        if (counter == capacity)
            return true;
        else
            return false;
    }

    public String toString()
    {
        return Arrays.toString(stack);
    }
}