public class ResearchCouncil implements Emailable, Billable {
    private String name;
    private String email;

    public String greet() {
        return "sendto: " + email + "Dear " + name + ",\n";
    }

    public void setName(String new_name) {
        name = new_name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String new_email) {
        email = new_email;
    }

    public String getEmail() {
        return email;
    }

    public void sendEmail() {
        System.out.println(greet());
    }

    public void payBill(int amount) {
          System.out.println(amount);
    }
}