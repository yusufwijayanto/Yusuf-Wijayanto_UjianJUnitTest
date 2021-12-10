package com.Juaracoding.ujianJUnit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.Juaracoding.ujianJUnit.function.FunctionKelilingKolam;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestFungsiKelilingKolam{

	FunctionKelilingKolam keliling;
	
	@Before
	public void setUp() throws Exception {
		keliling = new FunctionKelilingKolam();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	@FileParameters("src/test/resources/skenario_kelilingkolam.csv")
	public void testKelilingKolam(double panjang, double lebar, double tinggi, double hasil) {
	System.out.println("4x(" + panjang +"+" + lebar+"+" + tinggi +") = " + hasil);
	assertEquals(hasil, keliling.kelilingKolam(panjang, lebar, tinggi),0.0);
	}
}
