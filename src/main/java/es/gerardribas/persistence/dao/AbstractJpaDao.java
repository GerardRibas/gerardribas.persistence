/**
 * 
 */
package es.gerardribas.persistence.dao;

import java.io.Serializable;

/**
 * @author Gerard Ribas Canals (gerard.ribas.canals@gmail.com)
 * 
 */
public interface AbstractJpaDao<T extends Serializable, E> extends
		AbstractDao<T, E> {

}
