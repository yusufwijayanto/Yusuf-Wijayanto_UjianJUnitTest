package com.Juaracoding.ujianJUnit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.Juaracoding.ujianJUnit.function.FunctionFahrenheitToCelcius;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestFungsiSuhu {
	
	FunctionFahrenheitToCelcius suhu;

	@Before
	public void setUp() throws Exception {
		suhu = new FunctionFahrenheitToCelcius();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/skenario_suhu.csv")
	public void testKonversiSuhu(double suhuawal, double hasil) {
		System.out.println("("+suhuawal+"-32)*5/9" +" = " + hasil);
		assertEquals(hasil, suhu.konversiSuhu(suhuawal),0.000001);
		
	}

}
