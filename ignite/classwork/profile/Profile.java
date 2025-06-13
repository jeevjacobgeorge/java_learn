package ignite.classwork.profile;

public class Profile {
    private  int id;
    private  String name;
    private  String company;
    private  String position;

    public Profile(int id, String name, String company, String position) {
        this.id       = id;
        this.name     = name;
        this.company  = company;
        this.position = position;
    }

    public int getId()               { return id; }
    public String getName()          { return name; }
    public String getCompany()       { return company; }
    public String getPosition()      { return position; }

    @Override public String toString() {
        return String.format(
            "Profile{id=%d, name='%s', company='%s', position='%s'}",
            id, name, company, position
        );
    }
}