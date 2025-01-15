package labrab_prog_urfu;
import java.util.Scanner;
public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какой сегодня день: ");
        int R = in.nextInt();
        System.out.println("Какой сегодня месяц: ");
        int E = in.nextInt();
        System.out.println("Какой сегодня год: ");
        int W = in.nextInt();
        System.out.println("Сегодня: "+ R+". "+E+". "+W+" ");
        in.close();
    }
}