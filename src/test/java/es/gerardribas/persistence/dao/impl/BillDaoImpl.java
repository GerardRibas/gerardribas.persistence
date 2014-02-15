/**
 *
 */
package es.gerardribas.persistence.dao.impl;

import es.gerardribas.persistence.dao.BillDao;
import es.gerardribas.persistence.domain.Bill;
import es.gerardribas.persistence.domain.Customer;
import org.springframework.stereotype.Repository;

/**
 * @author Gerard Ribas Canals (gerard.ribas.canals@gmail.com)
 *         Dao for {@link Customer} table
 */
@Repository
public class BillDaoImpl extends AbstractJpaDaoImpl<Bill, Long> implements BillDao {

    private static final long serialVersionUID = 1L;

}
