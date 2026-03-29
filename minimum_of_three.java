import java.util.*;

public class minimum_of_three{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<b && a<c){
            System.out.println("the number" +a+ "is minimum.");
        }
        else if(b<a && b<c){
            System.out.println("the number" +b+ "is minimum.");
        }
        else{
            System.out.println("the number" +c+ "is minimum.");
        }

    }
}