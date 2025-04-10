package aplicativo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Cliente;
import dominio.Produto;
import dominio.Venda;

public class Principal {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = null;
        EntityManager em = null;
        
        try {
            // Instancia o EntityManagerFactory com as configurações de persistencia
            emf = Persistence.createEntityManagerFactory("aula-jpa");
            // Instancia o EntityManager
            em = emf.createEntityManager(); 
            
            em.getTransaction().begin();
    
            Produto objP1 = new Produto("Monitor", 850);
            Produto objP2 = new Produto("Notebook", 4500);
            Produto objP3 = new Produto("Mouse", 400);
            Produto objP4 = new Produto("Teclado", 600);

            em.persist(objP1);
            em.persist(objP2);
            em.persist(objP3);
            em.persist(objP4);

            Cliente objC1 = new Cliente("Vinicius");
            Cliente objC2 = new Cliente("Miudo");
            Cliente objC3 = new Cliente("Biel");
            Cliente objC4 = new Cliente("Tatu");

            Venda objV1 = new Venda(5350);
            Venda objV2 = new Venda(1000);
            Venda objV3 = new Venda(1450);
            Venda objV4 = new Venda(4900);

            objV1.setProdutos(Arrays.asList(objP1, objP2));
            objV2.setProdutos(Arrays.asList(objP3, objP4));
            objV3.setProdutos(Arrays.asList(objP4, objP1));
            objV4.setProdutos(Arrays.asList(objP2, objP3));

            objV1.setCliente(objC1);
            objV2.setCliente(objC2);
            objV3.setCliente(objC3);
            objV4.setCliente(objC4);

            objC1.setVendas(Arrays.asList(objV1));
            objC2.setVendas(Arrays.asList(objV2));
            objC3.setVendas(Arrays.asList(objV3));
            objC4.setVendas(Arrays.asList(objV4));

            em.persist(objC1);
            em.persist(objC2);
            em.persist(objC3);
            em.persist(objC4);

            em.persist(objV1);
            em.persist(objV2);
            em.persist(objV3);
            em.persist(objV4);

            em.getTransaction().commit();

            // Example lists (ensure these are properly populated)
            List<Cliente> listaClientes = Arrays.asList(objC1, objC2, objC3, objC4);
            List<Produto> listaProdutos = Arrays.asList(objP1, objP2, objP3, objP4);
            List<Venda> listaVendas = Arrays.asList(objV1, objV2, objV3, objV4);
            
            // Inserir os laços for aqui!
            for(Cliente objC : listaClientes) {
                System.out.println(objC);
            }
            
            for(Produto objP: listaProdutos) {
                System.out.println(objP);
            }

            for(Venda objV: listaVendas) {
                System.out.println(objV);
            }
            
        } catch (Exception e) {
            if (em != null && em.getTransaction() != null) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }
}
