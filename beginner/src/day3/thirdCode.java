package day3;

import java.util.Scanner;

public class thirdCode {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Hello, " + name+ "! You are "+ age+ " years old.");
    }
}
