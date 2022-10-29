package Practice;

import java.util.Scanner;

public class StudentInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String fname= scanner.next();
        String lname= scanner.next();
        int rollNumber= scanner.nextInt();
        String fieldOfInterest= scanner.next();
        System.out.println("Name: "+fname+" "+lname);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Field of interest: "+fieldOfInterest);
    }
}
