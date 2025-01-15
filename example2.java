package labrab_prog_urfu;
import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Имя: ");
        String I = in.nextLine();
        System.out.println("Введите ваш возраст: ");
        int E = in.nextInt();
        System.out.println("Ваши данные, "+ I + " " + E + " ");
        in.close();
    }
}