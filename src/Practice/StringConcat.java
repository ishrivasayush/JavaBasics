package Practice;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine())
        {
            String a=scanner.next();
            String b=scanner.next();
            System.out.println(a+b);
        }
    }
}
