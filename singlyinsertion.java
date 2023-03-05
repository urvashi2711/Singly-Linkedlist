import java.util.Scanner;
class Singlyinsertion{
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
		int data,n,m,p;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("enter data");
		data=sc.nextInt();
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
		}
		else{
			
			newnode.next=head;
			head=newnode;
			
				
		    }
		System.out.println("do you want to enter more data then press 1");
		n=sc.nextInt();
		}
		while(n==1);
		}
		public void insertion(){
		int data,m,n,p;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("insert data");
		data=sc.nextInt();
		Node newnode=new Node(data);
		System.out.println("if you want to enter new node at the beginning the press 1 , if you want to want to enter data in the  middle then press 3 , if you want to enter data in the end then press 2");
			m=sc.nextInt();
			switch(m)
				{
				case 1:
					newnode.next=head;
					head=newnode;
					break;
				case 2:
					Node temp=head;
					while(temp.next!=null){
						temp=temp.next;
					}
					temp.next=newnode;
					break;
				case 3:
					System.out.println("at which position u want to insert new node");
					p=sc.nextInt();
					Node temp1=head;
					for(int i=0;i<(p-1);i++){
							temp1=temp1.next;
					}
					newnode.next=temp1.next;
					temp1.next=newnode;
			        }
		System.out.println("if you want to add more newnode than press 1");
		n=sc.nextInt();
		}while(n==1);
		    
	}
	public void traverse(){
		Node temp=head;
		if(head==null){
			System.out.println("ll does not exist");
		}
		else{
			while(head!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public static void main(String args[]){
		Singlyinsertion m=new Singlyinsertion();
		m.creation();
		m.insertion();
		m.traverse();
 	}


}