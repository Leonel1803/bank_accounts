package mx.iteso.test;

import mx.iteso.cuentas.*;

public class TestCuentas {

    public static void main(String[] args) {

        CuentaAhorro ca1 = new CuentaAhorro("Leon", "368931", 50, 6, 300);
        CuentaAhorro ca2 = new CuentaAhorro("El Taquero", "583213", 100000, 13, 42);

        CuentaCorriente cc1 = new CuentaCorriente("Jose Ramirez Arredondo", "729514", 50000, 20, 0, 79, 4);
        CuentaCorriente cc2 = new CuentaCorriente("Juanito", "214865", 10000, 15, 2, 1000, 3);

        CuentaCorrienteConIntereses cci1 = new CuentaCorrienteConIntereses("Lopez", "642978", 15000, 25, 2, 150, 1,
                14000);
        CuentaCorrienteConIntereses cci2 = new CuentaCorrienteConIntereses("Mason", "284015", 1000, 100, 5, 50, 2,
                17000);

        // Depóstios

        ca1.deposito(150);
        ca1.deposito(50);

        ca2.deposito(5000);
        ca2.deposito(3000);

        cc1.deposito(300);
        cc1.deposito(500);

        cc2.deposito(5000);
        cc2.deposito(200);

        cci1.deposito(0);
        cci1.deposito(100);

        cci2.deposito(450);
        cci2.deposito(600);

        // Retiro

        ca1.retiro(15);
        ca1.retiro(500);

        ca2.retiro(100000);
        ca2.retiro(300);

        cc1.retiro(150);
        cc1.retiro(50);

        cc2.retiro(5034);
        cc2.retiro(217);

        cci1.retiro(0);
        cci1.retiro(17);

        cci2.retiro(345);
        cci2.retiro(175);

        Cuenta cuentas[] = { ca1, ca2, cc1, cc2, cci1, cci2 };
        for (Cuenta c : cuentas) {
            c.intereses();
            c.comisiones();
        }

        for (Cuenta c : cuentas) {
            String mensaje = c.toString();
            System.out.println(mensaje);
        }
    }
}
