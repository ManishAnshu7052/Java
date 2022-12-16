import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the a:");
		int a = sc.nextInt();
		System.out.print("Enter the b:");
		int b = sc.nextInt();
		System.out.print(a+ " " +b);
		int c=0;
		for(int i=1; i<=10; i++){
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
		}
	}
}