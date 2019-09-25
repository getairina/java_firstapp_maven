package model;

public enum Titles {
    AS ("ASSISTANTPROFESSOR"),
    ASSOC("ASSOCIATEPROFESSOR"),
    PROF("PROFESSOR");

    private String name;

    Titles(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Titles" + name;
    }
}
