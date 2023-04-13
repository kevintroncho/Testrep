import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlanetaTestFet {

    Planeta terra = new Planeta("Terra", 1500, 3000);
    Planeta marte = new Planeta("Marte", 1200, 3000);
    Planeta jupiter = new Planeta("Jupiter", 1200, 3000);

    @Test 
    public void testPlanetaEnano()
    {        
        int enano = terra.planetaEnano();
        int enano2 = marte.planetaEnano();

        assertEquals(0, enano);
        assertEquals(1, enano2);
    }    

    @Test 
    public void testExpansio()
    {
        terra.expansio();
        int diametre = terra.getDiametre();
        assertEquals(4500, diametre);
    }

    @Test 
    public void testColisio()
    {
        int pesTest = marte.getPes();

        int impacte = marte.colisio(2000);

        assertNotEquals(3000, marte.getPes());
        assertEquals(0, impacte);
        assertNotEquals(pesTest, marte.getPes());
        assertEquals(2200, marte.getDiametre());

        int impacte2 = jupiter.colisio(400);

        assertEquals(1, impacte2);         

    }    
}