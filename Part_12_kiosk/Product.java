package Part_12_kiosk;

import java.lang.StackWalker.Option;

public class Product {
	public int price;
	public String name;
	int ea = 0;


	
			//메뉴 넘버, 이름 , 가격 , 갯수
	Product( String name,int price){
//		this.number = number;
		this.name = name;
		this.price = price;
		this.ea = 0;		

	}
	
	
	void basket() {
		this.ea = this.ea + 1;
		System.out.println(this.name + this.ea + "개 를 주문하였습니다.");
	}
	
//public static class
	


	
}
