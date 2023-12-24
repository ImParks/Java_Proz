package Part_12_kiosk;

public class Pasta extends MainDishe {

	public static void pasta() {

		String name;
		int price;
		int option1 = 0;
		int option2 = 0;
		int option3 = 0;
		mainDishe: while (true) {

			name = "파스타";
			price = 9000;

			So.line();
			So.ln("================= 파스타 ===================");
			So.line();

			So.ln("1. 기본"); // 파스타
			So.ln("2. 면추가 : 1000원"); // 파스타
			So.ln("3. 소스 추가 : 1000원");
			So.ln("4. 종합토핑 : 3000원");
			So.ln("0. 토핑선택 초기화");
			So.ln("*. 선택완료");
			So.ln("x. 뒤로가기");
			order = sc.next();
			switch (order) {
			case "1": // 기본
				option1 = 0;
				option2 = 0;
				option3 = 0;

				break;
			case "2": // 면추가
				option2 = 1;

				break;
			case "3": // 소스추가
				option3 = 1;

			case "4": // 종합토핑
				option3 = 1;

				break;
			case "0": // 토핑선택 초기화
				option1 = 0;
				option2 = 0;
				option3 = 0;

				break;

			case "*": // 주문완료


				if (option1 == 1) { // 면추가 천원
					price = price + 1000;
					name = name + "[면추가]";
				}
				if (option2 == 1) { // 소스 추가
					price = price + 1000;
					name = name + "[소스추가]";
				}
				if (option3 == 1) { // 토핑추가
					price = price + 3000;
					name = name + "[토핑추가]";
				}

				Product pasta = new Product(name, price);
				Kiosk.summary.add(pasta);
				pasta.basket();
				option1 = 0;
				option2 = 0;
				option3 = 0;
				
				break;

			case "x": // 취소
				break mainDishe;

			}

		}

	}
}