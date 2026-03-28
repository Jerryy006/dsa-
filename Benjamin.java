import java.util.*;

public class Benjamin{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter space:");
        int n = sc.nextInt();
        
        for(int i = 1; i * i<=n; i++){
        System.out.println(i*i);
    }
}
}