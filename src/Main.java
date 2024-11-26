import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите число: ");
        int number2 = new Scanner(System.in).nextInt();
        int sum = number1 + number2;
        int difference = number1 - number2;
        int c = number1 * number2;
        double quotient = (double) number1 / number2;
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + c);
        System.out.println("Частное: " + quotient);
    }
}