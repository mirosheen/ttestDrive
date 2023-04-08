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


    @Test
    public void testOneSpare() {
        rollSpare();
        g.roll(3);
        rollMany(0,17);
        assertEquals(16, g.score());
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    @Test
    public void testOneStrike() {
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(0,16);
        assertEquals(24, g.score());
    }

    private void rollStrike() {
        g.roll(10);
    }

    @Test
    public void testPerfectGame() {
        rollMany(10,12);
        assertEquals(300, g.score());
    }



}