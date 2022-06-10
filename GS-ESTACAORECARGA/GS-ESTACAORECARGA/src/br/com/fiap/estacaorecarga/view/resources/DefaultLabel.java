package br.com.fiap.estacaorecarga.view.resources;

import javax.swing.*;
import java.awt.*;

public class DefaultLabel extends JLabel {
	
	private static final long serialVersionUID = 112381239L;

	public DefaultLabel(String text) {
		this.setText(text);

		init();
	}
	
	private void init() {
		this.setForeground(new Color(80,80,80));

		this.setFont(new Font("Arial", Font.ITALIC, 14));
	}
}
