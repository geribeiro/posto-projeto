package br.com.fiap.estacaorecarga.view;

import br.com.fiap.estacaorecarga.controller.ChargeStationController;
import br.com.fiap.estacaorecarga.view.resources.EnrollPanel;

import javax.swing.*;

public class Window extends JFrame{
	
	private static final long serialVersionUID = 1213123321L;
	
	private JTabbedPane abas = new JTabbedPane();
	
	private ChargeStationController estacaoRecargaControlador = new ChargeStationController(this);
	
	private EnrollPanel cadastro = new EnrollPanel(estacaoRecargaControlador);

	private ListPanel painelListagem = new ListPanel(estacaoRecargaControlador);
	
	public Window() {
		setSize(950, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public void init() {
		cadastro.init();
		painelListagem.init();
		
		abas.add(cadastro, "Enroll");
		abas.add(painelListagem, "List" );

		add(abas);
		setVisible(true);
	}

	public ListPanel buscarLista() { return painelListagem; }
}
