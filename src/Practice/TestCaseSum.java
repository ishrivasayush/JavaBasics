package Practice;

import java.util.Scanner;

public class TestCaseSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++)
        {
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();
            int sum=0;
            sum=num1+num2;
            System.out.println(sum);
        }
    }
}
