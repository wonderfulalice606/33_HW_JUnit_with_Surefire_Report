package core;

import static org.junit.Assert.*;
import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.rules.ExpectedException;


import static org.hamcrest.CoreMatchers.containsString;

public class CalculatorTest01 {
	
	@Test(timeout=1000) //Ignore
	public void test_01_add_2() {System.out.println("Test # 01: Add 2 positive params");
			assertEquals("Sum of two params returns an incorrect value", 
						Calculator.add(200.0, 150.0), 350.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_02_add_2() {System.out.println("Test # 02: Add 2 different params");
			assertEquals("Sum of two params returns a positive value", 
						Calculator.add(200.0, -250.0), -50.0, 0.09);}
	
	
	@Test(timeout=1000) //Ignore
	public void test_03_add_2() {System.out.println("Test # 03: Add 2 positive params (dif. Data Type)");
	assertEquals("Sum of two params with different Data Type returns an incorrect value", 
						Calculator.add(200.0, 150), 350.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_04_add_2() {System.out.println("Test # 04: Add 2 different params (dif. Data Type)");
	assertEquals("Sum of two params with different Data Type returns a positive value", 
						Calculator.add(200.0, -250), -50.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_05_add_2() {System.out.println("Test # 05: Add 2 positive params (dif. Data Type)");
	assertEquals("Sum of two params with different Data Type returns an incorrect value", 
						Calculator.add(200, 150), 350.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_06_add_2() {System.out.println("Test # 06: Add 2 different params (dif. Data Type)");
	assertEquals("Sum of two params with different Data Type returns a positive value", 
						Calculator.add(200, -250), -50.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_07_add_3() {System.out.println("Test # 07: Add 3 positive params");
	assertEquals("Sum of three params returns an incorrect value", 
						Calculator.add(8.0, 5.0, 7.0), 20.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_08_add_3() {System.out.println("Test # 08: Add 3 diferent params");
	assertEquals("Sum of three params returns a positive value", 
						Calculator.add(8.0, -5.0, -7.0), -4.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_09_add_4() {System.out.println("Test # 09: Add 4 positive params");
	assertEquals("Sum of four params returns an incorrect value", 
						Calculator.add(185.3, 0.7, 10.0, 74.0), 270.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_10_add_4() {System.out.println("Test # 10: Add 4 different params");
	assertEquals("Sum of four params returns a positive value", 
						Calculator.add(-185.3, 0.7, 10.0, 74.0), -100.60, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_11_divide_2() {System.out.println("Test # 11: Divide 2 params");
	assertEquals("The dividing of two params returns an incorrect value", 
						Calculator.divide(90.0, 30.0), 3.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_12_divide_2() {System.out.println("Test # 12: Divide by zero");
	assertEquals("The dividing by zero doesn't return positive infinity", 
						Calculator.divide(90.0, 0.0), Double.POSITIVE_INFINITY, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_13_divide_2() {System.out.println("Test # 13: Divide by zero and catch Exception");
	assertEquals("The dividing by zero doesn't return negative infinity", 
			Calculator.divide(-90.0, 0), Double.NEGATIVE_INFINITY, 0.09);}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	//@BeforeClass public static void beforeClass() throws Exception{}
	//@Before public void before() throws Exception{}
	@Test(timeout=1000) //Ignore
	public void test_14_divide_2() {System.out.println("Test # 14: Divide by zero and catch Exception(var.2)");
		exception.expect(ArithmeticException.class);
		exception.expectMessage(containsString("/ by zero"));
		Calculator.divide(90, 0);}
	//@After public void after() throws Exception{}
	//@AfterClass public static void afterClass() throws Exception{}

	@Test(timeout=1000) //Ignore
	public void test_15_divide_2() {System.out.println("Test # 15: Divide by zero (dif. Data Type)");
	assertEquals("The dividing of two params returns an incorrect value", 
						Calculator.divide(90, 3), 30.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_16_divide_2() {System.out.println("Test # 16: Divide by zero and catch Exception");
	{try { Calculator.divide(9, 0);
	fail ("Test # 16: Should have thrown an ArithmeticException because the divisor is zero");}
	catch (ArithmeticException e) {
		assertThat(e.getMessage(), containsString("/ by zero"));}}}
	
	@Test(timeout=1000) //Ignore
	public void test_17_divide_3() {System.out.println("Test # 17: Divide 3 params");
	assertEquals("The dividing of three params returns an incorrect value", 
						Calculator.divide(40.0, 8.0, 2.0), 2.5, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_18_divide_3() {System.out.println("Test # 18: Divide 2 params by zero");
	assertEquals("The dividing of two params by zero doesn't return positive infinity", 
						Calculator.divide(40.0, 8.0, 0.0), Double.POSITIVE_INFINITY, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_19_divide_4() {System.out.println("Test # 19: Divide 4 params");
	assertEquals("The dividing of four parameters returns an incorrect value", 
						Calculator.divide(600.0, 50.0, 4.0, 2.0), 1.5, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_20_divide_4() {System.out.println("Test # 20: Divide 3 params by negative zero");
	assertEquals("The dividing of three params by zero doesn't return negative infinity", 
						Calculator.divide(600.0, 50.0, 4.0, -0.0), Double.NEGATIVE_INFINITY, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_21_multiply_2() {System.out.println("Test # 21: Multiply 2 params");
	assertEquals("The multiplying of two params returns an incorrect value", 
						Calculator.multiply(9.0, 5.0), 45.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_22_multiply_2() {System.out.println("Test # 22: Multiply by zero");
	assertEquals("The multiplying by zero doesn't return positive zero", 
						Calculator.multiply(9.0, 0.0), 0.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_23_multiply_2() {System.out.println("Test # 23: Multiply 2 params (dif. Data Type)");
	assertEquals("The multiplying of two params with different Data Type returns an incorrect value", 
						Calculator.multiply(9.0, 5), 45.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_24_multiply_2() {System.out.println("Test # 24: Multiply by zero (dif. Data Type)");
	assertEquals("The multiplying by zero doesn't return positive zero", 
						Calculator.multiply(9.0, 0), 0.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_25_multiply_2() {System.out.println("Test # 25: Multiply 2 params (dif. Data Type)");
	assertEquals("The multiplying of two params with different Data Type returns an incorrect value", 
						Calculator.multiply(9, 5.0), 45.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_26_multiply_2() {System.out.println("Test # 26: Multiply by zero (dif. Data Type)");
	assertEquals("The multiplying by zero doesn't return positive zero", 
						Calculator.multiply(0, 5.0), 0.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_27_multiply_3() {System.out.println("Test # 27: Multiply 3 params");
	assertEquals("The multiplying of three params returns an incorrect value", 
						Calculator.multiply(20.0, 5.0, 8.0), 800.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_28_multiply_3() {System.out.println("Test # 28: Multiply 2 params by zero");
	assertEquals("The multiplying of two params by zero doesn't return positive zero", 
						Calculator.multiply(20.0, 5.0, 0.0), 0.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_29_multiply_4() {System.out.println("Test # 29: Multiply 4 params");
	assertEquals("The multiplying of four params returns an incorrect value", 
						Calculator.multiply(24.0, 4.0, 10.0, 5.0), 4800.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_30_multiply_4() {System.out.println("Test # 30: Multiply 3 params by zero");
	assertEquals("The multiplying of three params by zero doesn't return positive zero", 
						Calculator.multiply(24.0, 4.0, 10.0, 0.0), 0.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_31_subtract_2() {System.out.println("Test # 31: Subtract 2 params");
	assertEquals("The subtracting of two params returns an incorrect value", 
						Calculator.subtract(28.0, 14.0), 14.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_32_subtract_2() {System.out.println("Test # 32: Subtract 2 different params");
	assertEquals("The subtracting of two params doesn't return a positive value", 
						Calculator.subtract(28.0, -14.0), 42.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_33_subtract_2() {System.out.println("Test # 33: Subtract 2 params (dif. Data Type)");
	assertEquals("The subtracting of two params with different Data Type returns an incorrect value", 
						Calculator.subtract(28.0, 14), 14.0, 0.09);}
	@Test(timeout=1000) //Ignore
	public void test_34_subtract_2() {System.out.println("Test # 34: Subtract 2 dif.params (dif. Data Type)");
	assertEquals("The subtracting of two params with different Data Type doesn't return a positive value", 
						Calculator.subtract(28.0, -14), 42.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_35_subtract_2() {System.out.println("Test # 35: Subtract 2 params (dif. Data Type)");
	assertEquals("The subtracting of two params with different Data Type returns an incorrect value", 
						Calculator.subtract(28, 14.0), 14.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_36_subtract_2() {System.out.println("Test # 36: Subtract 2 dif.params (dif. Data Type)");
	assertEquals("The subtracting of two params with different Data Type doesn't return a negative value", 
						Calculator.subtract(-28, 14.0), -42.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_37_subtract_3() {System.out.println("Test # 37: Subtract 3 params");
	assertEquals("The subtracting of three params returns an incorrect value", 
						Calculator.subtract(220.0, 20.0, 120.0), 80.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_38_subtract_3() {System.out.println("Test # 38: Subtract 3 dif.params");
	assertEquals("The subtracting of three params doesn't return a negative value", 
						Calculator.subtract(-220.0, 20.0, 120.0), -360.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_39_subtract_4() {System.out.println("Test # 39: Subtract 4 params");
	assertEquals("The subtracting of four params returns an incorrect value", 
						Calculator.subtract(400.0, 150.0, 50.0, 45.0), 155.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_40_subtract_4() {System.out.println("Test # 40: Subtract 4 dif.params");
	assertEquals("The subtracting of four params doesn't return a negative value", 
						Calculator.subtract(-400.0, 150.0, 50.0, 45.0), -645.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_41_root_2() {System.out.println("Test # 41: Square root 2 params");
	assertEquals("The extraction of the square root of two params returns an incorrect value", 
						Calculator.root(8.0, 8.0), 4.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_42_root_2() {System.out.println("Test # 42: Square root 2 dif.params");
	assertEquals("The extraction of the square root of two negative params returns a value", 
						Calculator.root(-8.0, -8.0), Double.NaN, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_43_root_2() {System.out.println("Test # 43: Square root 2 params (dif. Data Type)");
	assertEquals("The extraction of the square root of two params with different Data Type returns an incorrect value", 
						Calculator.root(8.0, 8), 4.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_44_root_2() {System.out.println("Test # 44: Square root 2 dif.params (dif. Data Type)");
	assertEquals("The extraction of the square root of two params with different Data Type returns an incorrect value", 
						Calculator.root(8.0, 0), 2.82, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_45_root_2() {System.out.println("Test # 45: Square root 2 params (dif. Data Type)");
	assertEquals("The extraction of the square root of two parameters with different Data Type returns an incorrect value", 
						Calculator.root(8, 8.0), 4.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_46_root_2() {System.out.println("Test # 46: Square root 2 dif.params (dif. Data Type)");
	assertEquals("The extraction of the square root of two negative params returns a value", 
						Calculator.root(-8, -8.0), Double.NaN, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_47_root_3() {System.out.println("Test # 47: Square root 3 params");
	assertEquals("The extraction of the square root of three parameters returns an incorrect value", 
						Calculator.root(6.0, 5.0, 5.0), 4.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_48_root_3() {System.out.println("Test # 48: Square root 3 dif.params");
	assertEquals("The extraction of the square root of three negative params returns a value", 
						Calculator.root(-6.0, -5.0, -5.0), Double.NaN, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_49_root_4() {System.out.println("Test # 49: Square root 4 params");
	assertEquals("The extraction of the square root of four params with different Data Type returns an incorrect value", 
						Calculator.root(4.0, 4.0, 4.0, 4.0), 4.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_50_root_4() {System.out.println("Test # 50: Square root 4 dif.params");
	assertEquals("The extraction of the square root of four params with different Data Type returns an incorrect value", 
						Calculator.root(4.0, -4.0, 4.0, -4.0), 0.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_51_cube_root_2() {System.out.println("Test # 51: Cube root 2 params");
	assertEquals("The extraction of the cube root of two params returns an incorrect value", 
						Calculator.cube_root(20.3, 6.7), 3.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_52_cube_root_2() {System.out.println("Test # 52: Cube root 2 dif.params");
	assertEquals("The extraction of the cube root of two params returns a positive value", 
						Calculator.cube_root(-20.3, -6.7), -3.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_53_cube_root_3() {System.out.println("Test # 53: Cube root 3 params (dif. Data Type)");
	assertEquals("The extraction of the cube root of three params with different Data Type returns an incorrect value", 
						Calculator.cube_root(9.5, 9.5, 7), 3.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_54_cube_root_3() {System.out.println("Test # 54: Cube root 3 dif.params (dif. Data Type)");
	assertEquals("The extraction of the cube root of three params with different Data Type returns a positive value", 
						Calculator.cube_root(-9.5, -9.5, -7), -2.96, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_55_third_power() {System.out.println("Test # 55: Raise to the third power");
	assertEquals("The raising to the third power of two params returns an incorrect value", 
						Calculator.third_power(3.0, 3.0), 27.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_56_third_power() {System.out.println("Test # 56: Raise to the third power dif.param");
	assertEquals("The raising to the third power of two params returns a positive value", 
						Calculator.third_power(-3.0, 3.0), -27.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_57_third_power() {System.out.println("Test # 57: Raise to the third power (dif. Data Type)");
	assertEquals("The raising to the third power of two params with differen Data Type returns an incorrect value", 
						Calculator.third_power(3.0, 3), 27.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_58_third_power() {System.out.println("Test # 58: Raise to the third power dif.param (dif. Data Type)");
	assertEquals("The raising to the third power of two params with differen Data Type returns an incorrect value", 
						Calculator.third_power(3.0, -3), 0.03, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_59_greater_value() {System.out.println("Test # 59: Greater of two values");
	assertEquals("The method of two params doesn't return the greater value", 
						Calculator.maximum(15839.0, 10109.09), 15839.0, 0.09);}
	
	@Test(timeout=1000) //Ignore
	public void test_60_greater_value() {System.out.println("Test # 60: Greater of two values (def.param)");
	assertEquals("The method of two params doesn't return the greater value", 
						Calculator.maximum(-15839.0, 10109.09), 10109.09, 0.09);}
	
}
