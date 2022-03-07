package model;


public class MainSoldier {
	
	private Gun gun;
	private String name;
	private static volatile MainSoldier soldier; 
	private MainSoldier() {
		if(soldier!=null){
			throw new RuntimeException("please use the getMainSoldier method");
		}
	}
	
	
	public static MainSoldier getMainSoldier() {
		if(soldier==null) {
			synchronized (MainSoldier.class) {
				if(soldier==null) {
					soldier = new MainSoldier();	
				}
				
			}
		}	
		return soldier;
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
