package model;

public class Pistol implements Gun{

	private static volatile Pistol gun;
	private Pistol() {
		if(gun != null) {
			throw new RuntimeException("use getPistol method");
		}
	}
	
	public static Pistol getPistol() {
		if(gun==null) {
			synchronized (Pistol.class) {
				if(gun==null){
					gun = new Pistol();
				}
			}
		}
		return gun;
	}
	
	public void shoot() {
		System.out.println("Soldier "+MainSoldier.getMainSoldier().getName() +" is Shooting from Pistol...\n");
	}

}
