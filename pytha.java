import java.util.*;

public class pytha{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //find max
        int max = Math.max(a, Math.max(b,c));

        //find sum
        int sum = a*a + b*b + c*c - max*max;

        //print the max
        System.out.println(sum == max*max);
    }
}