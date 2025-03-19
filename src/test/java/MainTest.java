import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @CsvSource({
            "00000000, T, true",
            "12345678, Z, true",
            "87654321, X, true",
            "11111111, H, true",
            "99999999, R, true",
            "12345678, A, false",
            "00000000, A, false"
    })
    void testComprobarDNI(String dni, char letra, boolean expected) {
        assertEquals(expected, Main.comprobarDNI(dni, letra));
    }

    @ParameterizedTest
    @CsvSource({
            "00000000, T",
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "99999999, R"
    })
    void testCalcularLetraDNI(String dni, char expectedLetter) {
        assertEquals(expectedLetter, Main.calcularLetraDNI(dni));
    }

    @ParameterizedTest
    @CsvSource({
            "1234567, false",
            "123456789, false",
            "ABCDEFGH, false",
            "8765432, false",
            "1, false"
    })
    void testInvalidDNILength(String dni, boolean expected) {
        assertFalse(Main.comprobarDNI(dni, 'T')); // Letra ficticia para probar longitud
    }
}
