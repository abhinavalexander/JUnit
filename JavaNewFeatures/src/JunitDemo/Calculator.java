package JunitDemo;

public class Calculator {

	
		// TODO Auto-generated method stub
		public double add(double a,double b){
			return a+b;
		}
		public double subtract(double a,double b){
			return a-b;
		}
		public double multiply(double a,double b){
			return a*b;
		}
		public double divide(double a,double b){
			if(b==0){
				throw new ArithmeticException();
			}
			return a/b;
		}
public static void main(String[] args) {
	Calculator obj=new Calculator();
	
	double result=obj.add(20, 30);
	System.out.println(result);
}
}



