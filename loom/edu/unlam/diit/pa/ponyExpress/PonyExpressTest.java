package edu.unlam.diit.pa.ponyExpress;

import org.junit.Assert;
import org.junit.Test;

public class PonyExpressTest {

	@Test
	public void UnJinete() {
		// fail("Not yet implemented");
		PonyExpress ponyExpress = new PonyExpress();
		Assert.assertEquals(1, ponyExpress.jinetes(new int[] { 18, 15 }));
	}

	@Test
	public void DosJinetes() {
		// fail("Not yet implemented");
		PonyExpress ponyExpress = new PonyExpress();
		Assert.assertEquals(2, ponyExpress.jinetes(new int[] { 43, 23, 40, 13 }));
	}

	@Test
	public void TresJinetesADiferentesDistancias() {
		// fail("Not yet implemented");
		PonyExpress ponyExpress = new PonyExpress();
		Assert.assertEquals(3, ponyExpress.jinetes(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
	}

	@Test
	public void TresJinetesAIgualDistancia() {
		// fail("Not yet implemented");
		PonyExpress ponyExpress = new PonyExpress();
		Assert.assertEquals(3, ponyExpress.jinetes(new int[] { 51, 51, 51 }));
	}

	@Test
	public void CuatroJinetesADistintasDistancias() {
		// fail("Not yet implemented");
		PonyExpress ponyExpress = new PonyExpress();
		Assert.assertEquals(4, ponyExpress.jinetes(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}

}
