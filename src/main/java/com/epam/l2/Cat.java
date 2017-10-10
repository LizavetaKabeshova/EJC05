package com.epam.l2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;

/**
 * Created by student on 05/10/17.
 */
public final class Cat {
    private static  String COUNT = "JACK";
    private static int count;

    public static void main(String[] args) {

        String name = "Barsik";
        System.out.println(name.hashCode());

    }


 /*
    public static void main(String[] args) throws IOExc
    eption {

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
*/


    /*
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String param = reader.readLine();
        int value = Integer.parseInt(param);

        if (value > 0 && value < 24) {
            for (int i = 0; i < value; i++) {
                System.out.println("kisa sleeps " + value );
            }
        }
    }
    */


    /*public final String getCat() {
            StringBuilder builder = new StringBuilder();
            String newCount = builder.append("Jzck").append("Vorobey").toString();
            // COUNT = "Vorobey"  - can't change final peremennay
            COUNT = COUNT + "Vorobey";
            return "Musik";
        }
    */

    /*public static void main(String[] args) {
       while (true) {
           System.out.println(count);
            count++;
           if (count == 10) {
               break;
           }

       }
    }
    */


}
