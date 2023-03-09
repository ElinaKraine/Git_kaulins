import java.util.Random;
import java.util.Scanner;

public class Cirks {

	public static void main(String[] args) {
		int skaitlis, reizes;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Cik reizes mest kauliņu? ");
		reizes = scan.nextInt();
		scan.close();
		for(int i=1; i<=reizes; i++){
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
		}

	}

}
