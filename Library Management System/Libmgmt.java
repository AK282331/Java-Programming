class Library{
	String Lib_Name;
	int Lib_id;
	String Lib_Address;
	
	Library(String name, int id, String address){
		this.Lib_Name = name;
		this.Lib_id = id;
		this.Lib_Address = address;
	}
	
	void display_lib(){
		System.out.println("Library Name: " + Lib_Name + "\nLibrary Id: " + Lib_id +  "\nLibrary Address: " + Lib_Address);
	}
	
}

class Member extends Library{
	String Member_Id;
	String Member_Name;
	
	void Libray_details(String Libname, int Libid, String Libaddress){
		super(Libname, Libid, Libaddress);	
	}
	
	void add_member(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the id of the member")
		String id = sc.next();
		this.Member_Id = id;
		System.out.println("Write the name of the member")
		String name = sc.next();
		this.Member_name = name;
		
	}
	
	void display_member(){
		System.out.println(
	}
}



public class Libmgmt{
	public static void main(String[] args){
		
	}
}