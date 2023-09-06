package com.introToGenerics;

public class VarArgs {
    /* Instead of hard coding in a specific number of items to add. Use ... after the data type in order to allow as many as needed to be added to the array, don't NEED to pass an array only, we can pass the raw strings*/
    public static void main(String[] args){
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Peaches";
        String[] items = {item1, item2, item3};
        printShoppingList(item1, item2, item3);
    }
    private static void printShoppingList(String... items){
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++){
            System.out.println(i + 1 + ": " + items[i]);
        }
    }
}
