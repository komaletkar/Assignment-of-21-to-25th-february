
public class dimandPyramid {

	public static void main(String[] args) {
		int n = 5;
		int sp = n / 2;
		int star = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}

			if (i <= n / 2) {
				sp--;
				star += 2;
			} else {
				sp++;
				star -= 2;
			}
			System.out.println();
		}

	}

}
