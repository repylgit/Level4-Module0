package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.

	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */

	private int itemsReceived;
	
	public void setItemsReceived(int num) {
		if (num < 0) {
			this.itemsReceived = 0;
		}
		else {
			this.itemsReceived = num;
		}
		
		
	}

	public int getItemsReceived() {
		return this.itemsReceived;
	}
	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */

	private double degreesTurned;

	public void setDegreesTurned(double degrees) {
		if (degrees < 0.0) {
			this.degreesTurned = 0.0;
		}
		else if (degrees > 360.0) {
			this.degreesTurned = 360.0;
		}
		else {
			this.degreesTurned = degrees;
		}
	}
	public double getDegreesTurned() {
		return this.degreesTurned;
	}
	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	private String nomenclature;
	
	public void setNomenclature(String msg) {
		if (msg.equals("")) {
			this.nomenclature = " ";
		}
		else {
			this.nomenclature = msg;
		}
	}
	
	public String getNomenclature() {
		return this.nomenclature;
	}

	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

	private Object memberObj;
	
	public void setMemberObj (Object obj) {
		if (obj instanceof String) {
			memberObj = new Object();
		}
		else {
			this.memberObj = obj;
		}
	}
	public Object getMemberObj() {
		return this.memberObj;
	}
}
