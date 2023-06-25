package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class EighthCode {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("Choose the operation you want to perform \n 1.add \n 2.remove \n 3.check duplicate \n 4.clear entire grocery list \n 5.exit");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter item to be added to list: ");
                    String item = sc.next();
                    groceryList.add(item);
                    break;
                case 2:
                    System.out.println("Enter index to be removed");
                    int ind =sc.nextInt();
                    sc.nextLine();
                    groceryList.remove(ind);
                    break;
                case 3:
                    System.out.println("Enter item to be checked: ");
                    String check = sc.next();
                    boolean validity = groceryList.contains(check);
                    System.out.println(validity);
                    break;
                case 4:
                    groceryList.clear();
                    break;
            }
        }while(op!= 5);

    }
}
