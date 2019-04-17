package reimbursement.project;

public class Manager {

	private int empID;
	private String userName;
	private String passWord;
	private String fName;
	private String lName;
	private String email;
	
	public Manager() {
		
	}
	
	public Manager(int empID, String userName, String passWord, String fName, String lName, String email) {
		super();
		this.empID = empID;
		this.userName = userName;
		this.passWord = passWord;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
        /*  My Bean  transport for my employee tabel */
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", userName=" + userName + ", passWord=" + passWord + ", fName=" + fName
				+ ", lName=" + lName + ", email=" + email + "]";
	}
	
}
