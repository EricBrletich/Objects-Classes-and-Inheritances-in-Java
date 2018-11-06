public class Student extends Person implements Changeable{
    //initaize varaibles
    private String status;
    
    //no arg constructor
    public Student(){
        super.setfName("");
        super.setlName("");
        super.setPhoneNum("");
        super.setEmail("");
        status = "";
    }
    
    //constructor
    public Student(String fName, String lName, String phoneNum, String email, String status){
        super.setfName(fName);
        super.setlName(lName);
        super.setPhoneNum(phoneNum);
        super.setEmail(email);
        this.status = status;
    }
    
    //getters
    public String getStatus() {
        return status;
    }
    
    //setters
    public void setStatus(String status) {
        this.status = status;
    }
    
    //override ToString method
    @Override
    public String toString(){
        String info = String.format("\nFirst Name:\t%s\nLast Name:\t%s\nPhone #:\t%s\nEmail:\t%s\nStatus:\t%s\n", super.getfName(), super.getlName(), super.getPhoneNum(), super.getEmail(), status);
        return info;
    }
}
