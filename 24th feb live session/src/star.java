
public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int sp=n/2;
		int st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=st;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			if(i<=n/2)
			{
				sp--;
				st += 1;
			}
			else
			{
				sp++;
				st -= 1;
			}
			System.out.println();
		}

	}

}
