package Practice;

import java.util.Scanner;

public class ReadCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String  s= scanner.next();
        char ch=s.charAt(0);
        System.out.println(ch);
    }
}
