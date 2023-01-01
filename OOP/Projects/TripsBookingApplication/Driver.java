
public class Driver extends Person{
    private String phoneNumber;
    private String licenseNumber;

    public Driver() {}
    public Driver(String name, int age, String ID, String phoneNumber, String licenseNumber) {
        super(name, age, ID);
        this.phoneNumber = phoneNumber;
        this.licenseNumber = licenseNumber;
    }

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getLicenseNumber() {return licenseNumber;}
    public void setLicenseNumber(String licenseNumber) {this.licenseNumber = licenseNumber;}

    @Override
    public String toString() {
        return "\n   Driver Informations { " + super.toString()+
                ", phoneNumber = " + phoneNumber +
                ", licenseNumber= " + licenseNumber + "}";
    }
}
