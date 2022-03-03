package ktds;

import java.util.ArrayList;
/*
 *################### 실기 평가 구현 가이드 ######################
 *
 * BookStroe.class 구현 : TestMain.class 가 정상적으로 작동하도록 메서드 구현
 * 주의) 주어진 멤버변수와 메서드 외에 메서드나 멤버변수 추가 절대 금지
 * 
 * ###################################################
 */	
public class BookStore {
	
	ArrayList<Book> books;
	
	public BookStore(String name) {
		// TODO Auto-generated constructor stub
		books = new ArrayList<>();
		System.out.println(name+" Store 가 생성되었습니다.");
	}

	public ArrayList<Book> getBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<ktds.Book> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}

	public void addBook(ktds.Book b1) {
		// TODO Auto-generated method stub
		books.add(b1);
		System.out.println("도서명 : " + b1.name + ", 도서가 " + b1.amount + "권 입고되었습니다.");
		
	}

	public ktds.Book findBookByTitle(String string) {
		// TODO Auto-generated method stub
		for(Book b: books) {
			if (b.name == string) {
				return b;
			}
		}
		return null;
	}

	public void updateBookCountByTitle(String string, int i) {
		// TODO Auto-generated method stub
		for(Book b: books) {
			if (b.name == string) {
				b.amount = Integer.toString(i);
				System.out.println("도서정보갱신 ->>"+" 도서명 : " + b.name + ", 재고는 " + b.amount + "권 입니다.");
			}
		}
	}

	public int getTotalBookCount() {
		// TODO Auto-generated method stub
		int total = 0;
		for(Book b: books) {
			total += Integer.parseInt(b.amount);
		}
		return total;
	}

	public void deleteBook(String string) {
		// TODO Auto-generated method stub
		for(Book b: books) {
			if (b.name == string) {
				books.remove(b);
				break;
			}
		}
		System.out.println("도서 삭제 : " + string + " 삭제됨");
	}

}
