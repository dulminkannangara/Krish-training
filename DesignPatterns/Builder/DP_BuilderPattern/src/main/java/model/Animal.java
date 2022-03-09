package model;

public class Animal{

	private final String name;
	private final String category;
	private final int numOfLegs;
	private final String colour;
	private final int lifetime;
	
	private Animal(Builder builder) {
		this.name = builder.name;
		this.category = builder.category;
		this.numOfLegs = builder.numOfLegs;
		this.colour = builder.colour;
		this.lifetime = builder.lifetime;
	}
	
	public static class Builder{
		private String name;
		private String category;
		private int numOfLegs;
		private String colour;
		private int lifetime;
		
		public Animal build() {
			return new Animal(this);
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setCategory(String category) {
			this.category = category;
			return this;
		}
		public Builder setNumOfLegs(int numOfLegs) {
			this.numOfLegs = numOfLegs;
			return this;
		}
		public Builder setColour(String colour) {
			this.colour = colour;
			return this;
		}
		public Builder setLifetime(int lifetime) {
			this.lifetime = lifetime;
			return this;
		}
		
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", category=" + category + ", numOfLegs=" + numOfLegs + ", colour=" + colour
				+ ", lifetime=" + lifetime + "]";
	}
	
	
	
	
}
