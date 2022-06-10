package br.com.fiap.estacaorecarga.view.resources;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FieldText extends JTextField{

	private static final long serialVersionUID = 1123123123L;

		public FieldText() {
			super(20);

			init();
		}

		private void init() {
			this.setForeground(new Color(50,50,50));
			this.setBackground(Color.white);
			this.setBorder(new LineBorder(new Color(50, 50, 50)));
			this.setBorder(BorderFactory.createCompoundBorder(
					this.getBorder(),
					BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		}
}
