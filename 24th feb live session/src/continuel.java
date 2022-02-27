import java.util.Scanner;

public class continuel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you want to enter");
		int n = sc.nextInt();
		
		 for (int i=0;i<=n;i++) {
		for(int j=0;j<=i;j++) {
		if((i+j )%3 == 0) {
		continue;
		
		}
		System. out. println(i+j);
		}
		}
	}

}
