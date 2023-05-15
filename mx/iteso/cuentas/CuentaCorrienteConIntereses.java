package mx.iteso.cuentas;

public class CuentaCorrienteConIntereses extends CuentaCorriente {

    // Atributos
    private double saldoMinimo;

    // Constructor
    public CuentaCorrienteConIntereses(String nombre, String cuenta, double saldo, double tasaDeInteres,
            int contadorTransacciones, double importePorTransaccion,
            int transaccionesExentas, double saldoMinimo) {
        super(nombre, cuenta, saldoMinimo, tasaDeInteres, contadorTransacciones,
                importePorTransaccion, transaccionesExentas);
        setSaldoMinimo(saldoMinimo);
    }

    // Setters y getters
    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    // Métodos
    @Override
    public void intereses() {
        double diferencia;
        diferencia = getSaldo() - saldoMinimo;
        if (diferencia > 0) {
            super.intereses();
        }
    }

    public String toString() {
        String mensaje = super.toString() + "\nSaldo mínimo: " + saldoMinimo + "\n";
        return mensaje;
    }
}
