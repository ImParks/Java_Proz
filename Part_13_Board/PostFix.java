package Part_13_Board;

public class PostFix {

	public static void postFix() {

		TextBox.title("글수정하기");
		int cmd;

		while (true) {

			So.ln("수정하고싶은 글 번호를 작성해주세요");
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
					String title;
					while (true) {
						title = BoardObj.rl("제목");
						if (title.length() > 0) {
							p.title = title;
							break;
						} else {
							So.ln("잘못된 입력입니다");
						}

					}
					String content;
					while (true) {
						content = BoardObj.rl("내용");
						if (content.length() > 0) {
							p.content = title;
							break;
						} else {
							So.ln("잘못된 입력입니다");
						}

					}
					String name;
					while (true) {
						name = BoardObj.rl("작성자");
						if (name.length() > 0) {
							p.name = name;
							break;
						} else {
							So.ln("잘못된 입력입니다");
						}

					}
					So.ln("작성이 완료되었습니다.");

					break;
				} else if (cmd > Load.gather.size() || cmd < 0) {
					So.ln("입력하신 번호는 없는번호입니다. 다음에 다시 입력해주세요 삐~");
					break;
				}

			}

		}
	}
}
