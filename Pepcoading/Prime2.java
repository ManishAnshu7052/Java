import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lower Number:");
		int low = sc.nextInt();
		System.out.print("Enter the higher Number:");
		int high = sc.nextInt();
		
		for(int n=low; n<=high; n++){
			int count = 0;
			//Try to divide n and increase count
			for(int div = 2; div*div<=n; div++){
				if(n%div==0){
					count++;
					break;
				}
				
			}
			if(count == 0){
				System.out.println(n);
			}
		}
		
	}
}