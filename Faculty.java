public class Faculty extends Employee{

    //initaize varaibles
    private String rank;

    //no arg constructor
    public Faculty(){
        super.setfName("");
        super.setlName("");
        super.setPhoneNum("");
        super.setEmail("");
        rank = "";
        super.setOffice(0);
        super.setOfficePhoneNum("");
        super.setDateOfEmployment("");
    }

    //constructor
    public Faculty(String fName, String lName, String phoneNum, String email, String rank, int office, String officePhoneNum, String dateOfEmployment){
        super.setfName(fName);
        super.setlName(lName);
        super.setPhoneNum(phoneNum);
        super.setEmail(email);
        this.rank = rank;
        super.setOffice(office);
        super.setOfficePhoneNum(officePhoneNum);
        super.setDateOfEmployment(dateOfEmployment);
    }

    //getters
    public String getRank() {
        return rank;
    }

    //setters
    public void setRank(String rank) {
        this.rank = rank;
    }

    //override ToString method
    @Override
    public String toString(){
        String info = String.format("\nFirst Name:\t%s\nLast Name:\t%s\nPhone #:\t%s\nEmail:\t%s\nRank:\t%s\nOffice #:\t%d\n"
                + "Office Phone #:\t%s\nDate of Employment:\t%s\n", super.getfName(), super.getlName(), super.getPhoneNum(), super.getEmail(), rank, super.getOffice(), super.getOfficePhoneNum(), super.getDateOfEmployment());
        return info;
    }
    
}
