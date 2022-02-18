package constructor;

class Parameter
{  
    int id;  
    String name;  
      
    Parameter(int i,String n)
    {  
    id = i;  
    name = n;  
    }  
      
    void display()
    {
    	System.out.println(id+" "+name); 
    }
   
    public static void main(String args[])
    {  
     
    Parameter p1 = new Parameter(111,"urwali");  
    Parameter p2 = new Parameter(222,"mahajan");  
      
    p1.display();  
    p2.display();  
   }
}