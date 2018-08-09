package milestone;
import java.util.Scanner;
public class m11 {
	void sumeven(int n) {
		int sum=0;
		for(int i=2;i<n;i=i+2) {
			sum=sum+i;
			
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		new m11().sumeven(n);
	}

}
