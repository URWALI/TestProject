package assignmentarray;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int a[]= {10,30,40,50};
		int b[]=new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		
		//for(int=0;i<b.length;++i)
		//{
		//	System.out.println(b[i]+"");
		//}
System.out.println("print elements of second array:"+Arrays.toString(b));
	}

}
