//Day-67
//Conversion Programs
//Java Convert int to String
class ConversionProgram2{
	public static void main(String[] args) {
		int i = 200;
		String s=String.valueOf(i);//Convert int to String
		System.out.println(i+100);
		System.out.println(s+100);//200100 because + is string concatenation operator  
	}
}
/*
OUTPUT
300
200100
*/