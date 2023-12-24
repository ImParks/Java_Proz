package Part_13_Board;

public class Select {

	public static void select() {
		TextBox.title("수정/삭제");
		while (true) {
			So.ln("1번 : 삭제");
			So.ln("2번 : 수정");
			BoardObj.cmd = BoardObj.sc.next();
			if(BoardObj.cmd.equals("0")) {
				break;
			}
			
			
			switch(BoardObj.cmd) {
			
			case "1":
				Del.del();

				break;
			case "2":
				
			
				PostFix.postFix();
				break;
			}
			
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
}
