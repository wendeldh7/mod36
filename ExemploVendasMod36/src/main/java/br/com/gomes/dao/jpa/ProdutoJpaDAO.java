/**
 * 
 */
package br.com.gomes.dao.jpa;

import br.com.gomes.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.gomes.domain.jpa.ProdutoJpa;

/**
 * @author wendel.gomes
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
