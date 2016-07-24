import java.util.Scanner;


public class revdigits {
	public static void main(String[] args) {
		int n,a,sum=0;;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0)
		{
			a=n%10;
			n=n/10;
			sum=sum*10+a;
		}
		System.out.println(sum);
	}

}
