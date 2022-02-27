import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you want to enter");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
			
			//
			System.out.println("enter number");
			int num=sc.nextInt();
			if(num<0)
			{
				System.out.println("Wrong Input");
				break;
			}
			System.out.println(num);
		}

	}

}
