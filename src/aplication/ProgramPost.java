package aplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import utilidades.Comment;
import utilidades.Post;

public class ProgramPost {

	public static void main(String[] args) {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Comment c1 = new Comment("Nossa, que legal!");
		Comment c2 = new Comment("Parabéns");

		Post p1= new Post(LocalDateTime.parse("19/10/2022 18:27", dt), "Aprendendo programação em java",
				"Vou aprender essa linguagem top", 20);
		
	p1.addComment(c1);
	p1.addComment(c2);	
		System.out.println(p1);
	}

}
