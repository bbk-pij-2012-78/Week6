public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient prevPatient;

	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.prevPatient = null;
	}

	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			// this means this is the last patient in the list
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
		this.nextPatient.prevPatient = this;
	}

	public boolean deletePatient(Patient patient) {
		if (this.nextPatient == null) {
			// patient to remove was not found
		return false;
		} else if (this.nextPatient.name.equals(patient.name)) {
			// We found it! It is the next one!
			// Now link this patient to the one after the next
			this.nextPatient = nextPatient.nextPatient;
		return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}
	
	public String PatientName(){
		return this.name;
	}
	
	public Patient GetNextPatient(){
		return this.nextPatient;
	}
	
	public Patient GetPrevPatient(){
		return this.prevPatient;
	}	
}