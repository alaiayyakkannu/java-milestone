package milestone;
import java.util.Scanner;
public class m7 {
	void findleast(int arr[]) {
		int min = arr[0];
		for (int i=0;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
		}
		if(min==0)
			System.out.println(min);
		else
			System.out.println(min-1);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 6 numbers");
		Scanner sc=new Scanner(System.in);
		int [] arr= new int[6];
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		m7 a=new m7();
		a.findleast(arr);
	}

}
