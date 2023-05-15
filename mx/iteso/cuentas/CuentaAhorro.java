package mx.iteso.cuentas;

public class CuentaAhorro extends Cuenta {

    // Atributos
    private double cuotaDeMantenimiento;

    // Constructor
    public CuentaAhorro(String nombre, String cuenta, double saldo, double tasaDeInteres, double cuotaDeMantenimiento) {
        super(nombre, cuenta, saldo, tasaDeInteres);
        setCuotaDeMantenimiento(cuotaDeMantenimiento);
    }

    // Setters y getters
    public void setCuotaDeMantenimiento(double cuotaDeMantenimiento) {
        if (cuotaDeMantenimiento >= 0) {
            this.cuotaDeMantenimiento = cuotaDeMantenimiento;
        } else {
            this.cuotaDeMantenimiento = 0;
        }
    }

    public double getCuotaDeMantenimiento() {
        return cuotaDeMantenimiento;
    }

    // Métodos
    @Override
    public void intereses() {
        double interes;
        interes = getSaldo() * ((getTasaDeInteres() / 100) / 12);
        setSaldo((interes + getSaldo()));
    }

    @Override
    public void comisiones() {
        double comision;
        comision = getSaldo() - cuotaDeMantenimiento;
        setSaldo(comision);
    }

    public String toString() {
        String mensaje = super.toString() + "\nCuota de mantenimiento: " + cuotaDeMantenimiento + "\n";
        return mensaje;
    }
}
