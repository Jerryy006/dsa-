import java.util.*;

public class Lcm{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

       int lcm = (a*b) / Math.gcd(a,b);
        Syatem.out.println(lcm);
    }
}