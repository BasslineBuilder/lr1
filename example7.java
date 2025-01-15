package labrab_prog_urfu;
import java.util.Scanner;
public class example7 {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Сколько вам лет:");
	        int E = in.nextInt();
	        int R = 2024-E ;
	        System.out.println("Вы "+R+" года рождения");
	        in.close();
	    }
	}