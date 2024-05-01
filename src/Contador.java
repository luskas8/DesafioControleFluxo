import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstParameter = -1;
        int secondParameter = -1;
        try {
            System.out.println("Digite o primeiro parâmetro:");
            firstParameter = Utils.getInt(scanner);

            System.out.println("Digite o segundo parâmetro:");
            secondParameter = Utils.getInt(scanner);
        } catch (InputMismatchException e) {
            System.out.println("Parâmetros devem ser um inteiro.");
        } finally {
            scanner.close();
        }

        try {
            count(firstParameter, secondParameter);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void count(int a, int b) throws ParametrosInvalidosException {
        if (a > b) {
            throw new ParametrosInvalidosException();
        }

        int counter = b - a;
        for (int i = 1; i <= counter; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
