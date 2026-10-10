package org.example;

import java.util.*;

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

        int[] arr={1,2,3,4,5,6,7,8,9,10};

        reverseArray(arr);

        System.out.println(Arrays.toString(arr));


//        Check if a string is a palindrome

        String palindromeTest="mom";

        boolean palindrome=palindrome(palindromeTest);

        if (palindrome){
            System.out.println(palindromeTest +" is Palindrome" );
        }else {
            System.out.println(palindromeTest+"  is not Palindrome" );
        }

//        Reverse a string without reverse()

        String reverse="iamback";

        String reverseString=reverseString(reverse);

        System.out.println(reverseString);

//        Count the frequency of each character in a string

        String frequency="yaseenPatel";

        HashMap<Character,Integer> hashMap=new HashMap<>();

        hashMap=hashmap(frequency);

        System.out.println(hashMap);

//        Find the first non-repeating character in a string



//        Check if two strings are anagrams

//        Remove duplicate characters from a string preserving order

        String removeDublicaate="ilikeyou";

        char[] removedub=removeDublicaate.toCharArray();

        HashSet<Character> hashSet=new LinkedHashSet<>();

        for (Character fre: removedub){
            hashSet.add(fre);
        }

        String printReverse=hashSet.toString();

        System.out.println(printReverse);

//        Check if a String is a Palindrome (Without Built-in Helpers)

        String palendromeCheck="amanaplanacanalpanama";

        boolean ispalendromeCheck=palindromeCheck(palendromeCheck);


        if (ispalendromeCheck){
            System.out.println(palendromeCheck +" is Palindrome" );
        }else {
            System.out.println(palendromeCheck+"  is not Palindrome" );
        }

    }

    public static boolean palindromeCheck(String s){
        if (s==null || s.isEmpty()){
            return false;
        }

        if (s.length()==1){
            return true;
        }

        char[] arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;

        while (left<right){
         if (arr[right]!=arr[left]){
             return false;
         }
         left++;
         right--;
        }
        return true;
    }

    public static HashMap<Character,Integer> hashmap(String s){
        char[] character=s.toCharArray();
        HashMap<Character, Integer> hashMap=new HashMap<>();
        if (s==null){
         return null;
        }

        for (Character a : character){
            hashMap.put(a, hashMap.getOrDefault(a,0)+1);
        }

        return hashMap;
    }
    public static String reverseString(String s){
        if (s==null || s.isEmpty()){
            return null;
        }

        if (s.length()<=1){
            return s;
        }

        char[] arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;

        while (left<right){
            char temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;

            right--;
            left++;

        }

        return new String(arr);
    }

    public static boolean palindrome(String s){

        if ( s==null || s.isEmpty() ){
            return false;
        }

        if(s.length()<=1){
            return false;
        }

        int left=0;
        int right=s.length()-1;


        while (left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;


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


    public static int[] reverseArray(int[] arr){
        if (arr.length<=0){
            return new int[0];
        }

        int left =0;
        int right=arr.length-1;

        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;

        }


        return arr;
    }


}