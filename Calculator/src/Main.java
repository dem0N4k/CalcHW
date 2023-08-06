import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1 = 0;
        double number2 = 0;
        double number3 = 0;
        char multiplication = '*';
        char division = '/';
        char addition = '+';
        char subtraction = '-';
        char equlMark = '=';

        System.out.println("Введите число: ");
        number1 = new Scanner(System.in).nextDouble();


        System.out.println("Что необходимо сделать?");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        if (ch == multiplication) {
            number3 = new Scanner(System.in).nextInt();
            System.out.println("Результат: " + (number1 * number3));
        } else if (ch == division) {
            number3 = new Scanner(System.in).nextInt();
            System.out.println("Результат: " + (number1 / number3));
        } else if (ch == addition) {
            number3 = new Scanner(System.in).nextInt();
            System.out.println("Результат: " + (number1 + number3));
        } else if (ch == subtraction) {
            number3 = new Scanner(System.in).nextInt();
            System.out.println("Результат: " + (number1 - number3));
        }
        System.out.println("the end");
    }
}
