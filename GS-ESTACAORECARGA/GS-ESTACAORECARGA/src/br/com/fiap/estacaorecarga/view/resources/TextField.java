package br.com.fiap.estacaorecarga.view.resources;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TextField extends JTextArea{


	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int colunas = 30;
	private int linhas = 5;

	public TextField() {
		init();
	}

	private void init() {
		this.setColumns(colunas);
		this.setRows(linhas);
		this.setBorder(new LineBorder(new Color(233, 28, 93)));
		this.setFont(new Font("Arial", Font.BOLD, 14));
		
	}
}
