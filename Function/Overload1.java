class Main{
	static int plusMethdInt(int x, int y){
		return x+y;
	}
	static double plusMethodDouble(double x, double y){
		return x+y;
	}
	public static void main(String args[]){
		int myNum1 = plusMethdInt(45,12);
		double myNum2 = plusMethodDouble(21.23,12.89);
		System.out.println(myNum1);
		System.out.println(myNum2);
	}
}