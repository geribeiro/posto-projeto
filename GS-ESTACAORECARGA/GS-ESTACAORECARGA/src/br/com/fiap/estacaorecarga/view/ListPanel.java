package br.com.fiap.estacaorecarga.view;

import br.com.fiap.estacaorecarga.controller.ChargeStationController;
import br.com.fiap.estacaorecarga.model.ChargeStation;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.List;

public class ListPanel extends JPanel {
	
	private static final long serialVersionUID = 11234354356L;
	
	private String[] colunas = {"id", "name", "street", "district", "city", "state", "plug", "classification", "price"};

	private DefaultTableModel tabelaModel = new DefaultTableModel(colunas, 0);

	private JTable tabela = new JTable(tabelaModel);

	private JScrollPane scroll = new JScrollPane(tabela);
	
	private JButton delecaoBtn = new JButton("Delete");
	
	private ChargeStationController estacaoRecargaControlador;
	
	public ListPanel(ChargeStationController estacaoRecargaControlador) {
		this.estacaoRecargaControlador = estacaoRecargaControlador;
	}
	
	public void init() {
		setLayout(null);
		tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		scroll.setBounds(0 ,0, 1000, 300);

		this.add(scroll);
		
		delecaoBtn.setBounds(10, 300, 100, 30);

		delecaoBtn.addActionListener((ActionEvent e)->{
			String id = (String) tabela.getValueAt(tabela.getSelectedRow(), 0);

			estacaoRecargaControlador.delecao(Long.parseLong(id,10));
		});

		this.add(delecaoBtn);
		atualizar();
	}
	
	public void atualizar() {
		tabelaModel.setRowCount(0);

		List<ChargeStation> estacaoRecargas = estacaoRecargaControlador.listStations();
		estacaoRecargas.forEach(estacaoRecarga -> tabelaModel.addRow(estacaoRecarga.geraVetor()));
	}
	

}
