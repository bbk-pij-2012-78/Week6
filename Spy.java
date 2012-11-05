public class Spy {

	private static int spyCount = 0;
	private int ID;

	public Spy(int iID){
		spyCount++;
		this.ID = iID;
		System.out.println("Current ID: " + this.ID);
		System.out.println("Spy Count: " + spyCount);
	}

	public void die(){
		System.out.println("Spy " + this.ID + " has been detected and elimnated");
		spyCount--;
		System.out.println("Spy Count: " + spyCount);
	}
}