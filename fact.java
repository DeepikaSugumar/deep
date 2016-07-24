import java.util.Scanner;


public class factorial {

	public static void main(String[] args) {
		int i,n,fact=1;
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
