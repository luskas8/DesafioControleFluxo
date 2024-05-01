import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    static int getInt(Scanner scanner) throws InputMismatchException {
        int result = -1;

        try {
            result = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.fillInStackTrace();
        } finally {
            scanner.nextLine();
        }

        return result;
    }
}
