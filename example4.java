package labrab_prog_urfu;
import java.util.Scanner;
public class example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите месяц: ");
        String F = in.nextLine();
        System.out.println("Укажите сколько в нем дней: ");
        int E = in.nextInt();
        System.out.println("В "+ F +" "+E+" дней");
        in.close();
    }
}