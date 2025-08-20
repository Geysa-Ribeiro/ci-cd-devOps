import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        int resultado = Calculadora.Multiplicar(numero1, numero2);
        System.out.println("Resultado = " + resultado);



        scanner.close();
    }
}
