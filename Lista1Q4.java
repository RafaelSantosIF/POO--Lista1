import java.util.Scanner;

public class Lista1Q4{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = sc.nextInt();
        int ctdv = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                ctdv++;
            }
        }
        if(ctdv == 2){
            System.out.println("PRIMO!");
        } else {
            System.out.println("NÃO PRIMO!");
        }
    }
}