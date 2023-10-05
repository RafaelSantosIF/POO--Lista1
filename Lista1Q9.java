import java.util.Scanner;

public class Lista1Q9{
    public static double aumento(int salario){
        if (salario <= 280){
            return 0.2;
        } else if (salario > 280 && salario <= 700){
            return 0.15;
        } else if (salario > 700 && salario <= 1500){
            return 0.1;
        } else {
            return 0.05;
        }
    }
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        System.out.println("Salário: ");
        int valor = input.nextInt();

        System.out.println("salário antes do reajuste: "+valor);
        System.out.println("percentual de aumento aplicado: "+aumento(valor));
        System.out.println("valor do aumento: "+(valor * aumento(valor)));
        System.out.println("novo salário, após o aumento: "+ (valor + (valor * aumento(valor))));

    }
}