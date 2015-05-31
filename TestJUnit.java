import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;





public class TestJUnit {
	private BinaryString bitset1, bitset2, bitset3, bitset4,bitset5;
	private String bits = "1001001010", bst3 = "100101", bst4 = "0110101",bts5="1111000";

	// Inicializar todos los bitset
	@Before
	public void Iniciar() {
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(bits);
		bitset3 = new BinaryString(bst3);
		bitset4 = new BinaryString(bst4);
		bitset5 = new BinaryString(bts5);
	}

	@Test
	// Ejercicio 1
	public void testLength() {
		assertEquals(10, bitset1.length());
		assertEquals(10, bitset2.length());
	}

	@Test
	// Ejercicio 2
	public void testSetBit() {
		bitset3.set(1, '1');
		assertEquals('1', bitset3.get(1));
	}

	// Ejercicio 3
	@Test(expected = BinaryStringException.class)
	public void testGetOutOfLimitBit() {
		bitset4.get(56);
	}

	// Ejercicio 4
	@Test(expected = BinaryStringException.class)
	public void testSetOutOfLimitBit() {
		bitset4.set(56, '0');
	}

	// Ejercicio 5
	@Test
	public void testOutOfLimitV2() {
		try {
			bitset4.set(56, '0');
			fail("Se espera excepción BinaryStringException");
		} catch (BinaryStringException e) {

		}

	}

	// Ejercicio 6
	@Test(expected = BinaryStringException.class)
	public void testInvalidBitValue() {
		bitset4.set(3, '6');
	}
	@Test				//Ejercicio 7
	public void testToString(){
		assertEquals("1111000", bitset5.toString());
	}
}
