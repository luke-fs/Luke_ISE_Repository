import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class FunktionaleKlasseTest {

	@Test
	void test() {
		FunktionaleKlasse x = new FunktionaleKlasse();
		assertEquals(10, x.addiere(5, 5));
	}

}