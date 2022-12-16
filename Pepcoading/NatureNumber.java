import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of N:");
		int N = sc.nextInt();
		
		/*while(N<=9){
			System.out.println(N+" ");
			N++;
		}*/
		for( N=0;N<=9;N++){
			System.out.println(N);
		}
		System.out.println("Done..");
		
	}
}