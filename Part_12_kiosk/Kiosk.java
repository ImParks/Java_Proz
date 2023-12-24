package Part_12_kiosk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Kiosk {

	
	// 어레이
	public static  ArrayList<Product> summary = new ArrayList<Product>();
//	public static  HashSet<Product> receipt = new HashSet<Product>();

	
	

	// 스켄 
	public static Scanner sc = new Scanner(System.in);
	public static String order;
	

	
	void display() {
		



		xx: while (true) {
			So.line();
			So.ln("================= 메뉴판  ====================");
			So.line();
			So.ln("1. 메인메뉴");
			So.ln("2. 사이드메뉴");
			So.ln("3. 음료");
			So.ln("*. 주문완료");
			So.ln("x. 메뉴판 닫기");
			order = sc.next();
			switch (order) {
			case "1": // 메인메뉴
				MainDishe.pick();
				
				
				
				break;
			case "2": // 사이드 메뉴
				So.ln("사이드 메뉴의 준비가 되지않았습니다.");
				break;

			case "3": // 음료
				So.ln("음료 메뉴의 준비가 되지않았습니다.");
				break;

			case "*": // 장바구니
				
				
				So.line();
				So.ln("================= 명세서 =====================");
				So.line();
				
				
				ArrayList<Product> receipt = new ArrayList<>(new HashSet<>(summary));
				
				
				
				int hab = summary.size();
						
				System.out.println("주문하신 메뉴의 합계는" + hab + "입니다.");
				
				for (Product x:receipt) {
					So.ln(x.name + " : " + x.ea + " EA");
				}

				int sum = 0;
				for (Product y:summary) {
					sum = sum + y.price;
					
				}
				So.ln("합산 가격은" + sum + "입니다.");
				break xx;
				

				
			case "x": // 종료

				break xx;

			}
		}
		So.ln("프로그램 종료");

	}
}