package ro.sda.java4.basic;

import java.text.DecimalFormat;

public class BasicsEx4 {
    public static void main(String[] args) {
        int value1=100, value2=7;
        double result=(double)value1/value2;
        double resultRounded=Math.round(result);


        System.out.println("result="+result);
        DecimalFormat decimalFormat=new DecimalFormat("#.###");
        System.out.println("result ronded:"+decimalFormat.format(result));
        System.out.println("result rounded="+resultRounded);
    }
}
