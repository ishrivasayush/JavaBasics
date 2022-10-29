package Practice;

import java.util.Scanner;

public class MarksPercentage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int marks1=scanner.nextInt();
        int marks2=scanner.nextInt();
        int marks3=scanner.nextInt();

        int sum=marks1+marks2+marks3;

        System.out.println("Total marks: "+sum);
        int percentage=(sum*100)/300;
        System.out.println("Percentage marks: "+percentage+"%");
    }
}
