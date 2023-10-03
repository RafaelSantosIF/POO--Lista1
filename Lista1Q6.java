import java.util.Scanner;

public class Lista1Q6{
    public static void Fatorial(int max){
        int fat = 1;
        for(int i = 1; i <= max; i++){
            fat = fat * i;
            System.out.println(i+"! - "+fat);
        }
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor Máximo: ");
        int num = sc.nextInt();
        Fatorial(num);
    }
}