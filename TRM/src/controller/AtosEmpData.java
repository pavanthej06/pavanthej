package controller;

public class AtosEmpData {

	private int EMPLOYEE_ID;
    private String	EMP_NAME;
    private String EMPLOYEE_DESIGNATION;
    private String EMPLOYEE_VERTICAL;
    private String EMPLOYEE_EMAILID;
    private String EMPLOYEE_LOCATION;
    private int MANAGER_ID;
    private String PASSWORD;
	public int getEmployee_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(int employee_ID) {
		EMPLOYEE_ID = employee_ID;
	}
	public String getEMP_NAME() {
		return EMP_NAME;
	}
	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}
	public String getEMPLOYEE_DESIGNATION() {
		return EMPLOYEE_DESIGNATION;
	}
	public void setEMPLOYEE_DESIGNATION(String eMPLOYEE_DESIGNATION) {
		EMPLOYEE_DESIGNATION = eMPLOYEE_DESIGNATION;
	}
	public String getEMPLOYEE_VERTICAL() {
		return EMPLOYEE_VERTICAL;
	}
	public void setEMPLOYEE_VERTICAL(String eMPLOYEE_VERTICAL) {
		EMPLOYEE_VERTICAL = eMPLOYEE_VERTICAL;
	}
	public String getEMPLOYEE_EMAILID() {
		return EMPLOYEE_EMAILID;
	}
	public void setEMPLOYEE_EMAILID(String eMPLOYEE_EMAILID) {
		EMPLOYEE_EMAILID = eMPLOYEE_EMAILID;
	}
	public String getEMPLOYEE_LOCATION() {
		return EMPLOYEE_LOCATION;
	}
	public void setEMPLOYEE_LOCATION(String eMPLOYEE_LOCATION) {
		EMPLOYEE_LOCATION = eMPLOYEE_LOCATION;
	}
	public int getMANAGER_ID() {
		return MANAGER_ID;
	}
	public void setMANAGER_ID(int mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
}