package me.cuale.model;

public class MenuItem {
	int menuItemId;
	String name;
	String imageUrl;
	String description;
	double price;
	
	public MenuItem() {}

	public MenuItem(int menuItemId, String name, String imageUrl, String description, double price) {
		super();
		this.menuItemId = menuItemId;
		this.name = name;
		this.imageUrl = imageUrl;
		this.description = description;
		this.price = price;
	}

	public int getMenuItemId() {
		return menuItemId;
	}

	public void setMenuItemId(int menuItemId) {
		this.menuItemId = menuItemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
