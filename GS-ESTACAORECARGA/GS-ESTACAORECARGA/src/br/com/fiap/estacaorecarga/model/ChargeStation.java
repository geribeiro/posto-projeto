package br.com.fiap.estacaorecarga.model;

import javax.persistence.*;
import java.util.List;
import java.util.Vector;

@Entity
public class ChargeStation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ElementCollection
	private List<String> plugs;

	private String nome;

	private String rua;

	private String bairro;

	private String cidade;

	private String estado;

	private int avaliacao;

	private Double preco;

	public ChargeStation() {
	}

	public ChargeStation(String nome, String rua, String bairro, String cidade, String estado, List<String> plugs, int avaliacao, Double preco) {
		this.nome = nome;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.plugs = plugs;
		this.avaliacao = avaliacao;
		this.preco = preco;
	}

	public Vector<String> geraVetor() {
		Vector<String> dados = new Vector<>();
		dados.add(id.toString());
		dados.add(nome);
		dados.add(rua);
		dados.add(bairro);
		dados.add(cidade);
		dados.add(estado);
		dados.add(String.valueOf(plugs));
		dados.add(String.valueOf(avaliacao));
		dados.add(preco.toString());
		return dados;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String street) {
		this.rua = street;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String district) {
		this.bairro = district;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String city) {
		this.cidade = city;
	}


	public String getEstado() {
		return estado;
	}

	public void setEstado(String genre) {
		this.estado = genre;
	}

	public List<String> getPlugs() {
		return plugs;
	}

	public void setPlugs(List<String> plugs) {
		this.plugs = plugs;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double price) {
		this.preco = price;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int rating) {
		this.avaliacao = rating;
	}
}
