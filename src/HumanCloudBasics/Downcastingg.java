package HumanCloudBasics;


class A{
	
    public void show1(){
        System.out.println("In show A");
    }
    
    
    
    
}

class B extends A{
    
	public void show1(){
        System.out.println("In show1 B ");
    }
	public void show2(){
        System.out.println("In show B");
    }
}

class C extends A{
	
	public void show1(){
        System.out.println("In show1 C");
    }
	public void show3() {
		
		System.out.println("im in showC");
	}
	
	
}

class Downcastingg{
    public static void main(String []args){
    
    	B b = new B();
    	
    	C c = new C();
    	
    	A a;
    	
    	a=b;
    	
    	a.show1();
    	
    	((B)(a)).show2();
    	
    	
    	a=c;
    	
    	c.show1();
    	
    	((C)(c)).show3();
    	
    	
//    	a.show2();
    	
//    	A obj =(A) new B(); //upcasting 
    
    	
        
//    obj.show1();
   
//  A obj1 =new B(); 
    
//    B obj1=(B)obj;
//       
//    obj1.show2();
    
//    ((B)obj).show2(); 
    }
}