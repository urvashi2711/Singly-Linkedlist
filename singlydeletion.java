import java.util.Scanner;
class Singlydeletion{
	 static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	public void creation(){
		int data,n;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter data");
		data=sc.nextInt();
		Node newnode=new Node(data);
		if(head==null){
				head=newnode;
			}
		else{
			newnode.next=head;
			head=newnode;
			}
		      System.out.println("do you want to enter more node the press 1:");
		      n=sc.nextInt();
		}while(n==1);
	}
	public void deletion(){
		int m,n,p;
		Scanner sc=new Scanner(System.in);
			if(head==null)
			{
				System.out.println("ll is empty");
			}
		else
		{
			System.out.println("if you want to delete node from the beginning the press 1 and if you want to delete node from end then press 2 if you want to delete node in the middle or from the esired position the press 3");
			m=sc.nextInt();
			switch(m){
				case 1:
					Node temp=head;
					temp=temp.next;
					head=temp;
					break;
				case 2:
					Node temp1=head;
					Node ptr=temp1.next;
					while(ptr.next!=null){
						temp1=ptr;
						ptr=ptr.next;
					}
					temp1.next=null;
					break;
				case 3:
					System.out.println("enter the position of node to be deleted");
					p=sc.nextInt();
					Node temp2=head;
					Node ptr1=temp2.next;
					for(int i=0;i<(p-1);i++){
						temp2=ptr1;
						ptr1=ptr1.next;
					}
					temp2.next=ptr1.next;
					break;
				}
			}
	}	
	public void display(){
		Node temp=head;
		if(head==null){
			System.out.println("linked list does not exist");
		}
		else{
			while(temp!=null){
				System.out.println(temp.data);
				System.out.println(temp.next);
				temp=temp.next; 
				
			}
		}
	}
	public static void main(String[] args)
	{
		Singlydeletion m=new Singlydeletion();
		m.creation();
		m.deletion();
		m.display();
	
	}
}





