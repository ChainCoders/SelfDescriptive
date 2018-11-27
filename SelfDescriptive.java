/*
 * To change this license header, choose License Headers in Project Properties.
 * To change39 this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfdescriptive;

import java.lang.*;
import java.util.Scanner;

/**
 *
 * @author Divyang
 */
public class SelfDescriptive {

    /**
     * @param args the command line arguments
     */
     
    // TODO code application logic here
    static int found = 0;
    static int base;

    public static void main(String[] args) {
        long start = 0, end = 0;
        Scanner in = new Scanner(System.in);
        print("enter the base");
        base = in.nextInt();
        start = System.nanoTime();
        if (String.valueOf(base).matches("1|2|3|6")) {
            print("sorry no self-descriptive number exist for the given base");
        } else {
            
            StringBuffer s;
            s = new StringBuffer();
            switch (base) {// logic for generate the number 
                case 4:
                    s.append("1210 , 2020");//manually enter the value of base of 4.
                    break;
                case 5:
                    s.append("21200");//manually enter the value of base of 5.
                    break;
                case 7:
                    s.append(String.valueOf(base - 4));//in self descriptive number the first letter is (base-4).
                    s.append("21");//second letter is 2 and third letter is 3 it's happen every time.
                    s.append("1000");//last 4 letter is alwase 1000 in self descriptive number.
                    break;

                default:
                    s.append(givehexa(base - 4));//in self descriptive number the first letter is (base-4).
                    s.append("21");//second letter is 2 and third letter is 3 it's happen every time.
                    s.append(getzerostring(base));//in self descriptive number lettre 4 to base4 all are zero. so it's function to append zeros.
                    s.append("1000");//last 4 letter is alwase 1000 in self descriptive number.
                    break;
            }
            end = System.nanoTime();
            print("self Descriptive no of base " + base + " is " + s);
            print("Time taken by the system is "+(end-start)+" ns.");
        }

    }

    private static void print(String str) {
        System.out.println(str);
    }

    private static String getzerostring(int base) {

        String str = "";

        for (int i = 0; i < base - 7; i++) {
            str = str + "0";
        }

        return str;
    }
    private static String givehexa(int value)//return first digit of the number.
    {
            
    String ans=null;
   if(value<10)
   {
   ans =String.valueOf(value);
   }
   else if (value>34)// generete the first letter as a one letter. 
   {
       ans =String.valueOf(value);
       ans=ans+" ";
   
   }
   else // after the 10 we can use alphabet like A = 10, B= 11. 
   {
   int temp= 65 - 10 + value ;
   ans = String.valueOf((char)temp);
   }
    return ans;
    }
}
