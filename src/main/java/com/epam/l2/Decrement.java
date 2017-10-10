package com.epam.l2;

/**
 * Created by student on 03/10/17.
 */
public class Decrement {
    public static void main(String[] args) {
        Decrement decrement = new Decrement();
        System.out.println(decrement.getNewCouny(2));
        System.out.println(decrement.isEven(3));
    }

    private  int getNewCouny(int count) {

        //return count++; ostanetsy 2
        return ++count; // budet 3

    }

    private  boolean isEven(int count) { //vozvrashaet true/false chetnoe/ne chetnoe
        return count % 2 == 0;
    }
}
