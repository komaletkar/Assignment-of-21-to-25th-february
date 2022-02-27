
public class print_num_dimand_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int sp=n/2;
		int num=1;
		int count=1;
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=num;j++)
		{
			System.out.print(count);
		}
		if(i<=n/2)
		{
			sp--;
			num=num+2;
			count++;
		}
		else
		{
			sp++;
			num=num-2;
			count--;
		}
		System.out.println();
		}

	}

}
