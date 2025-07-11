import java.time.LocalDate;

class Patient {
	private final int hn;
	private String fName;
	private String lName;
	private LocalDate dateOfBirth;
	private final String hashedNationalID;
	private String address;
	private String phoneNumber;

	protected Patient(int hn, String hashedID, String fName, String lName, LocalDate dob, String addr, String phone) {
	// constructor can only be set by NewPatient
		this.hn = hn;
		this.hashedNationalID = hashedID;
		this.fName = fName;
		this.lName = lName;
		this.dateOfBirth = dob;
		this.address = addr;
		this.phoneNumber = phone;
	}
}
