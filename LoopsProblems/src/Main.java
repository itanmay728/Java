import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        int count = 0;
//        for (int n = sc.nextInt(); n>0 ; n /= 10 , count++){
//
//        }
//        System.out.println(count);


        int n = sc.nextInt();
        int count = 0;

         while (n>0){
             n/=10;
             count++;
         }
        System.out.println(count);
    }
}