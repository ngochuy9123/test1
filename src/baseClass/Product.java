package baseClass;

import java.util.Arrays;

public abstract class Product {
	protected long id;
	protected long cost;
	protected String name;
	protected String type;
	protected String[] materials;
	
	public Product(long id, long cost, String name, String type, String[] materials) {
		super();
		this.id = id;
		this.cost = cost;
		this.name = name;
		this.type = type;
		this.materials = materials;
	}
	public Product() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String[] getMaterials() {
		return materials;
	}
	public void setMaterials(String[] materials) {
		this.materials = materials;
	}
	
	public void prepare() {
		for(String str:materials) {
			System.out.println(str+" ");
		}
	}
	
	public long giaTien(int tien) {
		return cost;
		
	}
}
