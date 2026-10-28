//1.Write a Java program to create two static methods (method1() and method2()) and two instance methods (method3() and method4()).
//Each method should print its own data.
//Call only one method inside the main() method and ensure that all four methods are executed and their data is printed.;
package first;

    

public class Testing {
	 static void method1() {
		 System.out.println("method1");
		method2();
		 
	 }
	 static void method2() {
		 System.out.println("method2");		
		 Testing t1= new Testing();
		 t1.method3();
	}
	 void method3() {
		 System.out.println("method3");
		 method4();
		 
	 }
	 void method4() {
		 System.out.println("method4");
	 }
public static void main(String[]args) {
	method1();
}

}

