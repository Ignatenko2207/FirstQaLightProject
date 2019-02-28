package ua.com.qalight;

import ua.com.qalight.parent.MyParentClass;

public class MyMainChildClass extends MyParentClass{

	String defaultStr;
	protected String protectedStr;
	
	
	
	public MyMainChildClass() {
	}
	
	public MyMainChildClass(String defaultStr, String protectedStr) {
		super.protectedString = "protectedString in parent";
		super.publicString = "publicString in parent";
		this.defaultStr = defaultStr;
		this.protectedStr = protectedStr;
	}
	
	public MyMainChildClass(String defaultStr, String protectedStr, String protectedString, String publicString) {
		super.protectedString = protectedString;
		super.publicString = publicString;
		this.defaultStr = defaultStr;
		this.protectedStr = protectedStr;
	}
}
