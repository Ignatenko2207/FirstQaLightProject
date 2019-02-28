package ua.com.qalight.parent;

public class ApplicationRunnerInParent {

	public static void main(String[] args) {
		MyParentClass myParentClass = new MyParentClass();
		myParentClass.protectedString = "my custom string";
		
		MyChildClassInParent myChildClassInParent = new MyChildClassInParent();
		
	}
}
