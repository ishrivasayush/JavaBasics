package Practice;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float p=scanner.nextFloat();
        float r=scanner.nextFloat();
        float t=scanner.nextFloat();

        float si=(p*r*t)/100;
        System.out.println("The Simple interest is: "+si);
    }
}
