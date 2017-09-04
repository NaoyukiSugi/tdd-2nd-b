import junit.framework.TestCase;

import java.util.EmptyStackException;

public class StackTest extends TestCase {
    Stack stack;

    public void setUp() {
        stack = new Stack();
    }

    public void testCreate() {
        assertTrue(stack.isEmpty());
    }

    public void testPushAndTop() {
        stack.push(1);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.top());
    }

    public void testPushAndSize() {
        stack.push(1);
        assertEquals(1, stack.size());
        stack.push(2);
        assertEquals(2, stack.size());
    }

    public void testEmptyPop() {
        try {
            stack.pop();
            fail();
        } catch (EmptyStackException exception) {
        }
    }

    public void testPushAndPop() {
        stack.push(1);
        stack.pop();
        assertEquals(0, stack.size());
    }
    
    public void testPushPushPopTop(){
    	stack.push(1);
    	stack.push(2);
    	assertEquals(2, stack.size());
    	stack.pop();
    	assertEquals(1,stack.top());
    }

}