import codefinity.animals.Beagle;
import codefinity.animals.Bulldog;
import codefinity.animals.Dobermann;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testBulldog() {
        Bulldog bulldog = new Bulldog();
        bulldog.name = "Rocky";
        bulldog.color = "Brown";
        
        assertEquals("Rocky", bulldog.name);
        assertEquals("Brown", bulldog.color);
        
        assertEquals("Bark bark!", bulldog.bark());
    }

    @Test
    void testDobermann() {
        Dobermann dobermann = new Dobermann();
        dobermann.name = "Max";
        dobermann.color = "Black";

        assertEquals("Max", dobermann.name);
        assertEquals("Black", dobermann.color);

        assertEquals("Bark bark!", dobermann.bark());
    }

    @Test
    void testBeagle() {
        Beagle beagle = new Beagle();
        beagle.name = "Buddy";
        beagle.color = "Tri-color";

        assertEquals("Buddy", beagle.name);
        assertEquals("Tri-color", beagle.color);

        assertEquals("Bark bark!", beagle.bark());
    }
}
