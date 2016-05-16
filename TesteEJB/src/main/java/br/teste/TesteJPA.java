package br.teste;

import javax.persistence.EntityManager;

import br.modelo.Usuario;
import br.util.JPAUtil;

public class TesteJPA {
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setNome("Regis Albuquerque");
		usuario.setSenha("123");
		
		EntityManager manager = new JPAUtil().getEntityManager();
		
		manager.getTransaction().begin();
		
		manager.persist(usuario);
		
		manager.getTransaction().commit();
		
		manager.close();
	}
}
