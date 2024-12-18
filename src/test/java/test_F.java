import org.junit.Assert;
import org.junit.Test;

public class test_F {
    @Test
    public  void testFactoriel() {
        // Given
        int nombre = 5;
        int resultatAttendu= 120;


        Factoriel factoriel = new Factoriel();


        // When
        long realResultat = factoriel.calculerFactoriel(nombre);

        // Then
        Assert.assertNotNull(realResultat);
        Assert.assertEquals(resultatAttendu, realResultat);
    }

}
