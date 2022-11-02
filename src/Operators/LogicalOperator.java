package Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int p=10;
        int q=20;
        if (p<q && p>=q)
        {
            System.out.println("q is big");
        }
        if ((p<q || p>=q))
        {
            System.out.println("Not good");
        }
        if (!(p==q))
        {
            System.out.println("Hey");
        }
    }
}
