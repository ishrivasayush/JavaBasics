package Practice;

import java.util.Scanner;

public class SwapWithOutUsingThirdVariable {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println(x+" "+y);
        x=x+y; //30
        y=x-y; //10
        x=x-y; //20
        System.out.println(x+" "+y);
    }
}
