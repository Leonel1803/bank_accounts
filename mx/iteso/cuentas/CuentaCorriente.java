package mx.iteso.cuentas;

public class CuentaCorriente extends Cuenta {

    // Atributos
    private int contadorTransacciones;
    private double importePorTransaccion;
    private int transaccionesExentas;

    // Constructor
    public CuentaCorriente(String nombre, String cuenta, double saldo, double tasaDeInteres, int contadorTransacciones,
            double importePorTransaccion,
            int transaccionesExentas) {
        super(nombre, cuenta, saldo, tasaDeInteres);
        setContadorTransacciones(contadorTransacciones);
        setImportePorTransaccion(importePorTransaccion);
        setTransaccionesExentas(transaccionesExentas);
    }

    // Setters y getters
    public int getContadorTransacciones() {
        return contadorTransacciones;
    }

    public void setContadorTransacciones(int contadorTransacciones) {
        this.contadorTransacciones = contadorTransacciones;
    }

    public double getImportePorTransaccion() {
        return importePorTransaccion;
    }

    public void setImportePorTransaccion(double importePorTransaccion) {
        this.importePorTransaccion = importePorTransaccion;
    }

    public int getTransaccionesExentas() {
        return transaccionesExentas;
    }

    public void setTransaccionesExentas(int transaccionesExentas) {
        this.transaccionesExentas = transaccionesExentas;
    }

    // Métodos
    public void deposito(double cantidad) {
        super.deposito(cantidad);
        contadorTransacciones += 1;
    }

    public void retiro(double cantidad) {
        super.retiro(cantidad);
        contadorTransacciones += 1;
    }

    @Override
    public void intereses() {
        double interes;
        interes = getSaldo() * ((getTasaDeInteres() / 100) / 12);
        setSaldo((interes + getSaldo()));
    }

    @Override
    public void comisiones() {
        double comision;
        if (contadorTransacciones > transaccionesExentas) {
            comision = contadorTransacciones * importePorTransaccion;
            setSaldo((getSaldo() - comision));
        }
    }

    public String toString() {
        String mensaje = super.toString() + "\nTransacciones hechas: " + contadorTransacciones
                + "\nImporte por transacción: " + importePorTransaccion + "\nTransacciones libres: "
                + transaccionesExentas + "\n";
        return mensaje;
    }
}
