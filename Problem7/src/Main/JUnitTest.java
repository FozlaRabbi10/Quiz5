package Main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Test;

class JUnitTest {

	TicketSeller ans=new TicketSeller();
	 @Test
	 void test1() {
		 assertEquals(ans.calculate(4), 96, "");
	 }
	 @Test
	 void test2() {
		 assertEquals(ans.calculate(2),94,"");
	 }
	 @Test
	 void test3() {
		 assertEquals(ans.calculate(4),90,"");
	 }
	 @Test
	 void test4() {
		 assertEquals(ans.calculate(4),86,"");
	 }
}
