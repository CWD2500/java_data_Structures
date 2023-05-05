package linkedListQueue;

import com.linked.Node;

public class QeueLinkedList<T> {
	NodeDoble<T>  Real;
	NodeDoble<T>  Front;
	
	
	public QeueLinkedList (NodeDoble newNode) {
		Real = newNode;
		Front = newNode;
		
	}
	
	public void add(NodeDoble  newNode) 
	{

		newNode.next = null;
		newNode.prevous =Real;
		Real.next = newNode;
		Real = newNode;
	}

	public T DeQeueue()
	{
		T value = Front.value;
		Front = Front.next;
		Front.prevous = null;
		
		return value;
	}
	

	

}
