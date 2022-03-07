package edu;

public class Flower {
	private String name;
	private String color;
	private Boolean wild = true;
	
	public Flower(String name, String color, Boolean wild) {
		this.name = name;
		this.color = color;
		this.wild = wild;
	}
	
	public Flower(String name, String color) {
		this(name,color,true);	
	}
	
	public Flower(String name) {
		this(name, "알지못함");
	}
	

	

	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public Boolean isWild() {
		return wild;
	}
}
