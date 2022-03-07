package ktds;
/*
 *################### 실기 평가 구현 가이드 ######################
 *
 * Book.class 구현 : TestMain.class 가 정상적으로 작동하도록 메서드 구현
 * 주의) 주어진 멤버변수와 메서드 외에 메서드나 멤버변수 추가 절대 금지
 * 
 * ###################################################
 */	
public class Book {
	//도서 제목
	public String name;
	//도서 가격
	public String price;
	//도서 수량
	public String amount;
	
	public Book(String name, int price, int amount) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = Integer.toString(price);
		this.amount = Integer.toString(amount);
	}

	public String getBookInfo() {
		// TODO Auto-generated method stub
		
		return "도서명 : " + this.name + ", 재고는 " + this.amount + "권 입니다.";
	}

}
