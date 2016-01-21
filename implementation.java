
public class implementation{
	Node head=null;
	
	public void insert(int value){
		Node inserted = new Node(value);
		if(head==null){
			head=inserted;
			return;
		}
		Node curr=head;
		while(curr!=null){
			if(curr.next==null){
				curr.next=inserted;
				return;
			}
			curr=curr.next;
		}
	}
	
	//removes the node with the specific value
	public void remove(int value){
		if(head==null){
			System.out.println("you tried to remove nothing from the list");
		}
		if(head.value==value){
			head=null;
		}
		Node curr = head;
		Node prev=null;
		while(curr!=null){
			if(curr.value==value){
				prev.next=curr.next;
				System.out.println("removed the node with value: "+value);
			}
			prev=curr;
			curr=curr.next;
		}
	}
	
	public int size(){
		if(head==null){
			return 0;
		}
		int counter=0;
		Node curr=head;
		while(curr!=null){
			curr=curr.next;
			counter++;
		}
		return counter;
	}
	
	public void printlist(){
		Node curr=head;
		if(head==null){
			System.out.println("there is nothing in the list");
			return;
		}
		System.out.println("Your list: ");
		while(curr!=null){
			System.out.print(curr.value+ ", ");
			curr=curr.next;
		}
	}
}
