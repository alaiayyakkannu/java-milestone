package milestone;
import java.util.Scanner;
public class m12 {
	void generatefibonacci(int x){
        int a=0;
        int b=1,c;

		System.out.println(a+"\n");
		while(x>0){
			System.out.println(b+"\n");
			c=b;
			b=a+b;
			a=c;
			x--;
            	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		m12 a=new m12();
		System.out.println("Enter 2");
		int y=sc.nextInt();
		a.generatefibonacci(y);
		sc.close();
	}

}
