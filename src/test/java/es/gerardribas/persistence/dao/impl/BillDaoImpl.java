/**
 * 
 */
package es.gerardribas.persistence.dao.impl;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import es.gerardribas.persistence.dao.BillDao;
import es.gerardribas.persistence.domain.Bill;
import es.gerardribas.persistence.domain.Customer;

/**
 * @author Gerard Ribas Canals (gerard.ribas.canals@gmail.com)
 * Dao for {@link Customer} table
 */
@Repository
public class BillDaoImpl extends AbstractJpaDaoImpl<Bill, Long> implements BillDao {

	private static final long serialVersionUID = 1L;
	
	@Override
	public EntityManager getEntityManager() {
		return super.getEntityManager();
	}

}
