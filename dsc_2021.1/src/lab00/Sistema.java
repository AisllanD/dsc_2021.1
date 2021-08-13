package lab00;

import javax.swing.JOptionPane;

public class Sistema {
	
	static Fachada fachada = new Fachada();

	
	public static void main(String []args) {
		
		
		JOptionPane.showMessageDialog(null, "BEM VINDO");
		
		
		boolean sair = false;
		while(!sair) {
			
			int op = Integer.parseInt(JOptionPane.showInputDialog ("==========================\n" + "MENU \n" + "==========================\n"
				
					+ "1.Login\n"
					+ "2.Cadastro\n"
					+ "3.Sair"));
			
			if(op == 1) {
				
				String _email = JOptionPane.showInputDialog("Digite o seu email");
				String _senha = JOptionPane.showInputDialog("Digite sua senha");
				
				fachada.login(_email, _senha);
				
				/*
				user = vUser.realiza_login(_email, _senha);
				if (user == null) {
					JOptionPane.showMessageDialog(null, "Falha no login!");
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Bem vindo,  " + user.getNome().split(" ")[0] + "!");
					
					
				}
				*/
				
				
			}
			if(op == 2) {
				
				String _nome = JOptionPane.showInputDialog("Digite seu nome");
				String _email = JOptionPane.showInputDialog("Digite seu email");
				int _matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite sua matrícula"));
				String _senha = JOptionPane.showInputDialog("Digite sua senha");
				
				fachada.relizaCadastro(_nome, _email, _matricula, _senha);
				
				/* boolean existe = vUser.verificaMatricula(_matricula);
				
				if(existe) JOptionPane.showMessageDialog(null, "Matrícula já cadastrada!");
				
				else {
					Usuario _user = new Usuario(_nome, _email, _matricula, _senha);
					vUser.addUsuario(_user);
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				}
				*/
				
			}
			
			if(op == 3) {
				JOptionPane.showMessageDialog(null, "Saiu do sistema!");
				sair = true;
			}
		
		}
		
	}
	
}
