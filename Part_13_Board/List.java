package Part_13_Board;

import java.util.ArrayList;

public class List {

	public static ArrayList<Post> best = new ArrayList<>();

	public static void lest() {
		if (Load.gather.size() > 0) {
			int max = -1;
			Post maxHitObj = null;
			for (Post b : Load.gather) {
				int hitz = b.hit;
				if (hitz > max) {
					max = b.hit;
					maxHitObj = b;
				}
			}

			So.line();
			So.t("인기글 :");
			maxHitObj.infoList();
			So.line();

			for (Post a : Load.gather) {
				a.infoList();
			}

		}else {
			So.ln("글목록이 비어있습니다.");
		}
	}

}
