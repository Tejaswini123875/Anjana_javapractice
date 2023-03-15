package javapractice;

public class ParaConstructor {
    
	
	String languages;

	  // constructor accepting single value
	    ParaConstructor(String lang) {
	    languages = lang;
	    System.out.println(languages + " Programming Language");
	  }

	  public static void main(String[] args) {

	    // call constructor by passing a single value
		  ParaConstructor obj1 = new ParaConstructor("Java");
		  ParaConstructor obj2 = new ParaConstructor("Python");
	      ParaConstructor obj3 = new ParaConstructor("C");
	  }

}
