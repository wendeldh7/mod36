/**
 * 
 */
package br.com.gomes.dao.jpa;

import br.com.gomes.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.gomes.domain.jpa.ClienteJpa;

/**
 * @author wendel.gomes
 *
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
