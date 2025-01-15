package labrab_prog_urfu;
import java.util.Scanner;
public class example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию: ");
        String F = in.nextLine();
        System.out.println("Введите Имя: ");
        String I = in.nextLine();
        System.out.println("Введите Отчество: ");
        String O = in.nextLine();
        System.out.println("Привет, " + F + " "+ I + " " + O + " ");
        in.close();
    }
}