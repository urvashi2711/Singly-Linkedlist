import java.util.Scanner;
class Singlycount{
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
		int data,n,count;
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
		}while(n==1);
		
	}
	
	public void traverse(){
		Node temp=head;
		int count=0;
		if(head==null){
			System.out.println("ll does not exist");
		}
		else{
			while(head!=null){
				System.out.println(temp.data);
				temp=temp.next;
				System.out.println("total number of nodes:")
				count++;
				System.out.println(count);
			}
		}
	}
	public static void main(String args[]){
		Singlycount m=new Singlycount();
		m.creation();
		m.traverse();
 	}


}