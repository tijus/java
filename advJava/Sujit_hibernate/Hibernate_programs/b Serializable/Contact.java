import java.io.*;
public class Contact implements Serializable{
	String name;
	int phone;
	public Contact(String name, int phone){
		this.name=name;
		this.phone=phone;
	}
	public String toString(){
		return this.name+"\t"+this.phone+"\n";
	}

}