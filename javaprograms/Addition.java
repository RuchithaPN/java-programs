public class Addition {
	void sum(int a,int b) {  // method created with two parameters
		int c=a+b;
		System.out.println("Addition of a & b :" +c);
	}
	// Overloading method sum
	void sum(int a,int b,int c) {  // three parameters ... so overloading 'sum' method
		int d=a+b+c;
		System.out.println("Total of a b & c:" +d);
	}
	// Overloading by changing data types
	void sum(double dd,double ff) {
		double s=dd*ff;
    	System.out.println("Product of dd & ff:" +s);
	}
	
  
	public static void main(String[] args) {
		Addition ad=new Addition(); // object created 
		ad.sum(20, 20);// two arguments
		ad.sum(10, 20, 30);// three arguments
		ad.sum(299.9, 99.9);// two different parameters instead of int

	}

}
