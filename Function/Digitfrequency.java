import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();
		System.out.print("Enter the find digit:");
		int d = sc.nextInt();
		int f = getDigitFrequency(n,d);
		System.out.println(f);
	}
	public static int getDigitFrequency(int n,int d){
		int rv = 0;
		while(n>0){
			int dig = n%10;
			n = n/10;
			if(dig==d){
				rv++;
			}
		}
		return rv;
	}
}