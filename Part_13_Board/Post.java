package Part_13_Board;

import java.time.LocalDate;

public class Post {
	
	static public int no = 0;
	int number;
	public String title;
	public String content;
	public String name;
	String time;
	public int hit;
	
	
	
	public Post(String title,String content,String name){
		no = no + 1;
		number = no;
		LocalDate now = LocalDate.now();
		time = now.toString();
		this.title = title; 
		this.content = content;
		this.name = name;
		this.hit = 0;
		
	}
	

	
	public void  infoList() {
	So.ln("글 번호 [ " + number + " ]");
	So.t("제목 : " + title + "||");
	So.t("작성자 : " + name + "||");
	So.t("작성일 : " + time);
	So.ln("[조회수: "+hit+"]"  );
	So.line();
		
		
	}
	
	public void  infoPost() {
		this.hit = this.hit + 1;
		So.ln("글 번호 [ " + number + " ]");
		So.ln("제목 : " + title);
		So.ln("작성자 : " + name);
		So.ln("작성일 : " + time);
		So.ln("내용 : " + content);
		So.ln("[조회수 : "+ this.hit + " ]");
		So.line();


		
	}
}