package org.mobworkshop.javaJunit4Starter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MobTest {

    @Test
    public void hasMadeTestPass() {
        Mob mob = new Mob();
        boolean mobHasMadeTestPass = mob.hasMadeTestPass();
        Assert.assertTrue("false != true", mobHasMadeTestPass);
    }
}