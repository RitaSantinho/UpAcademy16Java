package io.altar.relations.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Shelf.GET_ALL_SHELVES, query = "SELECT s FROM Shelf s") })
public class Shelf extends Entity_ {
	
	public static final String GET_ALL_SHELVES = "getAllShelves";

	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.EAGER)
	private Product product;
	private int capacity;
	private float dailyPrice;

	public static String getName() {
		return "Shelf";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public float getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(float dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	@Override
	public String toString() {
		long productId = (product == null) ? 0 : product.getId();
		return "Shelf [product=" + productId + ", capacity=" + capacity + ", dailyPrice=" + dailyPrice + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + capacity;
		result = prime * result + Float.floatToIntBits(dailyPrice);
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shelf other = (Shelf) obj;
		if (capacity != other.capacity)
			return false;
		if (Float.floatToIntBits(dailyPrice) != Float.floatToIntBits(other.dailyPrice))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}
	
	
}
