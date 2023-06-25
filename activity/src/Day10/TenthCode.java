package Day10;

import java.util.HashSet;
import java.util.Scanner;

public class TenthCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> mySet = new HashSet<>();
        int n=0;
        while(n!=99999){
            System.out.println("Enter num to check :");
            n = sc.nextInt();
            if(mySet.contains(n)){
                System.out.println("duplicate");
            }else {
                mySet.add(n);
                System.out.println("unique");
            }
        };

    }
}
