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

	public T findById(Class<T> claz, E primaryKey);

	public T update(T entity);

	public void persist(T entity);
	
	public void merge(T entity);

	public void remove(T entity);

	public List<T> findAll(Class<T> claz);

	public List<T> findAll(Class<T> claz, Integer startPosition,
			Integer maxResult);

}
