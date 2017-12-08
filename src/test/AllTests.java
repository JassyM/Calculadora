package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestDivision.class, TestMultiplicacion.class, TestPotencia.class, TestRaiz.class, TestResta.class,
	TestSuma.class })
public class AllTests {

}
