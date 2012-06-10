/**
 * 
 */
package es.gerardribas.persistence.dao;

import javax.persistence.EntityManager;

import es.gerardribas.persistence.domain.Bill;

/**
 * @author Gerard
 *
 */
public interface BillDao extends AbstractDao<Bill, Long>{
	
	EntityManager getEntityManager();

}
