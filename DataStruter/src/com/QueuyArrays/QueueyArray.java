package com.QueuyArrays;



public class  QueueyArray <T>{

	Object[] ArrayQueuy;
	int Size;
	int Rear;
	int Front;
	
	
	public QueueyArray(int Size) 
	{
		this.Size = Size;
		ArrayQueuy = new Object[this.Size];
		Front =1;
		Rear =0;
	}
	
	Boolean IsFull() 
	{
		return (Rear ==Size-1);
	}
	
	Boolean IsEmpty() 
	{
		return (Front==-1 || Front > Rear);
	}
	
	public void Queuy(Object newItem )
	{
		if(IsFull()) {
			System.out.println("Queuy Is  Full  ..! ");
			return;
		}
		Rear = Rear + 1;
		ArrayQueuy[Rear] =  newItem;
		if (Front == -1) {
			Front =0;
		}
	}
	
	
	public  T DeQueuey() 
	{
		if (IsEmpty() ) {
			System.out.println("Queuy Is  Empty  ..! ");
			return  null;
		}
		
		T ObjectOut = (T)ArrayQueuy[Front];
		Front = Front+1;
		return ObjectOut;
	}
	

}
