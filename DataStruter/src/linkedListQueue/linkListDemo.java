package linkedListQueue;

public class linkListDemo {

	public static void main(String[] args) {
		
		NodeDoble<Integer> node = new NodeDoble<Integer>(12, null, null);
		QeueLinkedList<Integer> qeueu = new QeueLinkedList<Integer>(node);
		qeueu.add(new NodeDoble<Integer>(11, null, null));
		qeueu.add(new NodeDoble<Integer>(65, null, null));
		qeueu.add(new NodeDoble<Integer>(43, null, null));
	
		System.out.println(qeueu.DeQeueue());
		System.out.println(qeueu.DeQeueue());
		System.out.println(qeueu.DeQeueue());
		//System.out.println(qeueu.DeQeueue());
	}

}
