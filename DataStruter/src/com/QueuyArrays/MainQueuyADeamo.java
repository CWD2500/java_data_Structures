package com.QueuyArrays;

public class MainQueuyADeamo {

	public static void main(String[] args) 
	{
		QueueyArray<String>  queuey = new QueueyArray<String>(4);
		queuey.Queuy("A");
		queuey.Queuy("B");
		queuey.Queuy("C");
		queuey.Queuy("D");
		
		System.out.println(queuey.DeQueuey());
		System.out.println(queuey.DeQueuey());
		System.out.println(queuey.DeQueuey());
		System.out.println(queuey.Front);
		System.out.println(queuey.Rear);
		System.out.println(queuey.DeQueuey());

		
	}
}
