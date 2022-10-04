package nivel1_ej01;

public class Trabajador {
    private final int WAGE=12;
    private String name;
    private String surname;

    public Trabajador(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public int getWAGE() {
        return WAGE;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "Name: "+name+" "+surname;
    }
    public int calculateWage(int totalHours){
        return WAGE*totalHours;
    }
}
