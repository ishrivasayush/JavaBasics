package com.Narainox;
import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Lucky Number: ");
        int num1=scanner.nextInt();
        System.out.println("Your Lucky Number is: "+num1);
        System.out.println("Enter your Name: ");
        //String name=scanner.next();
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println("Your Lucky Number is: "+name);
    }
}
