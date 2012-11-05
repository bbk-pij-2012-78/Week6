public class DoWhile {

	private int iCount;
	private int iDistinctions;
	private int iPasses;
	private int iFails;
	private int iInvalid;

	public DoWhile(){
		iCount = 0;
		iDistinctions = 0;
		iPasses = 0;
		iFails = 0;
		iInvalid = 0;
	}

	public void readMarks(){

		int mark = 0;

		do {
			System.out.print("Input a mark: ");
			mark = Integer.parseInt(System.console().readLine());

			if (mark != -1){
				if ((mark >= 0) && (mark <= 49)){
					iCount++;
					iFails++;
				} else if ((mark >= 50) && (mark <= 69)){
					iCount++;
					iPasses++;
				} else if ((mark >= 70) && (mark <= 100)){
					iCount++;
					iDistinctions++;
				} else {
					iInvalid++;
				}
			}
			//System.out.println(iCount);
		} while (mark != -1);
	}

	public int StudentsCount(){
		return this.iCount;
	}

	public int DistinctionsCount(){
		return this.iDistinctions;
	}

	public int PassCount(){
		return this.iPasses;
	}

	public int FailCount(){
		return this.iFails;
	}

	public int InvalidCount(){
		return this.iInvalid;
	}
}