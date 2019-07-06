package ro.sda.java4.basic;

import java.util.Scanner;

public class BasicsEx6 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.println("enter the float value:");
        float floatValue=scanner.nextFloat();
        System.out.println("enter byte value:");
        byte byteValue=scanner.nextByte();
        System.out.println("enter char value:");
        char charValue=scanner.next().charAt(0);

        System.out.println("flatvalue:"+floatValue);
        System.out.println("byteValue:"+byteValue);
        System.out.println("charValue"+charValue);


    }
}
