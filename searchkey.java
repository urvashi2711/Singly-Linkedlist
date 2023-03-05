import java.util.Scanner;
class Searchkey{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	Scanner sc=new Scanner(System.in);
	public void creation(){
		int n;
		
		do{
		System.out.println("enter data");
		int data=sc.nextInt();
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
		}
		else{
			newnode.next=head;
			head=newnode;
		}
		System.out.println("enter 1 to do more insertion");
		n=sc.nextInt();
		}while(n==1);
	}
	void search(){
		Node temp=head;
		int s;
		System.out.println("enter key");
		s=sc.nextInt();
		while(temp!=null){
			if(temp.data==s){
				System.out.println("found");
				
			}
			temp=temp.next;
		}
		
	}
	public static void main(String[] args){
		Searchkey sk=new Searchkey();
		sk.creation();
		sk.search();
	}
}