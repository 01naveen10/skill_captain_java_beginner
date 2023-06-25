package Day4;

import java.util.Scanner;

public class FourthCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1+ " is bigger");
        }else{
            System.out.println(num2+ " is bigger");
        }

    }
}
