package com.tcc.java.programs;
import java.util.Scanner;
public class Twostrings {
    public static void main(String arg[]) {
        String str1, str2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String");
        str1 = scanner.nextLine();
        System.out.println("Enter Second String");
        str2 = scanner.nextLine();
        if (str1.equals(str2))
            System.out.println("Equal strings");
        else
            System.out.println("UnEqual Strings");
    }
}





