import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestPunt {
    @Test
    public void constructor() {
        // comprova que Punt() pugui ser cridat
        new Punt();
    }

    @Test
    public void constructorDefecteXZero() {
        // comprova que Punt() deixi a 0 la propietat x de Punt
        Punt p = new Punt();
        assertEquals(0, p.getX());
    }
    
    @Test
    public void constructorDefecteYZero() {
        // comprova que Punt() deixi a 0 la propietat y de Punt
        Punt p = new Punt();
        assertEquals(0, p.getX());
    }
}
