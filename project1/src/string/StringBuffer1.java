package string;

class StringBuffer1
{  
public static void main(String args[])
{  
StringBuffer sb=new StringBuffer("Hello ");  
sb.append("Java");  
System.out.println("append string:"+sb);//prints Hello Java    
 
 
	
sb.insert(0,"program");  
System.out.println("modified string:"+sb);//prints 

sb.setCharAt(6, '_');
System.out.println("String now:"+sb);

}  
}  