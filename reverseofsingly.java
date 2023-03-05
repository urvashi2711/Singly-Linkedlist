 import java.util.Scanner;
class Singlycreation{
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
		
	public void display(){
		Node temp=head;
		
		if(head==null){
			System.out.println("linked list does not exist");
		}
		else{
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;	
			}
		}
	
	}
	public void reverse(){
		Node temp=head;
		Node previous=null;
		Node next=null;
		while(temp!=null){
			next=temp.next;
			temp.next=previous;
			previous=temp;
			temp=next;
			System.out.println(temp.data);
		}
		
	}

	public static void main(String[] args){
		Singlycreation m=new Singlycreation();
		m.creation();
		m.reverse();
		m.display();
	
	}
}