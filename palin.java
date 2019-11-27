import java.util.*;
class palin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.nextLine();
		int i;
		String nu = "";
		for(i = 0;i <s1.length();i++){
			nu = s1.charAt(i) + nu;
		}
		//nu.trim();
		//s1.trim();
		System.out.println("The reverse string is: " + nu);
		if(s1.equalsIgnoreCase(nu)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not A Palindrome");
		}
	}
}
