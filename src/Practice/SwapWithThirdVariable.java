package Practice;

public class SwapWithThirdVariable {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int temp=0;
        System.out.println(x+"  "+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println(x+"  "+y);
    }
}
