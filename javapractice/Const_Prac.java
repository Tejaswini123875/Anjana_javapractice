package javapractice;

public class Const_Prac {

	 int i=5;
	
	  // constructor with no parameter
	  public Const_Prac() {
	   
	    System.out.println("Constructor is called");
	  }

	  public static void main(String[] args) {

	    // calling the constructor without any parameter
		  Const_Prac obj = new Const_Prac();
	    System.out.println("Value of i: " + obj.i);
	  }

}
