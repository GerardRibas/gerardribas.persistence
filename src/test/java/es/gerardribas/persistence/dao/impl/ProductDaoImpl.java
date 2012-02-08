/**
 * 
 */
package es.gerardribas.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import es.gerardribas.persistence.dao.ProductDao;
import es.gerardribas.persistence.domain.Product;

/**
 * @author Gerard
 *
 */
@Repository
public class ProductDaoImpl extends AbstractJpaDaoImpl<Product, Long> implements ProductDao {

	private static final long serialVersionUID = 1L;

}
