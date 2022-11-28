package com.ty.mobiles.mobile_brands.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mobile {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String storage;
	private String colour;
	private int cost;
	private double size;
	private int warrenty;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setNamme(String name) {
		this.name = name;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getWarrenty() {
		return warrenty;
	}
	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}
	@Override
	public String toString() {
		return "Mobiles [id=" + id + ", name=" + name + ", storage=" + storage + ", colour=" + colour + ", cost="
				+ cost + ", size=" + size + ", warrenty=" + warrenty + "]";
	}
	
}
