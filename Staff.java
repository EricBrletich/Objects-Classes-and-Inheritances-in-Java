public class Staff extends Employee{
    //initaize varaibles
    private String title;
    
    //no arg constructor
    public Staff(){
        super.setfName("");
        super.setlName("");
        super.setPhoneNum("");
        super.setEmail("");
        title = "";
        super.setOffice(0);
        super.setOfficePhoneNum("");
        super.setDateOfEmployment("");
    }
    
    //constructor
    public Staff(String fName, String lName, String phoneNum, String email, String title, int office, String officePhoneNum, String dateOfEmployment){
        super.setfName(fName);
        super.setlName(lName);
        super.setPhoneNum(phoneNum);
        super.setEmail(email);
        this.title = title;
        super.setOffice(office);
        super.setOfficePhoneNum(officePhoneNum);
        super.setDateOfEmployment(dateOfEmployment);
    }
    
    //getters
    public String getStatus() {
        return title;
    }
    
    //setters
    public void setStatus(String title) {
        this.title = title;
    }
    
    //override ToString method
    @Override
    public String toString(){
        String info = String.format("\nFirst Name:\t%s\nLast Name:\t%s\nPhone #:\t%s\nEmail:\t%s\nTitle:\t%s\nOffice #:\t%d\n"
                + "Office Phone #:\t%s\nDate of Employment:\t%s\n", super.getfName(), super.getlName(), super.getPhoneNum(), super.getEmail(), title, super.getOffice(), super.getOfficePhoneNum(), super.getDateOfEmployment());
        return info;
    }
}
