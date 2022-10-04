package nivel1_ej01;

public class TrabajadorPresencial extends  Trabajador{
    private static final int FUEL=80;
    public TrabajadorPresencial(String name, String surname) {
        super(name, surname);
    }
    @Override
    public int calculateWage(int totalHours) {
        int wage = getWAGE();
        int totalWage= wage*totalHours+FUEL;
        return totalWage;
    }
}
