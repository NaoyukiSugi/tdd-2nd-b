import junit.framework.TestCase;

public class Kadai2_1Test extends TestCase{
	Kadai2_1 kadai;
	
	public void setUp(){
		kadai = new Kadai2_1();
	}
	
	public void testCalc_area(){
		assertEquals(314, kadai.calc_area(10));
		assertEquals(7, kadai.calc_area(1.5));
		assertEquals(0, kadai.calc_area(0));
		assertEquals(314159203, kadai.calc_area(9999.999));
	}
	
	
}
