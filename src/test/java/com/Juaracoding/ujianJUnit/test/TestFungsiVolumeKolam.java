package com.Juaracoding.ujianJUnit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.Juaracoding.ujianJUnit.function.FunctionVolumeKolam;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestFungsiVolumeKolam {
	
	FunctionVolumeKolam volume;

	@Before
	public void setUp() throws Exception {
		volume = new FunctionVolumeKolam();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/skenario_volumekolam.csv")
	public void testVolumeKolam(double panjang, double lebar, double tinggi, double hasil) {
		System.out.println(panjang +"x" + lebar+"x" + tinggi +" = " + hasil);
		assertEquals(hasil, volume.volumeKolam(panjang, lebar, tinggi),0.0);
		
	}

}
