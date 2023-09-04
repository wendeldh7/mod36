/**
 * 
 */
package br.com.gomes.dao;

import br.com.gomes.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.gomes.dao.jpa.IVendaJpaDAO;
import br.com.gomes.domain.jpa.VendaJpa;
import br.com.gomes.exceptions.DAOException;
import br.com.gomes.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author wendel.gomes
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
