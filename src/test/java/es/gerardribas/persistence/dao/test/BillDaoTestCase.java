/**
 * 
 */
package es.gerardribas.persistence.dao.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.hibernate.LazyInitializationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.gerardribas.persistence.dao.BillDao;
import es.gerardribas.persistence.dao.CustomerDao;
import es.gerardribas.persistence.dao.ProductDao;
import es.gerardribas.persistence.domain.Bill;
import es.gerardribas.persistence.domain.BillLine;
import es.gerardribas.persistence.domain.Customer;
import es.gerardribas.persistence.domain.Product;

/**
 * @author Gerard Ribas Canals (gerard.ribas.canals@gmail.com)
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/spring-config.xml")
public class BillDaoTestCase extends AbstractTransactionalJUnit4SpringContextTests {
		
	@Autowired
	private BillDao billDao;
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private ProductDao productDao;

	@Test
	public void testFindById() {
		Assert.assertNotNull(billDao.findById(Bill.class, 2L));
	}
	
	@Test
	public void testListAllBills() {
		List<Bill> bills = billDao.findAll(Bill.class);
		Assert.assertNotNull(bills);
		Assert.assertEquals(100, bills.size());
	}
	
	@Test
	public void testListAllBillsWithChilds() {
		List<Bill> bills = billDao.findAll(Bill.class);
		Assert.assertNotNull(bills);
		
		try {
			for(Bill bill : bills){
				bill.getCustomer().getName();
				bill.getDetail().size();
			}	
		} catch (LazyInitializationException e) {
			Assert.fail(e.getMessage());
		}
		Assert.assertEquals(100, bills.size());
	}
	
	@Test
	public void testListFirstTenBills() {
		List<Bill> customers = billDao.findAll(Bill.class,0,10);
		Assert.assertNotNull(customers);
		Assert.assertEquals(10, customers.size());
	}
	
	@Test
	public void testPersist() {
		
		Bill bill = new Bill();
		bill.setCustomer(customerDao.findById(Customer.class, 0L));
		bill.setDate(new Date());
		bill.setPrice(1F);
		
		List<BillLine> list = new ArrayList<BillLine>();
			BillLine billLine = new BillLine();
			billLine.setBill(bill);
			billLine.setPriceLine(1F);
			billLine.setProduct(productDao.findById(Product.class, 0L));
		list.add(billLine);
		
		bill.setDetail(list);
		
		billDao.persist(bill);
	}

}
