package lab00;

import java.util.ArrayList;

public class Dados {
	private ArrayList<Disciplina> lista_disciplinas = new ArrayList<Disciplina>();
	private ArrayList<Usuario> lista_alunos = new ArrayList<Usuario>();
	
	
	public ArrayList<Usuario> get_lista_alunos(){
		return lista_alunos;
	}
	
	public ArrayList<Disciplina> get_lista_disciplinas(){
		return lista_disciplinas;
	}
	
	
}
