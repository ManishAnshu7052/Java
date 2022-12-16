import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value a:");
		int a = sc.nextInt();
		System.out.print("Enter the value b:");
		int b = sc.nextInt();
		
		int t;
		 t=a;
		 a=b;
		 b=t;
		 
		 System.out.println("a=" +a);
		 System.out.println("b=" +b);
		
	}
}