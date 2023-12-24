package Part_13_Board;

public class Writing {

	public static void writing() {

		// 글쓰는 법
		// 제목: , 내용: 작성자 id:
		TextBox.title("글쓰기");
		String title;
		while (true) {
			title = BoardObj.rl("제목");
			if (title.length() > 0) {
				break;
			} else {
				So.ln("잘못된 입력입니다");
			}

		}
		String content;
		while (true) {
			content = BoardObj.rl("내용");
			if (content.length() > 0) {
				break;
			} else {
				So.ln("잘못된 입력입니다");
			}

		}
		String name;
		while (true) {
			name = BoardObj.rl("작성자");
			if (name.length() > 0) {
				break;
			} else {
				So.ln("잘못된 입력입니다");
			}

		}
		So.ln("작성이 완료되었습니다.");
		Post p = new Post(title, content, name);
		Load.gather.add(p);
		

	}

}
