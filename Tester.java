import java.util.*;

public class Tester {

	public static void main(String[] args){
		int sel = 0;
		Tester tst = new Tester();
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("1. Run Spy.");
			System.out.println("2. Run Do While.");
			System.out.println("3. Hospital Manager.");
			System.out.println("9. Exit.");
			System.out.print("Enter Selection: ");
			//sel = Integer.parseInt(System.console().readLine());
			sel = in.nextInt();

			switch (sel) {
				case 1:
					tst.RunSpy();
					break;
				case 2:
					tst.RunDoWhile();
					break;
				case 3:
					tst.HospitalManager();
					break;
			}
		} while (sel != 9);
	}

	public void RunSpy(){

		Spy mSpy1 = new Spy(1);
		Spy mSpy2 = new Spy(2);
		Spy mSpy3 = new Spy(3);
		Spy mSpy4 = new Spy(4);
		Spy mSpy5 = new Spy(5);
		Spy mSpy6 = new Spy(6);
		Spy mSpy7 = new Spy(7);

		mSpy3.die();
		mSpy6.die();
	}

	public void RunDoWhile(){

		DoWhile dw = new DoWhile();
		dw.readMarks();
		System.out.println("There are " + dw.StudentsCount() + " students: " + dw.DistinctionsCount() +
						 " distinctions, " + dw.PassCount() + " passes, " + dw.FailCount() +
						 " fails (plus " + dw.InvalidCount() + " invalid)");
	}

	public void HospitalManager(){
		Patient patientListStart = null;

		//Patient tmpPatient = null;

		Patient firstPatient = new Patient("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
		
		Patient p1 = new Patient("Mary", 66, "Meningitis");
		patientListStart.addPatient(p1);
		
		Patient p2 = new Patient("Steve", 22, "Cancer");
		patientListStart.addPatient(p2);
		
		Patient p3 = new Patient("Alan", 95, "Dementia");
		patientListStart.addPatient(p3);		
		
		PrintPatients(patientListStart);
		
		patientListStart.deletePatient(p2);
		
		PrintPatients(patientListStart);
	}
	
	private void PrintPatients(Patient aPatients){
		Patient aPrev = null;
		Patient aNext = aPatients;
		do {
			aPrev = aNext.GetPrevPatient();
			if (aPrev != null) {
				System.out.println("Prev Patient Name: " + aPrev.PatientName());
			}
			System.out.println("Next Patient Name: " + aNext.PatientName());
			aNext = aNext.GetNextPatient();
		} while (aNext != null);
	}

}