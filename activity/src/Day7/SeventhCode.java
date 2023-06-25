package Day7;
import java.util.Scanner;
public class SeventhCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0, avg, max = Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for (int x: arr){
            sum += x;
            if(x>max){
                max =x;
            }
            if(x<min){
                min =x;
            }
        }
        avg = sum/arr.length;
        System.out.println("Sum: "+ sum +"\n Avg: "+ avg + "\n max: "+max+ "\n min: "+ min);

    }
}
