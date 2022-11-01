package utilidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private static DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comment = new ArrayList<>();

	public Post() {

	}

	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void addComment(Comment comments) {
		comment.add(comments);
	}

	public void removeComment(Comment comments) {
		comment.remove(comments);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" likes - ");
		sb.append(moment.format(dt) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		 for (Comment c : comment) {
			 sb.append(c.getText() + "\n");
		 }
		 return sb.toString();
	}
}
