
public class Book {
	private String title;
	private String author;
	public Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public boolean equals(Object o){
		if ( o instanceof Book){
			Book other = (Book)o;
			if(other.getTitle()==this.title && other.getAuthor()==this.author){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
	public String toString(){
		return title + "-" + author;
	}
	
}
