import java.util.Scanner;

public class Lista1Q8{
    public static void Tabela(int max){
        for(int i = 1; i <= max; i++){
            System.out.println();
            Tabela(max-1);
            System.out.print(max * i);
            System.out.print(" ");
        }
    }
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        System.out.println("Valor Máximo: ");
        int maximo = input.nextInt();
        Tabela(maximo);
    }
}