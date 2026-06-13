
package com.ulp;
/**
 *
 * @author nacho
 */

import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

public class revendedoraTest {

    private revendedora revCuenta;
    private revendedora rev3;
    private static int i = 0;

    @BeforeAll
    public static void setUpClass() {
        LocalDate fechaLocal = LocalDate.of(2024, Month.JUNE, 8);
        System.out.println("Fecha de transaccion " + fechaLocal);
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("FIN de la transaccion");
    }

    @BeforeEach
    public void setUp() {
        revCuenta = new revendedora(100, 9000.0);
        rev3 = new revendedora(300, 1000.0);
    }

    @AfterEach
    public void tearDown() {
        i++;
        System.out.println("Transaccion " + i + " > El monto en cuenta es " + revCuenta.getSaldo());
    }

    @Test
    public void testRetirarFallo() {
        assertThrows(Exception.class, () -> {
            revCuenta.retirarDinero(88000.0);
        });
    }

    @Test
    public void testRetirarExito() throws Exception {
        double saldoFinal = revCuenta.retirarDinero(1000.0);

        assertEquals(8000.0, saldoFinal, 0.2);
    }

    @Test
    public void testDepositarDinero() {
        assertNotNull(revCuenta);

        revCuenta.depositarDinero(2000.0);

        assertEquals(11000.0, revCuenta.getSaldo(), 0.2);
    }

    @Test
    public void testTransferirCuentaNoNula() throws Exception {
        revendedora rev2 = new revendedora(200, 5000.0);

        revCuenta.transferirDinero(rev2, 100.0);

        assertNull(rev2, "La CUENTA no es null");
    }

    @Test
    public void testSiempreFalla() {
        fail("Este test falla intencionalmente");
    }

    @Test
    public void testDolarMEP1() {
        double esperado = 9000.0 / 1300.0;

        assertEquals(esperado, revCuenta.convertirMoneda("1300"), 0.2);
    }

    @Test
    public void testDolarMEP2() {
        double esperado = 9000.0 / 1300.0;

        assertEquals(esperado, revCuenta.convertirMoneda("1300 U$S"), 0.2);
    }

    @Test
    public void testMismaRevendedora() {
        assertSame(revCuenta, rev3, "Las cuentas son diferentes---");
    }

    @Test
    @Timeout(value = 60, unit = TimeUnit.MILLISECONDS)
    public void testPagoDemorado() throws InterruptedException {
        revCuenta.pagoDemorado(100);
    }
}
