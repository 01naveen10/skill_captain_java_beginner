package Day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NinthCode {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the paragraph to read from : ");
        String para = sc.nextLine();
        HashMap<String,Integer>counter= new HashMap<>();

        String[] arr= para.split(" ");

        for(int i=0;i<arr.length;i++){
            if(counter.containsKey(arr[i])){
                int val =counter.get(arr[i]);
                counter.put(arr[i],val+1);
            }else{
                counter.put(arr[i],1);
            }
        }

        for(Map.Entry<String,Integer> m : counter.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

    }
}
