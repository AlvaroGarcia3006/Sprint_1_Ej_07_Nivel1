package nivel1_ej02;

public class TrabajadorPresencial extends Trabajador {
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
    @Deprecated
    public void wagePerYear(int totalHours){
        System.out.println(", Sueldo anual: "+calculateWage(totalHours)*14+"€");
    }
}
