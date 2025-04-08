package treeSet;

import java.util.TreeSet;
import java.util.Comparator;


public class BookSetMain {

	public static void main(String[] args){
		TreeSet<Book>bookSet=new TreeSet<Book>(new MyComparator());
		Book b1=new Book("Java","Schlidt",500,700);
		Book b2=new Book("Python","JKL",300,500);
		Book b3=new Book("Html","ABC",600,200);
		Book b4=new Book("C","XYZ",400,300);
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		for(Book b:bookSet) {
		System.out.println(b);
		}

	}
}

class MyComparator implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		//return b1.getTitle().compareTo(b2.getTitle());  //ASC
		return b2.getTitle().compareTo(b1.getTitle()); //DESC
	}
	
}




