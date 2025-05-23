package dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Produto {
	

	private Long Id;
	private String nome;
	private double preco;
	private List<Venda> vendas;
	
	
	public Produto() {
		this("",0);
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}
	public double getPreco(){
		return preco;
	}

	public void setVenda(List<Venda> vendas){
		this.vendas = vendas;
	}
	public List<Venda> getVenda(){
		return this.vendas;
	}

	@Override
	public String toString(){
		return "Produto[nome="+ nome + ", preço=" + preco + "]";
	}

}
