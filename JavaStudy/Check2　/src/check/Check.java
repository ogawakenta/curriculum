package check;

import constants.Constants;

public class Check extends Constants  {

	private static String firstName = "kenta";
	private static String lastName = "ogawa";

	public static void main(String[] args) {

		 printName(firstName, lastName);

		 Pet pet = new Pet(CHECK_CLASS_JAVA,CHECK_CLASS_HOGE);
		 pet.getName();
		 pet.getMasterName();
		 pet.introduce();

		 RobotPet rp = new RobotPet(CHECK_CLASS_R2D2,CHECK_CLASS_LUKE);
		 rp.introduce();

	}
	private static void printName(String firstName, String lastName) {
		
		System.out.println("printNameメソッド →  " + firstName + lastName);
	}

}

