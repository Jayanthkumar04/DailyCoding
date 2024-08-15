package linkedlistpractical;

public class PartitionList {

	public static void main(String[] args) {

		SingleLinkedList sl2 = new SingleLinkedList();
		
		sl2.insertAtEnd(1);

		sl2.insertAtEnd(4);
		
		sl2.insertAtEnd(3);
		
		sl2.insertAtEnd(2);
		
		sl2.insertAtEnd(5);
		
		sl2.insertAtEnd(2);
		
		sl2.display();
		
	   sl2.partition(3);
	   
	   System.out.println("\n partition");
	   
	   sl2.display();
	   
	   
		
		
		
		
		
	}

}
