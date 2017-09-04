import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import junit.framework.TestCase;

public class Kadai2_3Test extends TestCase{
	Kadai2_3 kadai;
	
	public void setUp(){
		kadai = new Kadai2_3();
	}
	
	public void testD1() throws IOException{
		assertTrue(kadai.checkD1("example.com"));
		assertFalse(kadai.checkD1("example.[]com"));
		/*
    	StringBuffer sb = new StringBuffer();
    	sb.append("abc@example.com").append(System.lineSeparator())
    	.append("abc@.xample.[]com").append(System.lineSeparator());
        ByteArrayInputStream stream = new ByteArrayInputStream(sb.toString().getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        kadai.checkAddress(stream, out);
        assertEquals("ok" + System.lineSeparator()
        + "ng" + System.lineSeparator(), out.toString());*/
	}
	
	public void testD2(){
		assertTrue(kadai.checkD2("example.com"));
		assertFalse(kadai.checkD2(".example.com"));
	}
	
	public void testD3(){
		assertTrue(kadai.checkD3("example.com"));
		assertFalse(kadai.checkD3("example.com."));
	}
	
	public void testD4(){
		assertTrue(kadai.checkD4("example.com"));
		assertFalse(kadai.checkD4("example..com"));
	}
	
	public void testD5(){
		assertTrue(kadai.checkD5("e"));
		assertFalse(kadai.checkD5(""));
	}
}
