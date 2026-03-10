import java.util.*;

public class gcd_lcm{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int original1 = n1;
        int original2 = n2;

        while(n1 % n2 != 0){

            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (n1 * n1)/ gcd;

        System.out.println(lcm);
        System.out.println(gcd);

    }
}