package view.cliente;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import view.TelaPessoaMenu;

/**
 * Exibe as op��es referentes aos clientes da loja
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class ClienteMenu implements ActionListener {
	private static JFrame principalCliente = new JFrame("Loja de �culos");
	private static JLabel titulo = new JLabel("Clientes");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");
	private static JButton voltar = new JButton("Voltar");
	
	/**
	 * Define o tamanho e posi��o dos bot�es e do frame
	 * Implementa o ActionListener para que os bot�es possam reconhecer o click
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public ClienteMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(155, 10, 150, 30);
		
		principalCliente.add(titulo);
		principalCliente.add(visualizar);
		principalCliente.add(cadastrar);
		principalCliente.add(deletar);
		principalCliente.add(buscar);
		principalCliente.add(voltar);
		
		cadastrar.setBounds(140, 50, 100, 30);
		visualizar.setBounds(140, 100, 100, 30);
		deletar.setBounds(140, 150, 100, 30);
		buscar.setBounds(140, 200, 100, 30);
		voltar.setBounds(10, 230, 70, 25);
		
		principalCliente.setLayout(null);

		principalCliente.setSize(400, 300);
		principalCliente.setVisible(true);
		
		visualizar.addActionListener(this);
		cadastrar.addActionListener(this);
		deletar.addActionListener(this);
		buscar.addActionListener(this);
		voltar.addActionListener(this);
	}

	/**
	 * Redireciona o usu�rio para a tela desejada
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == visualizar) {
			new TelaVisualizaCliente();
			principalCliente.dispose();
		}

		if (src == cadastrar) {
			new TelaCadastroCliente();
			principalCliente.dispose();
		}
		
		if (src == deletar) {
			new TelaApagaCliente();
			principalCliente.dispose();
		}
		
		if (src == buscar) {
			new TelaBuscaCliente();
			principalCliente.dispose();
		}
		
		if (src == voltar) {
			new TelaPessoaMenu();
			principalCliente.dispose();
		}
	}
	
}
