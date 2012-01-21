/**
 * 
 */
package es.gerardribas.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import es.gerardribas.persistence.dao.CustomerDao;
import es.gerardribas.persistence.domain.Customer;

/**
 * @author Gerard Ribas Canals (gerard.ribas.canals@gmail.com)
 * Dao for {@link Customer} table
 */
@Repository
public class CustomerDaoImpl extends AbstractJpaDaoImpl<Customer, Long> implements CustomerDao {

	private static final long serialVersionUID = 1L;

}
