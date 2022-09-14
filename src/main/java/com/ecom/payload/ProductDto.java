package com.ecom.payload;


public class ProductDto {

	
    private int productId;
	
	private String productName;
	
	private String productDesc;
	
	private double productPrice;
	
	private boolean stock;
	
	private boolean live;
	
	
	private String imageName;
	
	private CategoryDto category;


	public ProductDto(int productId, String productName, String productDesc, double productPrice, boolean stock,
			boolean live, String imageName) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
		this.stock = stock;
		this.live = live;
		this.imageName = imageName;
	}


	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDesc() {
		return productDesc;
	}


	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public boolean isStock() {
		return stock;
	}


	public void setStock(boolean stock) {
		this.stock = stock;
	}


	public boolean isLive() {
		return live;
	}


	public void setLive(boolean live) {
		this.live = live;
	}


	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public CategoryDto getCategory() {
		return category;
	}


	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	
	
}
