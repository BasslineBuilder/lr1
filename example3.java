package labrab_prog_urfu;
import java.util.Scanner;
public class example3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название текущего дня недели: ");
        String dayOfWeek = scanner.nextLine();
        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();
        System.out.print("Введите номер дня в месяце: ");
        int dayOfMonth = scanner.nextInt();
        if (dayOfMonth < 1 || dayOfMonth > 31) {
            System.out.println("Ошибка: номер дня от 1 до 31.");
        } else {
            String message = String.format("Сегодня: %s, %d %s", dayOfWeek, dayOfMonth, month);
            System.out.println(message);
        }
        scanner.close();
	}
}