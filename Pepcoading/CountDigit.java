import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the degits:");
		int n = sc.nextInt();
		
		int dig = 0;
		while(n!=0){
			n=n/10;
			dig++;
		}
		System.out.println(dig);
	}
}