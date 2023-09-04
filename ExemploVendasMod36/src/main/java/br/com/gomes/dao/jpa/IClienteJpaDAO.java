/**
 * 
 */
package br.com.gomes.dao.jpa;

import br.com.gomes.dao.generic.jpa.IGenericJapDAO;
import br.com.gomes.domain.jpa.Persistente;

/**
 * @author wendel.gomes
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
