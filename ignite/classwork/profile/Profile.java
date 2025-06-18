package ignite.classwork.profile;

public class Profile implements Cloneable {
    private  String id;
    private  String name;
    private  String company;
    private  String role;

    public Profile(String id, String name, String company, String role) {
        this.id       = id;
        this.name     = name;
        this.company  = company;
        this.role = role;
    }

    public String getId()            { return id; }
    public String getName()          { return name; }
    public String getCompany()       { return company; }
    public String getRole()      	{ return role; }
    public void setName(String name)				{ this.name= name; }
    public void setCompany(String company) 		{ this.company = company; }
    public void setRole(String role)     { this.role = role; }

    @Override public String toString() {
        return String.format(
            "Profile{id=%s, name='%s', company='%s', role='%s'}",
            id, name, company, role
        );
    }
    @Override 
    public Profile clone() {
    		try {
    			return (Profile) super.clone();
    		} catch (CloneNotSupportedException e) {
    			throw new RuntimeException("Cloning failed");
    		}
    }
}