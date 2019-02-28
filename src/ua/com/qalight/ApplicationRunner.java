package ua.com.qalight;

import ua.com.qalight.child.MyChildClass;

public class ApplicationRunner {

	public static void main(String[] args) {
		MyChildClass myChildClass = new MyChildClass();
		
		MyMainChildClass myMainChildClass1 = new MyMainChildClass();
		myMainChildClass1.defaultStr = "default string";	
		
		MyMainChildClass myMainChildClass2 = new MyMainChildClass("param 1", "param 2");
//		System.out.println(myMainChildClass2.publicString);
//		System.out.println(myMainChildClass2.defaultStr);
//		System.out.println(myMainChildClass2.protectedStr);
		
		MyMainChildClass myMainChildClass3 = new MyMainChildClass("param 1", "param 2");

		User user1 = new User();
		user1.setLogin("ignatenko2207");

		User user2 = new User();
		user2.setLogin("ignatenko2207");

		System.out.println(user1.equals(user2));
		
		
	}
}
