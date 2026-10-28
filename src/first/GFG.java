// Java Program to Illustrate Island of Isolation

// Main class
package first;

public class GFG {
	GFG a;
   
    
    public static void main(String[] args){
    	GFG a1=new GFG();
    	GFG b1=new GFG();
    	
    	a1.a=b1;
    	b1.a=a1;
    	
    	a1=null;
    	b1=null;
    	
    	System.gc();
    
    }
    @Override
    protected void finalize() throws Throwable {
    	System.out.println("finalize executed");
    }
    
}