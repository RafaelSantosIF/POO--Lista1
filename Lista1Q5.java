import java.util.Scanner;

public class Lista1Q5{
    public static void Fibonacci(int max){
        int a = 0;
        int b = 1;
        int aux = b;

        System.out.println(a);
        System.out.println(b);
        for(int i = 1; i <= 100; i++){
            b = b + a;
            a = aux;
            aux = b;
             if(b >= max){
                break;
            }
            System.out.println(b);
        }
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor Máximo: ");
        int num = sc.nextInt();
        Fibonacci(num);
    }
}