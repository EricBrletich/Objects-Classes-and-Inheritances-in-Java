public class Employee extends Person implements Changeable{
    private int office;
    private String officePhoneNum, dateOfEmployment;
    
    //getters
    public int getOffice() {
        return office;
    }

    public String getOfficePhoneNum() {
        return officePhoneNum;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }
    
    //setters
    public void setOffice(int office) {
        this.office = office;
    }

    public void setOfficePhoneNum(String officePhoneNum) {
        this.officePhoneNum = officePhoneNum;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }
}
