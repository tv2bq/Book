
import java.util.*;
public class Person {
	private String name;
	private int ID;
	private ArrayList<Book> read;
	public Person(String name, int id){
		this.name=name;
		this.ID=id;
                this.read= new ArrayList<Book>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return ID;
	}
        
	public ArrayList<Book> getRead() {
		return read;
	}
	public boolean addBook(Book b){
		boolean check=false;
		if(!(read.contains(b))){
			read.add(b);
			check=true;
		}
		return check;
	}
	public boolean hasRead(Book b){
		boolean check=false;
		if(read.contains(b)){
			check=true;
		}
		return check;
	}
	public boolean forgetBook(Book b){
		boolean check=false;
		if(read.contains(b)){
			read.remove(b);
			check=true;
		}
		return check;
	}
	public int numBooksRead(){
		return read.size();
	}
	public boolean equals(Object o){
		boolean check=false;
		if(o instanceof Person){
			if(((Person) o).getId()==this.ID){
			check=true;
		}
		}
		return check;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", ID=" + ID + ", read=" + read + "]";
	}
	public static ArrayList<Book> commonBooks(Person a, Person b){
		ArrayList<Book> common = new ArrayList<Book>();
		ArrayList<Book> less = new ArrayList<Book>();
		ArrayList<Book> more = new ArrayList<Book>();
		double smaller=0;
		double bigger=0;
		if(a.read.size()<b.read.size()){
			less=a.read;
			more=b.read;
		}
		else{
			less=b.read;
			more=a.read;
			}
	for(int i=0;i<less.size();i++){
		for(int j=0;j<more.size();j++){
			if(less.get(i)==more.get(j)){
				common.add(less.get(i));
			}
		}
	}
		
		return common;
	}
	public static double similarity(Person a, Person b){
		double smaller=0;
		if(a.read.size()<b.read.size())
		smaller=a.read.size();
		else{
		smaller=b.read.size();
		}
		return commonBooks(a,b).size()/smaller;
	}




}
