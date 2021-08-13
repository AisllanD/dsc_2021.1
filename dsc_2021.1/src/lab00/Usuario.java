package lab00;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String email;
	private int mat;
	private String senha;
	private ArrayList<Comentario> lista_comentarios = new ArrayList<Comentario>();
	
	
	
	public Usuario (String nome, String email, int mat, String senha) {
		this.nome = nome;
		this.email = email;
		this.mat = mat;
		this.senha = senha;
		
		
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String _nome) {
		this.nome = _nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String _email) {
		this.email = _email;
	}

	public int getMat() {
		return mat;
	}


	public void setMat(int _mat) {
		this.mat = _mat;
	}

	public String getSenha() {
		return senha;
	}


	public void setSenha(String _senha) {
		this.senha = _senha;
	}
	
	public String getComentarios() {
		String text = "";
		for (Comentario coment : lista_comentarios) {
			text += coment.toString() + "\n";
		}
		return text;
	}
	
	public void addComentario(Comentario _coment) {
		lista_comentarios.add(_coment);
	}
	
	
	public String toString() {
		return this.nome + "(" + this.mat + ")" + " - " + "e-mail: " + this.email;
	}

}
