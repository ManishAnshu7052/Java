import java.util.Scanner;
class Main{
	static void sum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First No:");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second No:");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("The sum = " + sum);
	}
	public static void main(String args[]){
		sum();
	}
}