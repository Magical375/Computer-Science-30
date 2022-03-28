/*
 * TestDisk.java
 * A simple application for testing the Disk class.
 * Lawrenceville Press
 * June 10, 2011
 */

 /**
  * The Disk class is tested.
  */
 public class TestDiskExample {

	public static void main(String[] args) {
		DiskExample saucer = new DiskExample(10, 0.02);

		System.out.println("Disk radius: " + saucer.getRadius());
		System.out.println("Disk surface area: " + saucer.area());
		System.out.println("Disk volume: " + saucer.volume());

		DiskExample plate1 = new DiskExample(12, 0.05);
		DiskExample plate2 = new DiskExample(12, 0.07);
		if (plate1.equals(plate2)) {
			System.out.println("Objects are equal.");
		} else {
			System.out.println("Objects are not equal.");
		}
		System.out.println(plate1);
		System.out.println(plate2);
	}
}/fhhhhhhh