package Practicum.Practicum_2_B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    private Voetbalclub utrecht = new Voetbalclub();

    @Test
    void naam(){
        assertEquals("FC", utrecht.getNaam());

    }


    @Test
    void aantalGespeeld() {
        utrecht.verwerkResultaat('w');
        utrecht.verwerkResultaat('w');
        utrecht.verwerkResultaat('g');
        assertEquals(3, utrecht.aantalGespeeld());
    }

    @Test
    void aantalPunten() {
        utrecht.verwerkResultaat('w');
        utrecht.verwerkResultaat('w');
        utrecht.verwerkResultaat('g');
        assertEquals(7, utrecht.aantalPunten());

    }

    @Test
    void verwerkResultaat() {
        utrecht.verwerkResultaat('f' );
        assertEquals(0, utrecht.aantalPunten());
    }

    @Test
    void testToString() {
        String expected = utrecht.getNaam() + "\t\t" +
                utrecht.aantalGespeeld() + " " +
                utrecht.getAantalGewonnen() + " " +
                utrecht.getAantalGelijk() + " " +
                utrecht.getAantalVerloren() + " " +
                utrecht.aantalPunten();
        assertEquals(expected,utrecht.toString());

    }
}