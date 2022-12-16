import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number:");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
			 arr[i]=sc.nextInt();
		}
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("Minimum number is:"+min);
	}
}