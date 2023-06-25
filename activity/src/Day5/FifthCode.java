package Day5;

import java.util.Scanner;

public class FifthCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first_number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second_number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operation(+, -, *, /): ");
        String op = sc.next();
        char ch = op.charAt(0);
        int result;
        switch (ch){
            case '+' :
                result = num1+ num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                result =0;
                System.out.println("invalid operation. Try again");
        }
        System.out.println("result : "+ result);


    }
}
