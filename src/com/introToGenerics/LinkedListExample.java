package com.introToGenerics;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args){
        LinkedList<String> myList = new LinkedList();
        myList.add("A");
        myList.add("B");
//        adding to specific index
        myList.add(1, "C");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);
    }
}
