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

public class Cliente {

    private Long Id;
    private String nome;
    private List<Venda> vendas;


    public Cliente(){
        this("");
    }

    public Cliente(String nome){
        this.nome = nome;
    }

    public void setId(Long Id){
		this.Id = Id;
	}
	public Long getId(){
		return this.Id;
	}

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setVenda(List<Venda> vendas){
        this.vendas = vendas;
    }
    public List<Venda> getVenda(){
        return this.vendas;
    }

    @Override
	public String toString(){
		return "Cliente[nome="+ nome + "]";
	}
}