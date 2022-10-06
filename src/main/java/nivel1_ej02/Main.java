package nivel1_ej02;

public class Main {

    @SuppressWarnings("deprecaction")
    public static void main(String[] args) {
        int totalHours = 160;
        int wage;
        Trabajador trabajador1 = new Trabajador("Juan","Pérez");
        System.out.println(trabajador1.toString()+", Sueldo: "+trabajador1.calculateWage(totalHours));

        TrabajadorOnline tOnline = new TrabajadorOnline("Pablo", "García");
        System.out.println(tOnline.toString()+", Sueldo: "+tOnline.calculateWage(totalHours));

        TrabajadorPresencial tPresencial = new TrabajadorPresencial("Abelardo", "Fernández");
        System.out.println(tPresencial.toString()+", Sueldo: "+tPresencial.calculateWage(totalHours));
        System.out.print(tPresencial.toString());
        tPresencial.wagePerYear(totalHours);
    }
}
