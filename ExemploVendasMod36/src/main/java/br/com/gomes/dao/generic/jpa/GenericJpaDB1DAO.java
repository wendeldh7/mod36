/**
 * 
 */
package br.com.gomes.dao.generic.jpa;

import java.io.Serializable;

import br.com.gomes.domain.jpa.Persistente;

/**
 * @author wendel.gomes
 *
 */
public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre1");
	}

}
