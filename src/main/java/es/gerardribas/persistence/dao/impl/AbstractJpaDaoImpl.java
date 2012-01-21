/**
 * 
 */
package es.gerardribas.persistence.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 * @author Gerard Ribas Canals (gerard.ribas.canals@gmail.com)
 *
 */
public abstract class AbstractJpaDaoImpl<T extends Serializable, E>{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public T findById(Class<T> claz, E primaryKey){
		return entityManager.find(claz, primaryKey);
	}
	
	public T update(T entity){
		return entityManager.merge(entity);
	}
	
	public void persist(T entity){
		entityManager.persist(entity);
	}
	
	public void remove(T entity) {
		entityManager.remove(entity);
	}

	public List<T> findAll(Class<T> claz){
		return findAll(claz, null, null);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(Class<T> claz, Integer startPosition, Integer maxResult){
		StringBuilder sb = new StringBuilder();
		sb.append("FROM ").append(claz.getSimpleName());
		Query query = entityManager.createQuery(sb.toString());
		
		if(startPosition != null){
			query.setFirstResult(startPosition);
		}
		
		if(maxResult != null){
			query.setMaxResults(maxResult);
		}
		
		return query.getResultList();
	}
	
	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
