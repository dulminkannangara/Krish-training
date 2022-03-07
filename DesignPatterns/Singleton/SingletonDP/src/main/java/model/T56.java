package model;

public class T56 implements Gun{

	private static volatile T56 gun;
	private T56() {
		if(gun != null) {
			throw new RuntimeException("use getT56 method");
		}
	}
	
	public static T56 getT56() {
		if(gun==null) {
			synchronized (T56.class) {
				if(gun==null){
					gun = new T56();
				}
			}
		}
		return gun;
	}
	
	public void shoot() {
		System.out.println("Soldier "+MainSoldier.getMainSoldier().getName() +" is Shooting from T56...\n");
	}

}
