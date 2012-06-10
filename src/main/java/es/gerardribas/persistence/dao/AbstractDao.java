/**
 * 
 */
package es.gerardribas.persistence.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author Gerard Ribas Canals (gerard.ribas.canals@gmail.com)
 * 
 */
public interface AbstractDao<T, E> extends Serializable {

	T findById(Class<T> claz, E primaryKey);

	T update(T entity);

	void persist(T entity);

	void remove(T entity);

	List<T> findAll(Class<T> claz);

	List<T> findAll(Class<T> claz, Integer startPosition,
			Integer maxResult);

}
