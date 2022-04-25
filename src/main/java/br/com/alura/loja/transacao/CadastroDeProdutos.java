package br.com.alura.loja.transacao;

import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.entidades.Produto;
import br.com.alura.loja.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProdutos {
    public static void main(String[] args) {

        Produto celular = new Produto();
        celular.setNome("Xiome Redmi");
        celular.setDescricao("Muito legal");
        celular.setPreco(new BigDecimal("800"));

        EntityManager em = JpaUtil.entityManager();
        ProdutoDao dao = new ProdutoDao(em);

        em.getTransaction().begin();
        dao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();

    }
}
