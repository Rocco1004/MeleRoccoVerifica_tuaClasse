import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MeleRoccoTest_B {

	MeleRoccoClass mrc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		mrc = new MeleRoccoClass();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_1() {

			int risAtteso = 6;
			int risOttenuto = mrc.cognomeMet(3);
			assertEquals(risAtteso, risOttenuto);	
		
	}
	
	@Test
	public void test_2() {

			int risAtteso = 3;
			int risOttenuto = mrc.cognomeMet(2);
			assertEquals(risAtteso, risOttenuto);	
		
	}
	
	@Test
	public void test_3() {

			int risAtteso = 10;
			int risOttenuto = mrc.cognomeMet(4);
			assertEquals(risAtteso, risOttenuto);	
		
	}

}
