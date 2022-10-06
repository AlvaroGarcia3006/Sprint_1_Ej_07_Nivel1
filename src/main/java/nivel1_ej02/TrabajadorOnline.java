package nivel1_ej02;

public class TrabajadorOnline extends Trabajador {
    private static final int INTERNET_FEE = 25;
    public TrabajadorOnline(String name, String surname) {
        super(name, surname);
    }
    @Override
    @Deprecated
    public int calculateWage(int totalHours){
        int wage = getWAGE();
        int totalWage= wage*totalHours+INTERNET_FEE;
        return totalWage;
    }
}
