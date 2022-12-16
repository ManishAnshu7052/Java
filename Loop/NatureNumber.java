import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n value:");
		int n = sc.nextInt();
		
		do{
			System.out.print(n+ " ");
			n++;
		}
		while(n<=10);
	}
}