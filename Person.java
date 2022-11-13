package Banking;

public class Person {
    String PersonName;
    String PersonCnic;
    String PersonPhoneNumber;

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String PersonName) {
        PersonName = PersonName;
    }

    public String getPersonCnic() {
        return PersonCnic;
    }

    public void setPersonCnic(String PersonCnic) {
        this.PersonCnic = PersonCnic;
    }

    public String getPersonPhoneNumber() {
        return PersonPhoneNumber;
    }

    public void setPersonPhoneNumber(String PersonPhoneNumber) {
        this.PersonPhoneNumber = PersonPhoneNumber;
    }

    public Person(String PersonName, String PersonCnic, String PersonPhoneNumber) { // Constructor
        this.PersonName = PersonName;
        this.PersonCnic = PersonCnic;
        this.PersonPhoneNumber = PersonPhoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Person Name='" + PersonName + '\'' +
                ",Person Cnic='" + PersonCnic + '\'' +
                ",Person Phone Number='" + PersonPhoneNumber + '\'' +
                '}';
    }
}
