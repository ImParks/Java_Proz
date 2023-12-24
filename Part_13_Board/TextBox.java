package Part_13_Board;


public class TextBox {

	public static void homeText(){
		So.line();
		So.ln("1: 글 목록 || 2:글 읽기 || 3: 글쓰기 || 4: 글 수정/삭제 || x: 시스템 종료");
		So.line();

		
	}
	
	
	public static void title(String t){
		So.line();
		So.ln("================== "+ t +" ========================");
		So.line();
	}
	
	
	public static void textList(String cmd) {
		String list = "";
		list = cmd + list;
		
	}

}



