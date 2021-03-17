package spring.boot.ch05.ex04.domain;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user; //test fixture
    
    @Before
    public void setUp(){
        this.user = new User();
    }
    
    @Test
    public void upgradeLevel() {
        Level[] levels = Level.values();
        for(Level level:levels){
            if(level.nextLevel() == null) continue;
            user.setLevel(level);
            user.upgradeLevel();
            assertSame(user.getLevel(),level.nextLevel());
        }
    }
}