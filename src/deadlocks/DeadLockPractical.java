package deadlocks;

class DeadLockPractical
{
	String s1="jay";
	
	String s2 = "kumar";
	
	Thread t1 =new Thread()
			{
		
		       public void run()
		       {
		    	   while(true)
		    	   {
		    		   synchronized(s1) {
		    			   
		    			   try {
		    				   System.out.println(Thread.currentThread().getName()+"locked"+s1);
		    			       Thread.sleep(1000);
		    			   }
		    			   catch(Exception e)
		    			   {
		    				   System.out.println(e);
		    			   }
		    			   synchronized(s2)
			    		   {   System.out.println(Thread.currentThread().getName()+"locked"+s2);
		    			   
			    			   System.out.println(s1+s2);
			    		   }
		    		   }
		    		   
		    		   
		    	   }
		       }
		
		
			};
			
			
			Thread t2 =new Thread()
			{
		
		       public void run()
		       {
		    	   while(true)
		    	   {
		    		   synchronized(s2) {
		    			      System.out.println(Thread.currentThread().getName()+"locked"+s2);
		    		   
		    		   synchronized(s1)
		    		   {   System.out.println(Thread.currentThread().getName()+"locked"+s1);
	    			   
		    			   System.out.println(s1+s2);
		    		   }
		    	   }
		       }
		
		
			}
};


	public static void main(String[] args) {

		DeadLockPractical t9 = new DeadLockPractical();
		
		t9.t1.start();
		
		t9.t2.start();
		
	}

}
