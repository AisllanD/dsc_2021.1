package lab00;

public class validaUsuario {
	
	Dados dadosU = new Dados();
	
	
	public boolean verificaMatricula(int matricula) {
		for (Usuario u : dadosU.get_lista_alunos()) {
			if (u.getMat() == matricula) {
				return true;
			}
		}return false;
	}
	
	
	public void addUsuario(Usuario _u) {
		dadosU.get_lista_alunos().add(_u);
	}
	
	
	public Usuario realiza_login(String email, String senha){
		for (Usuario u : dadosU.get_lista_alunos()) {
			if (u.getEmail() == email && u.getSenha() == senha) {
				return u;
			}
		}
		return null;
		
	}

}
