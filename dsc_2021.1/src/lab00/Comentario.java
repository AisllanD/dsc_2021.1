package lab00;

public class Comentario {
	private Usuario autor;
	private String texto;
	
	
	public Comentario(Usuario autor, String texto) {
		this.autor = autor;
		this.texto = texto;
	}
	
	
	public Usuario getAutor() {
		return this.autor;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public void setTexto(String _texto) {
		this.texto = _texto;
	}
	
	public String toString() {
		return this.autor + "\n" + this.texto;
	}
	
}
