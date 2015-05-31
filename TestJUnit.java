import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestJUnit {
  private BinaryString bitset1,bitset2;
  private String  bits= "1001001010";
	
  //Inicializar todos los bitset
  @Before
	public void Iniciar(){
	bitset1 = new BinaryString(10);
	bitset2 = new BinaryString(bits);
	}
	
	
	
	@Test			//Ejercicio 1
	public void testLength() {
		assertEquals(10,bitset1.length());
		assertEquals(10,bitset2.length());
	}
	
	
	
	
	
	

}
