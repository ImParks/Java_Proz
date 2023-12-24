package Part_12_kiosk;


public class MainDishe extends Kiosk {

	public static void pick() {


		main: while (true) {
			So.line();
			So.ln("================= 메인 메뉴 ==================");
			So.line();

			So.ln("1. 파스타"); // 파스타
			So.ln("2. 스테이크");
			So.ln("3. 비프스튜");
			So.ln("4. 코올슬로");
			So.ln("x. 뒤로가기");
			order = sc.next();
			switch (order) {
			case "1": // 파스타
				Pasta.pasta();
				break;
//			case "2":
//				ManuInfo.steak.basket();
//				summary.add(ManuInfo.steak);
//				break;
//
//			case "3":
//				ManuInfo.beefStew.basket();
//				summary.add(ManuInfo.beefStew);
//				break;
//
//			case "4":
//				ManuInfo.coleslaw.basket();
//				summary.add(ManuInfo.coleslaw);
//				break;

			case "x":
				break main;
			}
		}
	}
}