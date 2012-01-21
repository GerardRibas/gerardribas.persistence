/**
 * 
 */
package es.gerardribas.persistence.dao.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.gerardribas.persistence.dao.CustomerDao;
import es.gerardribas.persistence.domain.Customer;

/**
 * @author Gerard Ribas Canals (gerard.ribas.canals@gmail.com)
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/spring-config.xml")
public class CustomerDaoTestCase {
	
	@Autowired
	CustomerDao customerDao;

	@Test
	public void testFindById() {
		Assert.assertNotNull(customerDao.findById(Customer.class, 2L));
	}
	
	@Test
	public void testListAllCustomers() {
		List<Customer> customers = customerDao.findAll(Customer.class);
		Assert.assertNotNull(customers);
		Assert.assertEquals(20, customers.size());
	}
	
	@Test
	public void testListFirstTenCustomers() {
		List<Customer> customers = customerDao.findAll(Customer.class,0,10);
		Assert.assertNotNull(customers);
		Assert.assertEquals(10, customers.size());
	}

}
