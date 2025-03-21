package aplicativo;

import dominio.Vendedor;
import dominio.Pessoa;
import dominio.Cliente;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa"); //Instancia o EntityManagerFactory com as configurações de persistencia
		EntityManager em = emf.createEntityManager(); //Intancia o EntityManager
		
		Cliente cliente1 = new Cliente("Rafael", 35, 0001);
		Vendedor vendedor1 = new Vendedor("Vinicius", 19, 0001);
		
		
		em.getTransaction().begin();// iniciar transação com banco de dados
		
		em.persist(cliente1);
		em.persist(vendedor1);
		
		
		Query consultaC = em.createQuery("select cliente from Cliente cliente"); //consulta em jpql
		ArrayList<Cliente> listaC = (ArrayList<Cliente>) consultaC.getResultList();
		
		Query consultaV = em.createQuery("select vendedor from Vendedor vendedor"); //consulta em jpql
		ArrayList<Vendedor> listaV = (ArrayList<Vendedor>) consultaV.getResultList();
		
		em.getTransaction().commit();//confirmar as alterações realizadas
		
		emf.close();
		em.close();
		
		for(Cliente objC: listaC) {
			System.out.println(objC);
		}
		
		for(Vendedor objV: listaV) {
			System.out.println(objV);
		}
	}			
}