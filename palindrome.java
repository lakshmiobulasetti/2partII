import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	String str,rev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	str=sc.nextLine();
	int length=str.length();
	for(int i=length-1;i>=0;i--)
	rev=rev+str.charAt(i);
	if(str.equals(rev))
	System.out.println(str+"is a palindrome");
	else
	System.out.println(str+"is not a palindrome");
	
	}
	}
