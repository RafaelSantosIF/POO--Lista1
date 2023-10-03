import java.util.Scanner;

public class Lista1Q7{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int num = sc.nextInt();
        while(num != 1){
            if(num % 2 == 0){
                num = num/2;
                System.out.println(num);
            } else {
                num = 3 * num + 1;
                System.out.println(num);
            }
        }
    }
}