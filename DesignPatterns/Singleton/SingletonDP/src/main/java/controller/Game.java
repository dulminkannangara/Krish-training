package controller;

import java.util.Scanner;

import model.MainSoldier;
import model.Pistol;
import model.T56;

public class Game {

	private static int gunNum = 0;
	private static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.println("~ ~ ~ ~ ~ Soldier Game ~ ~ ~ ~ ~\n");
		setSoldierName();
		pickUpGun();
		int option = 0;
		do {
			System.out.println("\n---Enter Option---");
			System.out.println(" (1) Shoot");
			System.out.println(" (2) Change Gun");
			System.out.println(" (3) Change Name");
			System.out.println(" (4) Exit");
			System.out.print("\n Select : ");
			option = scn.nextInt();
		} while (run(option));

	}

	private static boolean run(int option) {
		if (option == 1) {
			MainSoldier.getMainSoldier().getGun().shoot();
			return true;
		} else if (option == 2) {
			pickUpGun();
			return true;
		} else if (option == 3) {
			setSoldierName();
			return true;
		} else {
			return false;
		}

	}

	private static void setSoldierName() {
		System.out.print("Enter MainSoldier name : ");
		String name = scn.next();
		MainSoldier.getMainSoldier().setName(name);
	}

	private static void pickUpGun() {

		do {
			System.out.println("\nSelect Gun ");
			System.out.println("(1) T56");
			System.out.println("(2) Pistol");
			System.out.print(" Select : ");
			gunNum = scn.nextInt();
			selectGun(gunNum);

		} while (!selectGun(gunNum));
	}

	private static boolean selectGun(int gun) {
		if (gun == 1) {
			MainSoldier.getMainSoldier().setGun(T56.getT56());
			return true;
		} else if (gun == 2) {
			MainSoldier.getMainSoldier().setGun(Pistol.getPistol());
			return true;
		} else {
			return false;
		}
	}

}
