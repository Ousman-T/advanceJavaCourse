package com.introToGenerics;
import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    /* Using generic methods in order to ensure safety of our code. Making sure that all items added to the array or list are all of the same type using generic method*/
    static Character[] charArray = {'h', 'i', 'j', 'k', 'l'};
    static Integer[] intArray = {1,2,3,4,5};
    static Boolean[] boolArray = {true, false, true, false};

    public static<T> List<T> arrayToList(T[] array, List<T> list){
        for (T object : array){
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
    }
}
