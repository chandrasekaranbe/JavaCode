package com.Test2;

public class ReverseString {

    public static void main(String[] args){

        String str ="chandra";
        String reverse = reverseString(str);
        System.out.println(reverse);

        String reverse1= reverseString(str);
        System.out.println(reverse1);

            String ap = new StringBuilder(str).reverse().toString();

            System.out.println("******** " +ap);
    }

    private static String reverseString(String str) {

        char[] ch = str.toCharArray();
        int left =0;
        int right = str.length() -1;
        if(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++ ;
            right--;
        }
        return new String(ch);
    }

    public static String reverseWithLoop(String str) {

        StringBuilder bui = new StringBuilder();
        for (int i = str.length()-1 ; i >= 0 ; i --) {
            bui.append(str.charAt(i));
        }

        return bui.toString();
    }
}
