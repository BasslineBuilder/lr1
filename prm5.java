package labrab_prog_urfu;
import java.util.Scanner;
public class prm5 {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        System.out.println("Input name: ");
	        String name = in.nextLine();

	        System.out.println("Input age: ");
	        int age = in.nextInt();

	        System.out.println("Input height: ");
	        float height = in.nextFloat();

	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Height: " + height);
	        in.close();
	    }
}
