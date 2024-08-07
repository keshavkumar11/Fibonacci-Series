import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number:- ");
        int n=input.nextInt();

        int first=0;
        int second=1;
        System.out.format("%d %d ",first,second);
        int third=0;
        for (int i=3;i<=n;i++)
        {
            third=first+second;
            System.out.format("%d ",third);
            first=second;
            second=third;
        }
    }
}
