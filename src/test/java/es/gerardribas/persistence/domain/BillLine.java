/**
 * 
 */
package es.gerardribas.persistence.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Gerard
 *
 */
@Entity
@Table(name = "BILLS_LINES")
public class BillLine implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="billid")
	private Bill bill;
	
	@ManyToOne
	@JoinColumn(name="productid")
	private Product product;
	
	@Column(name = "price")
	private Float priceLine;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Float getPriceLine() {
		return priceLine;
	}

	public void setPriceLine(Float priceLine) {
		this.priceLine = priceLine;
	}
	
}
