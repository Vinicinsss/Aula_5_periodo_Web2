package dominio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


public class Venda {
	
	private Long Id;
	private Long valorTotal;
	private List<Produto> produtos;
	//public Cliente;

	public Venda(){
		this(0);
	}

	public Venda(double valorTotal){
		this.valorTotal = valorTotal;
	}

	public void setId(Long Id){
		this.Id = Id;
	}
	public Long getId(){
		return this.Id;
	}

	public void setValorTotal(double valorTotal){
		this.valorTotal = valorTotal;
	}
	public double getValorTotal(){
		return this.valorTotal;
	}
	public void setProdutos(List<Produto> produtos){
		this.produtos = produtos;
	}

	public List<Produto> getProdutos(){
		return this.produtos;
	}

	@Override
	public String toString(){
		return "Venda[id =" + id + "valor total=" + valorTotal+ "]";
	}

}
