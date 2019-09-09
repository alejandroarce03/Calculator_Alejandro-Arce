import java.util.Scanner;
import java.lang.Math;

public class calculator{
	public static void main(String args[]){
		Scanner number = new Scanner(System.in);
		Scanner chain = new Scanner(System.in);
		int mode = 0;
		System.out.println("---- SCIENTIFIC CALCULATOR ------ ");
		System.out.println("WHICH OPTION DO YOU WANT TO USE");
		System.out.println("1. BASIC MODE ");
		System.out.println("2. ADVANCED MODE ");
	    mode = number.nextInt();
		String follow = "";
		double num1=0;
		double num2=0;
		double result=0;
		int again = 0;
		switch(mode){
			case 1: Basic(number,chain,num1,num2,result,again);
			        
					
			
			case 2: Advanced(number,chain,num1,num2,result,follow,again);
		}
	}
/**
*The next method is the advanced mode of the calculator in the use of addition, subtraction, multiplication, division, module, root, power, logarithm, sine, cosine, tangent, radians and factorial <br>
*pre: attributes num1, num2, result, follow and again (not null) <br>
*post: At the end of the method it yields a result of the operation done previously and manages to continue operating sequentially <br>
@param num1, num2 and result are of type double, follow of type string and again of type integer <br>
*/
	public static void Advanced(Scanner number, Scanner chain, double num1, double num2, double result, String follow,int again){
		double num3 = 0;
		int again1= 0;
		  num1 = number.nextDouble();
	   String operation = chain.nextLine();
	   if(operation.equalsIgnoreCase("#")){
		   Basic(number,chain,num1,num2,result,again);
	   }
	 switch(operation){
		 case "factorial":
		 factorial(num1);
		 break;
	     case "root": 
		   root(num1);
		 break;
          case "rad": 
		   rad(num1);
		   break;
		 case "degree": degree(num1);
		 break;
		 case "sin": sin(num1);
		 break;
		 case "cos": cos(num1);
		 break;
		 case "tan": tan(num1);
		 break;
		 case "ln": log_10(num1);
		 break;
	 default:
		  num2 = number.nextDouble();
		  switch(operation){
			 case "+": result = num1+num2;
			       
			         System.out.println(result);
					 break;
			 case "-": result = num1-num2;
			         System.out.println(result);
					 break;
			 case "*": result =  num1*num2;
			         System.out.println(result);
			         break;
			 case "/": result = num1/num2;
			         System.out.println(result);
					 break;
			 case "%": result = num1%num2;
			         System.out.println(result);
					 break;
			 case "power": power(num1,num2);
			         break;
             case "log": log_n(num1,num2);
                     break;	
             case "root_n": root_n(num1,num2);
			 
					
			 default:
}
	 }
	 do{
	 follow = chain.nextLine();
	 if(follow.equalsIgnoreCase("#")){
		 Basic(number,chain,num1,num2,result,again);
	 }
	 switch(follow){
	 case "factorial": num1=result;
		   factorial(num1);
		   again1 = 1;
		   break;
	     case "root": result = num1;
		 root(num1);
		 again1 = 1;
		   break;
		 case "rad": result = num1;
		 rad(num1);
		 again1 = 1;
		   break;
         case "degree": result = num1;
		   degree(num1);
		   again1 = 1;
		   break;
		 case "sin": result = num1;
           sin(num1);		   
		   again1 = 1;
		   break;
		 case "cos": result = num1;
		   cos(num1);
		   again1 = 1;
		   break;
		 case "tan": result = num1;
           tan(num1);
		   again1 = 1;
		   break;
		 case "ln": result = num1;
		   log_10(num1);
		   again1 = 1;
		   break;
		   default: 
	 
	  num3 = number.nextDouble();
	 switch(follow){
		   case "+": result = result + num3;
		   System.out.println(result);
		   again1 = 1;
		   break;
		   case "-": result = result - num3 ;
		   System.out.println(result);
		   again1 = 1;
		   break;
		   case "*": result = result*num3;
		   System.out.println(result);
		   again1 = 1;
		   break;
		   case "/": result = result/num3;
           System.out.println(result);
		   again1 = 1;
		   break;
		   case "%": result = result%num3;
		   System.out.println(result);
		   again1 = 1;
		   break;
		   case "root_n": result = num1;
		   num3=num2;
		   root_n(num1,num2);
		   again1 = 1;
		   break;
		   case "power": result = num1;
		   num3 = num2;
		   power(num1,num2);
		   again1 = 1;
		   break;
		 default:
	 }
	 }
		}while(again1==1);
			System.out.println("Error");
	}	
/**
*The following method is the basic mode of the calculator in the use of addition, subtraction, multiplication, division, module, root, power, logarithm, sine, cosine, tangent, radians and factorial <br>
*pre: attributes num1, num2, result, follow and again (not null) <br>
*post: At the end of the method it yields a result of the operation done previously <br>
@param num1, num2 and result are of type double, follow of type string and again of type integer <br>
*/
    public static void Basic(Scanner number, Scanner chain, double num1, double num2, double result,int again){
	 again = 0;
	do{
	   num1 = number.nextDouble();
	   String operation = chain.nextLine();
	
	 switch(operation){
		 case "factorial": factorial(num1);
		 break;
	     case "root": root(num1);
		 break;
		 case "rad": rad(num1);
		 break;
		 case "degree": degree(num1);
		 break;
		 case "sin": sin(num1);
		 break;
		 case "cos": cos(num1);
		 break;
		 case "tan": tan(num1);
		 break;
		 case "ln": log_10(num1);
		 break;
	 default:
		  num2 = number.nextDouble();
		  switch(operation){
			 case "+": result = num1+num2;
			         System.out.println("||");
			         System.out.println(result);
					 break;
			 case "-": result = num1-num2;
			         System.out.println("||");
			         System.out.println(result);
					 break;
			 case "*": result =  num1*num2;
			         System.out.println("||");
			         System.out.println(result);
			         break;
			 case "/": result = num1/num2;
			         System.out.println("||");
			         System.out.println(result);
					 break;
			 case "%": result = num1%num2;
			         System.out.println("||");
			         System.out.println(result);
					 break;
			 case "power": power(num1,num2);
			         break;
             case "log": log_n(num1,num2);
                     break;	
             case "root_n": root_n(num1,num2);
			 
					
			 default:
}
	 }
             System.out.println("Do you want continue?");
             String repet = chain.nextLine();
			 if(repet.equalsIgnoreCase("yes")){
				 again=1;
			 }
			 else 
				 again=0;
    }while(again==1);
	System.out.println("Exit successfully");



}
/**
*The following method calculates the power of a number <br>
*pre: attributes num1 and num2 are (not null) <br>
*post: When finished gives a result of a number1 raised to a number2 <br>
@param num1 and num2 are double type variables <br>
@return result
*/
public static double power(double num1, double num2){
	double result = 0;
	int num_power = (int)num2;
	int num_int = (int)num1;
 for(int i=1; i==num_power;i++){
			         result = i*num_int;
			           }
			         System.out.println("||");
			         System.out.println(result);
					 return result;
}
/**
*This method calculates the factorial of a number <br>
*pre: attributes num1 is (not null) <br>
*post: At the end of the method, throw the result of the factorial of the number num1 <br>
@param attribute num1 is a variable of type double and num1! = 0 <br>
@return result <br>
*/
public static double factorial(double num1){
	double result=0;
	double factorial =1;
	 while(num1!=0){
			 factorial = factorial*num1;
			 num1--;
		 }
		 System.out.println("||");
		 System.out.println(factorial);
		 factorial = result;
		 return result;
}
/**
*This method calculates the square root of a number <br>
*pre: attributes num1 is (not null) <br>
*post: At the end of the method throw the result of said square root <br>
@param num1 is a variable of type double and num1> = 0 <br>
@return result <br>
*/
public static double root(double num1){
	 double result=50;
	 int i = 0;
	 do{
		result = (result/2)+(num1/(2*result));
		
	     i++;
	 }while(i<6);
	     System.out.println("||");
		 System.out.println(result);
		 return result;
 }
/**
*This method converts degrees to radians
*pre: attributes num1 is (not null) <br>
*post: At the end of the method, calculate the result of a number in degrees to radians <br>
@param num1 is a variable of type double and num1> = 0 where num1 are the degrees of the angle <br>
@retutn result <br>
*/
public static double rad(double num1){
	double result = 0;
	result = Math.toRadians(num1);
	System.out.println("||");
	System.out.println(result);
	return result;
}
/**
*The method he does is move from radians to degrees <br>
*pre: the attributes num1 is (not null) and the pi is not placed, it is already implemented in the variable <br>
*post: at the end of the method it shows the degrees of the variable in radians <br>
@param num1 is a variable of type double and num1> = 0 where num1 are radians <br>
@return result <br>
*/
public static double degree(double num1){
	double result = 0;
	num1 = num1*Math.PI;
	result = Math.toDegrees(num1);
	System.out.println("||");
	System.out.println(result);
	return result;
}
/**
*What the method does is calculate the sine of an angle <br>
*pre: attributes num1 is (not null) and is placed in degrees <br>
*post: at the end of the method shows the sine of the entered angle <br>
@param num1 is a variable of type double and num1> = 0 where num1 is the angle <br>
@return result <br>
*/
public static double sin(double num1){
	double result = 0;
	result = Math.toRadians(num1);
	System.out.println("||");
	System.out.println(Math.sin(result));
	return result;
}
/**
*What the method does is calculate the cosine of an angle <br>
*pre: attributes num1 is (not null) and is placed in degrees <br>
*post: at the end of the method it shows the cosine of the entered angle <br>
@param num1 is a variable of type double and num1> = 0 where num1 is the angle <br>
@return result <br>
*/
public static double cos(double num1){
	double result = 0;
	result = Math.toRadians(num1);
	System.out.println("||");
	System.out.println( Math.cos(result));
	return result;
}
/**
*What the method does is calculate the tangent of an angle <br>
*pre: attributes num1 is (not null) and is placed in degrees <br>
*post: at the end of the method shows the tangent of the entered angle <br>
@param num1 is a variable of type double and num1> = 0 where num1 is the angle <br>
@return result <br>
*/
public static double tan(double num1){
	double result = 0;
	result = Math.toRadians(num1);
	System.out.println("||");
	System.out.println( Math.tan(result));
	return result;
}
/**
*What the method does is calculate the root n of a variable <br>
*pre: attributes num1 and num2 are (not null) <br>
*post: at the end of the method it shows the result of that root <br>
@param num1 and num2 is a variable of type double and num1> 0, num2> 0 <br>
@return result <br>
*/
public static double root_n(double num1, double num2){
	
	double result = 0;
	num2 = 1/num2;
	result = Math.pow(num1,num2);
	System.out.println("||");
	System.out.println(result);
	return result;
}
/**
*What the method does is calculate the natural logarithm of a variable <br>
*pre: attributes num1 is (not null) <br>
*post: at the end of the method it shows the result of a natural logarithm of a variable <br>
@param num1 is a variable of type double and num1> 0 <br>
@return result <br>
*/
public static double log_10(double num1){
	double result = 0; 
	result = Math.log10(num1);
	System.out.println("||");
	System.out.println(result);
	return result;
}
/**
*The method what it does is calculate the logarithm n of a variable <br>
*pre: attributes num1 and num2 are (not null) <br>
*post: at the end of the method it shows the result of that logarithm <br>
@param num1 and num2 is a variable of type double and num1> 0, num2> 0 <br>
@return result <br>
*/
public static double log_n(double num1, double num2){
	double result = 0;
	result = (Math.log10(num1)/Math.log10(num2));
	System.out.println("||");
	System.out.println(result);
	return result;
}
}
	
