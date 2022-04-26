package br.com.alura.loja.transacao;

import br.com.alura.loja.entidades.Categoria;
import br.com.alura.loja.util.JpaUtil;

import javax.persistence.EntityManager;

public class CadastroDeProdutos {
    public static void main(String[] args) {
        Categoria celulares = new Categoria("CELULARES");

        EntityManager em = JpaUtil.entityManager();

        em.getTransaction().begin();

        em.persist(celulares);
        celulares.setNome("Iphone");

        em.flush();
        em.clear();

        celulares.setNome("1234");
        em.clear();
        em.remove(celulares);
        em.flush();
    }
}
