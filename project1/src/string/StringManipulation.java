package string;

class StringManipulation {

public static void main(String args[])
{

StringBuffer str = new StringBuffer("Object Language");
System.out.println("Original String :"+str);
// Obtaining string Length
System.out.println("Length of string " +str.length());
//Accessing character in string
for(int i=0;i<str.length();i++)
{

int p = i+1;

System.out.println("Characters at position : "+p+" is "+str.charAt(i));
}
}
}

