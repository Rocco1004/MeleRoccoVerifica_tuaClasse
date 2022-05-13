import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MeleRoccoTest_A {

	@Test
	public void test_1() {

			MeleRoccoClass mrc = new MeleRoccoClass();
			int risAtteso = 6;
			int risOttenuto = mrc.cognomeMet(3);
			assertEquals(risAtteso, risOttenuto);	
		
	}
	
	@Test
	public void test_2() {

			MeleRoccoClass mrc = new MeleRoccoClass();
			int risAtteso = 3;
			int risOttenuto = mrc.cognomeMet(2);
			assertEquals(risAtteso, risOttenuto);	
		
	}
	
	@Test
	public void test_3() {

			MeleRoccoClass mrc = new MeleRoccoClass();
			int risAtteso = 10;
			int risOttenuto = mrc.cognomeMet(4);
			assertEquals(risAtteso, risOttenuto);	
		
	}
	

}
