package com.Juaracoding.ujianJUnit.test;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestFungsiKelilingKolam.class, TestFungsiSuhu.class, TestFungsiVolumeKolam.class })
public class AllTests {

}
