package lab00;

import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private int id;
	private int likes;
	private double nota;
	private ArrayList <Comentario> lista_comentarios = new ArrayList<Comentario>();
	
	
	
	public Disciplina(String nome, int id, int likes, double nota) {
		this.nome = nome;
		this.id = id;
		this.likes = likes;
		this.nota = nota;
		  
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getLikes() {
		return likes;
	}


	public void setLikes(int likes) {
		this.likes = likes;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}


	public String getComentarios() {
		String text = "";
		
		for (Comentario coments : lista_comentarios) {
			text += coments.toString() + "\n";
		}
		return text;
	}

	public void addComentario(Comentario _coment) {
		lista_comentarios.add(_coment);
	}
	
	
	
	public String toString() {
		return "Disciplina: " + this.nome + "(" + this.id + ") - " + "Likes: " + this.likes + ", " + "nota: " + this.nota;
	}

}
