package Part_13_Board;

public class Del {

	public static void del() {

		int cmd;
		TextBox.title("글삭제");
		while (true) {

			So.ln("삭제하고싶은 글 번호를 작성해주세요");
			So.ln("뒤로가기 : 0");
			BoardObj.cmd = BoardObj.sc.next();
			if (BoardObj.cmd.equals("0")) {
				break;
			}
			while (true) {
				
				try {
					cmd = Integer.parseInt(BoardObj.cmd);
					break;
				} catch (NumberFormatException e) {
					System.out.println("올바른 숫자 형식이 아닙니다.");
					BoardObj.cmd = BoardObj.sc.next();
				}
			}

			for (Post p : Load.gather) {

				if (cmd == p.number) {

					Load.gather.remove(cmd - 1);
					So.line();
					return;
				} else if (cmd > Load.gather.size() || cmd < 0) {
					So.ln("입력하신 번호는 없는번호입니다. 다음에 다시 입력해주세요 삐~");
					break;
				}
			}


		}

	}
}