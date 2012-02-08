/**
 * 
 */
package es.gerardribas.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import es.gerardribas.persistence.dao.BillLineDao;
import es.gerardribas.persistence.domain.BillLine;
import es.gerardribas.persistence.domain.Customer;

/**
 * @author Gerard Ribas Canals (gerard.ribas.canals@gmail.com)
 * Dao for {@link Customer} table
 */
@Repository
public class BillLineDaoImpl extends AbstractJpaDaoImpl<BillLine, Long> implements BillLineDao {

	private static final long serialVersionUID = 1L;

}
