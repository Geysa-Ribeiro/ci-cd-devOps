public class CalculadoraTest {
    public static void main(String[] args) {
        int resultado = Calculadora.Multiplicar(5, 8);
        Calculadora.Multiplicar(6,20);

        if (resultado == 40) {
            System.out.println("O teste funcionou!");
        }
        else {
            System.out.println("O teste falhou!");
        }
    }
}
