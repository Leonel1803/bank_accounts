package mx.iteso.cuentas;

public abstract class Cuenta {

    // Atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tasaDeInteres;

    // Constructor
    public Cuenta(String nombre, String cuenta, double saldo, double tasaDeInteres) {
        setCuenta(cuenta);
        setNombre(nombre);
        setSaldo(saldo);
        setTasaDeInteres(tasaDeInteres);
    }

    // Setters y getters
    public void setNombre(String nombre) {
        if (nombre != "" && nombre != null) {
            this.nombre = nombre;
        } else {
            this.nombre = "Desconocido";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setCuenta(String cuenta) {
        if (cuenta != "" && cuenta != null) {
            this.cuenta = cuenta;
        } else {
            this.cuenta = "000000";
        }
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTasaDeInteres(double tasaDeInteres) {
        if (tasaDeInteres >= 0) {
            this.tasaDeInteres = tasaDeInteres;
        } else {
            this.tasaDeInteres = 0;
        }
    }

    public double getTasaDeInteres() {
        return tasaDeInteres;
    }

    // Métodos
    public void deposito(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depósito realizado con éxito");
        }
    }

    public void retiro(double cantidad) {
        if (cantidad > 0) {
            if ((this.saldo - cantidad) >= 0) {
                this.saldo -= cantidad;
                System.out.println("Retiro realizado con éxito");
            }
        }
    }

    public String toString() {
        String mensaje = "\nNombre de cuenta: " + nombre + "\nNúmero de cuenta: " + cuenta + "\nSaldo disponible: "
                + saldo + "\nTasa de interes: " + tasaDeInteres + "\n";
        return mensaje;
    }

    public abstract void comisiones();

    public abstract void intereses();

}
