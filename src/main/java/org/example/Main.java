package org.example;

public class Main {
    public static void main(String[] args) {

        String s="YASEENISHOTESTGUY";
        String p="YASEENISHOTESTGUY";

        boolean istrue=Istrue(s,p);

        if (istrue){
            System.out.println(s + "  And " + p +" Are equal" );
        }else {
            System.out.println(s + "  And " + p +" Are not equal" );
        }


        int a= 8;

        boolean primeTrue= PrimeNumber(a);

        if (primeTrue){
            System.out.println(a +" is Prime" );
        }else {
            System.out.println(a +" Is is not  Prime" );
        }


    }

    public static boolean Istrue(String s ,String p) {

        if (s == p) {
            return true;
        }

        if (s == null || p == null) {
            return false;
        }

        if (s.length() != p.length()) {
            return false;
        }

        for (int i=0; i<s.length();i++){
            if (s.charAt(i)!=p.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static boolean PrimeNumber(int a){
        if ( a <=1){
            return false;
        }


        for (int i =2; i * i <=a;i++){

            if (a % i==0){
                return false;
            }
        }
        return true;
    }
}