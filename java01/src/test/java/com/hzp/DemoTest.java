package com.hzp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @BelongsProject: maven-project
 * @BelongsPackage: com.hzp
 * @Author: ASUS
 * @CreateTime: 2023-06-09  17:44
 * @Description: TODO
 * @Version: 1.0
 */
public class DemoTest {

    @Test
    public void testSay(){
        Demo demo = new Demo();
        String ret=demo.say("hzp");
        Assert.assertEquals("hello hzp",ret);
    }
}
