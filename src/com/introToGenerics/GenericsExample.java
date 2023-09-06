package com.introToGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args){

//        example without generics
        List names = new ArrayList();
        names.add("Kelly");
        String name = (String) names.get(0);
        System.out.println("First name: " + name);
//        names.add(7);

//        example with generics

        /* using generics allows us to avoid casting, which then allows our code to become safer, only allowing the data type specified  in <> to be stored to the arrayList.*/
        List<String> names2 = new ArrayList();
        names2.add("Kelly");
        String name2 = names2.get(0);
        System.out.println("First name " + name2);
//        names2.add(7);
    }
}
