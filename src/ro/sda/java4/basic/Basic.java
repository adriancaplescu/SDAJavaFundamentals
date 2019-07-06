package ro.sda.java4.basic;

import java.text.DecimalFormat;

public class Basic{
    public static void main(String[] args) {
        double d=10.555445;
        long l=100L;

        for (int i=0;i<2;i++){
            System.out.println("hello, World!"+l);
        }

        System.out.printf("hello , world %.2f",d);

        DecimalFormat decimalFormat=new DecimalFormat(("#.###"));
        System.out.println(decimalFormat.format(d));

        System.out.println("String1");

        String s1="String1", s2="String2", s3="String3";

        String space="      ";
        System.out.println(s1+space+s2+space+s3);

        System.out.format("%-30s %-1s %-1s",s1,s2,s3);

        boolean flag=true;

        System.out.println("\nflag value="+String.format("%b",flag));







    }
}