import java.util.*;

public class oddnumbers{

    public static void main(String[]args){

        int low = 3; 
        int high = 8;
        int count = (high - low)/2;

        if(low % 2 == 1 || high % 2 == 1){
            count ++;
        }

        System.out.println(count);

    }
    }
