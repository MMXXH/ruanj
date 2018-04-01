package aa;
import static org.junit.Assert.*;
import org.junit.Test;
public class ShuzuTest {
    @Test
    public void test1() {
    	int[] a= {1,2,3,4};
    	assertEquals(10,Shuzu.max(a,a.length));
    }
    @Test
    public void test2() {
    	int[] a= {10,-1,-2,-3,1,0};
    	assertEquals(10,Shuzu.max(a,a.length));
    }
    @Test
    public void test3() {
    	int[] a= {-1,-2,-3,-4,-9};
    	assertEquals(0,Shuzu.max(a,a.length));
    }
    @Test
    public void test4() {
    	int[] a= {-6,1,2};
    	assertEquals(3,Shuzu.max(a,a.length));
    }
}
