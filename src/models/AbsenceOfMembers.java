package models;

public class AbsenceOfMembers {
    public String name;
    public String relation;
     public int Address;

    public AbsenceOfMembers(String name, String relation, int address) {
        this.name = name;
        this.relation = relation;
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public int getAddress() {
        return Address;
    }

    public void setAddress(int address) {
        Address = address;
    }
}
