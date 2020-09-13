package Work;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class √∞≈›Test {
    
	@Test
	public static void test1() {
		int [] num = {1,1,1,2};
		√∞≈› p =new √∞≈›();
		p.paixu(num);
	}
	@Test
	public static void test2() {
		int [] num = {2,-1,1,7,6};
		√∞≈› p =new √∞≈›();
		p.paixu(num);
	}
	@Test
	public static void test3() {
		int [] num = {1,3,7,2};
		√∞≈› p =new √∞≈›();
		p.paixu(num);
	}
	@Test
	public static void test4() {
		int [] num = {0,2,7,9,5,6};
		√∞≈› p =new √∞≈›();
		p.paixu(num);
	}
	@Test
	public static void test5() {
		int [] num = {0,-1,1,2,9,7};
		√∞≈› p =new √∞≈›();
		p.paixu(num);
	}
	

}
