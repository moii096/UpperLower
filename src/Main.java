import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int[] list= {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        System.out.println("Sorted array = "+ Arrays.toString(list));
        System.out.print("Plase input a number = ");
        int number = scan.nextInt();
        for(int i=0 ; i< list.length; i++){
            if(number >= list[i]  &&   number <= list[i+1]){
                System.out.println("The lower number is = " +list[i]);
                System.out.println("The upper number is =" +list[i+1]);
                break ;
            }
        }

    }
}