import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 Numbers:");
		for(int i=0;i<10;i++){
			arr[i]= sc.nextInt();
		}
		System.out.print("Unsorted Array:");
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+",");
		}
		
	//Bubble Sort
	for(int i=0;i<10-1;i++){
		for(int j=0;j<10-1-i;j++){
			if(arr[j]>arr[j+1]){
				int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	System.out.println("Sorted element are:");
	for(int i=0; i<10;i++){
		System.out.print(arr[i]+",");
	}
}
}