package lab00;

import javax.swing.JOptionPane;

public class Fachada {

	Usuario user;
	validaUsuario _vUser = new validaUsuario();
	validaDiciplina _vDis = new validaDiciplina();
	
	
	public void relizaCadastro (String _nome, String _email, int _matricula, String _senha) {
		
		boolean existe = _vUser.verificaMatricula(_matricula);
		
		if(existe) JOptionPane.showMessageDialog(null, "Matrícula já cadastrada!");
		
		else {
			Usuario _user = new Usuario(_nome, _email, _matricula, _senha);
			_vUser.addUsuario(_user);
			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		}	
	}
	
	public void login (String email, String senha) {
		
		user = _vUser.realiza_login(email, senha);
		
		if (_vUser == null) {
			JOptionPane.showMessageDialog(null, "Falha no login!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Bem vindo,  " + user.getNome().split(" ")[0] + "!");	
		}
	}
	
	public void cadastra_NovaDisciplina() {
		
	}
	
	public void recuperaTodasDisciciplinas() {
		
	}
	
	public void atualizaNomeDisciplina() {
		
	}
	
	public void atualizaNotaDisciplina() {
		
	}
	
	public void adicionaComentarioDisciplina() {
		
	}
	
    public void removeComentario() {
		
	}
	
    public void removeDisciplina() {
		
	}
    
    public void recuperaDisciplina() {
		
	}
    
    public void recuperaDisciciplinasNotas() {
		
	}
    
}
