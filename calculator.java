package utility;

import org.testng.annotations.Test;

public class calculator {
	@Test
	
public void performCalculation() {
	System.out.println("Welcome to the Calculator app");
	int num1=5;
	int num2=6;
	int num3=10;
	String operation ="-";
	int result =0;
	switch (operation) {
	case"+":
		System.out.println("addtion being performed");
		result= num1+num2;
		result= num1+num3;
		break;
	case"-":
		System.out.println("substration being performed");
		result= num1-num2;
		result= num1-num3;
		break;
	case"*":
		System.out.println("multiplication being performed");
		result= num1*num2;
		result= num1*num3;
		break;
	case"/":
		result= num1/num2;
		result= num1/num3;
		break;
		default:
			System.out.println("Invalid operation. please try again");
	}
	System.out.println("Result:" +result);
	
	}
}


