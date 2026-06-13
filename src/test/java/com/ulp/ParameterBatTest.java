/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ulp;

import static com.ulp.BateriaTest.bat;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author juanj
 */
public class ParameterBatTest {
    static Bateria bat;
    public ParameterBatTest() {
    }
    
    @BeforeEach
    public void setUp() {
        bat = new Bateria();
    }
    
    @AfterEach
    public void tearDown() {
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5}) // Se ejecutará 3 veces, una con cada número
    @DisplayName("Probando descargas múltiples")
    public void testDescargarParametrizado(int metrosParam) {
        System.out.println("Descargando con metros: " + metrosParam);
        double result = bat.descargar(metrosParam);
        // Tu aserción aquí...
        assertNotNull(result);
    }
    
    
    // Si solo quieren medir el tiempo de una línea de código específica dentro del test, usas assertTimeout
    @Test
    public void testDescargarConTimeout() {
        // Verifica que todo lo que esté adentro de la función lambda tome menos de 500 milisegundos
        assertTimeout(Duration.ofMillis(500), () -> {
            bat.descargar(5);
    });
}
    
}
