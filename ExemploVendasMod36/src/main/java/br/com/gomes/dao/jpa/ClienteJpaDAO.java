/**
 * 
 */
package br.com.gomes.dao.jpa;

import br.com.gomes.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.gomes.domain.jpa.ClienteJpa;

/**
 * @author wendel.gomes
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
