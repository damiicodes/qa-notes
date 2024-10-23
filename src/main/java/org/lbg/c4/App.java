package org.lbg.c4;


import java.io.IOException;

/**
 * Hello world!
 */
//public class App {
//    public static void main(String[] args) {
//
//       int counter = 0;
//
//       try {
//
//           while (System.in.read() != -1)
//               counter++;
//
//           System.out.println("No of chars" + counter);
//
//
//       }catch(IOException e)
//
//       { System.out.println(e);
//    }
//}




public class App {
    public static void main(String[] args) {
        int counter = 0;

        try {
            while (System.in.read() != -1) {
                counter++;
            }
            System.out.println("Number of characters read: " + counter);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


