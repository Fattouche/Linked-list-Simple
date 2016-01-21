
public class list extends implementation{
	
	public static void main(String[] args){
		
		implementation list = new implementation();
		System.out.println("size: "+list.size());
		System.out.println("inserting... ");
		list.insert(5);
		list.printlist();
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.printlist();
		System.out.println("removing... ");
		list.remove(6);
		list.printlist();
		System.out.println("\nsize: "+list.size());
		
	}
}
