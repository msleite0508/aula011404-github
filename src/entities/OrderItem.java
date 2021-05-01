package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Product_sec13 product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Product_sec13 product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product_sec13 getProduct() {
		return product;
	}

	public void setProduct(Product_sec13 product) {
		this.product = product;
	}

	public Double subTotal() {
		return price * quantity;
	}
	
	public String toString() {
		return "Order items:"
				+ product.getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
