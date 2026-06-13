
package com.ulp;

/**
 *
 * @author nacho
 */

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

public class parameterRevendedoraTest {

    private static revendedora cRev = new revendedora(400, 9000.0);

    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][]{
            {300.5, cRev, 3333.0},
            {500.0, cRev, 8199.5},
            {9999.0, cRev, 1111.0}
        });
    }

    @ParameterizedTest
    @MethodSource("tomarDatos")
    public void testRetirarDinero(double montoActual, revendedora cuenta, double montoEsperado) throws Exception {

        System.out.println("Test Retiros");
        System.out.println("Saldo inicial:  $" + cuenta.getSaldo());
        System.out.println("Intentamos retirar $" + montoActual);

        try {
            cuenta.retirarDinero(montoActual);

            System.out.println("Saldo final $" + cuenta.getSaldo());

            assertEquals(montoEsperado, cuenta.getSaldo(), 0.2);

        } finally {
            System.out.println("Operacion terminada");
        }
    }
}

