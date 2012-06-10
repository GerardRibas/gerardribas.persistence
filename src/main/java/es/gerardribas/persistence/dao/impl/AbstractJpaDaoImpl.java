/**
 * 
 */
package es.gerardribas.persistence.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import es.gerardribas.persistence.dao.AbstractJpaDao;

/**
 * @author Gerard Ribas Canals (gerard.ribas.canals@gmail.com)
 * 
 */
@SuppressWarnings("serial")
public abstract class AbstractJpaDaoImpl<T extends Serializable, E> implements
		AbstractJpaDao<T, E> {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public T findById(Class<T> claz, E primaryKey) {
		return entityManager.find(claz, primaryKey);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public T update(T entity) {
		return entityManager.merge(entity);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void persist(T entity) {
		entityManager.persist(entity);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void remove(T entity) {
		entityManager.remove(entity);
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<T> findAll(Class<T> claz) {
		return findAll(claz, null, null);
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<T> findAll(Class<T> claz, Integer startPosition,
			Integer maxResult) {
		StringBuilder sb = new StringBuilder();
		sb.append("FROM ").append(claz.getSimpleName());
		Query query = entityManager.createQuery(sb.toString());

		if (startPosition != null) {
			query.setFirstResult(startPosition);
		}

		if (maxResult != null) {
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
