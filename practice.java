/*find maximum of two inputs*/

import java.util.*;

public class practice{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println("the number" +a+ "is greater");
        }
        else{
            System.out.println("the number" +b+ "greater");
        }


    }
}