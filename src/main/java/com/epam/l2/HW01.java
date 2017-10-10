package com.epam.l2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW01 {

    public static void main(String[] args)  throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String param = reader.readLine();
        int value = Integer.parseInt(param);

        switch (value) {
            case 1 : {
                System.out.println("kisa sleeps 1");
                break;
            }
            case 2 : {
                System.out.println("kisa sleeps 2");
                break;
            }
            case 3 : {
                System.out.println("kisa sleeps 3");
                break;
                //if doesn't written "break", we will do the next steps until break
            }
            default: {
                System.out.println("kisa doesn't sleep");
                break;
            }

        }


    }

}
