package com.ito.assignment.numtowords;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NumToWordsTest {

	@Test
	void test1() {
		String number1 = NumToWords.convert(100);
		assertEquals("one hundred ", number1);
	}
	@Test
	void test2() {
		String number2 = NumToWords.convert(1452567);
		assertEquals("one million four hundred fifty-two thousand five hundred sixty-seven", number2);
	}
	@Test
	void test3() {
		
		String number3 = NumToWords.convert(10001);
		
		assertEquals("ten thousand one", number3);
	}

}
