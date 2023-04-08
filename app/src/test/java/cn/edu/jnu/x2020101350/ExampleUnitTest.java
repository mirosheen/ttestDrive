package cn.edu.jnu.x2020101350;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Game g;
    @Before
    public void setUp(){
        g=new Game();
    }
    @Test
    public void testGutterGame() {
        rollMany(0,20);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() {
        rollMany(1,20);
        assertEquals(20, g.score());
    }

    private void rollMany(int pins, int n) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }



}