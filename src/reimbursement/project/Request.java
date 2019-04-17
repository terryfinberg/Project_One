package reimbursement.project;

public class Request {
	
	private int requestID;
	private String employeeID;
	private String managerID;
	private double requestAmt;
	private String description;
	private String decision;
	private String status; 
	
	public Request() {
		
		
		
	}

	public Request(int requestID, String employeeID, String managerID, double requestAmt, String description,
			String decision, String status) {
		super();
		this.requestID = requestID;
		this.employeeID = employeeID;
		this.managerID = managerID;
		this.requestAmt = requestAmt;
		this.description = description;
		this.decision = decision;
		this.status = status;
	}

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getManagerID() {
		return managerID;
	}

	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}

	public double getRequestAmt() {
		return requestAmt;
	}

	public void setRequestAmt(double requestAmt) {
		this.requestAmt = requestAmt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	/*  My utility for the Dao   */
	@Override
	public String toString() {
		return "Request [requestID=" + requestID + ", employeeID=" + employeeID + ", managerID=" + managerID
				+ ", requestAmt=" + requestAmt + ", description=" + description + ", decision=" + decision + ", status="
				+ status + "]";
	}
	
	
	
	
	

}
