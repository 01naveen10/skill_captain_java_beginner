package Day6;

import java.util.Scanner;

public class SixthCode {
    public static void main (String[] args){
        for(int i=1;i<=10;i++){
            System.out.print(i+ " ");
        }
        System.out.println();
        int j=1;
        while (j<=20) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();
        int n;
        Scanner sc =new Scanner(System.in);
        do{

            System.out.print("enter a num between 1 to 10: ");
            n =sc.nextInt();
            if(n>=1 && n<=10){
                System.out.println("You entered : "+ n);
            }
        }while((n<1 )||( n >10));
    }
}
