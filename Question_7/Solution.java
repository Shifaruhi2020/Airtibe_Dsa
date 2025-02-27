
import java.util.Arrays;
import java.util.Scanner;

public class jump_Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int s = 0;

        if (sc.hasNextInt()) {
            s = sc.nextInt();   
        }

        int[] arr = new int[s];
        System.out.println("Enter elements of array");

        for(int i = 0; i < s; i++){

            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
            }
        }

        System.out.println("Array is:" + Arrays.toString(arr));
        sc.close();
        System.out.print(canjump(arr));

    }  

    static boolean canjump(int[] arr) {

        int final_position = arr.length - 1;

        for (int i = arr.length - 2; i >= 0; i--) {

            if(i + arr[i] >= final_position){
                final_position = i;
            }  
        }

            return final_position == 0;  
    }
}