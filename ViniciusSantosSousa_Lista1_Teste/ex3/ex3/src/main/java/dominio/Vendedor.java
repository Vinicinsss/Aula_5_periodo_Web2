package dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity //entidade de domínio
@DiscriminatorValue("V")
public class Vendedor extends Pessoa {
	
	//private static final long serialVersionUID = 1L; //Id padrão do Serializable
	
	private int matriculaVendedor;
	
	public Vendedor() {
		this("",0,0);
	}
	
	public Vendedor(String nome, int idade, int matriculaVendedor) {
		super(nome,idade);
		setMatriculaVendedor(matriculaVendedor);
	}
	
	public int getMatriculaVendedor() {
		return this.matriculaVendedor;
	}

	public void setMatriculaVendedor(int matriculaVendedor) {
		this.matriculaVendedor = matriculaVendedor;
	}
	
	@Override
	public String toString() {
		return "Vendedor [idPessoa= " + super.getIdPessoa() + ", nome= " + super.getNome() + ", matriculaVendedor= "
		+ getMatriculaVendedor() + "]";
	}
	
	public void imprimeDados() {
		System.out.println("Nome: "+ super.getNome());
		System.out.println("IDADE: "+ super.getIdade());
		System.out.println("Matricula Vendedor: "+ getMatriculaVendedor());
	}
}