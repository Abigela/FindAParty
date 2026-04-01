package Model;

public class Organiser {
    private Club organiserName;
    private String organiserAddress;
    private String organiserEmail;
    private String contactNrOrganiser;

    public Club getOrganiserName() {
        return organiserName;
    }

    public void setOrganiserName(Club organiserName) {
        this.organiserName = organiserName;
    }

    public String getOrganiserAddress() {
        return organiserAddress;
    }

    public void setOrganiserAddress(String organiserAddress) {
        this.organiserAddress = organiserAddress;
    }

    public String getOrganiserEmail() {
        return organiserEmail;
    }

    public void setOrganiserEmail(String organiserEmail) {
        this.organiserEmail = organiserEmail;
    }

    public String getContactNrOrganiser() {
        return contactNrOrganiser;
    }

    public void setContactNrOrganiser(String contactNrOrganiser) {
        this.contactNrOrganiser = contactNrOrganiser;
    }
}
