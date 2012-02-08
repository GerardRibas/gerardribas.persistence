/**
 * 
 */
package es.gerardribas.persistence.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Gerard
 *
 */
@Entity
@Table(name = "BILLS")
public class Bill implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="customerid")
	private Customer customer;
	
	@Column
	private Date date;
	
	@Column
	private Float price;
	
	@OneToMany(mappedBy = "bill", cascade=CascadeType.ALL)
	private List<BillLine> detail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getDate() {
		return date;
	}
	
	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<BillLine> getDetail() {
		return detail;
	}

	public void setDetail(List<BillLine> detail) {
		this.detail = detail;
	}
}
