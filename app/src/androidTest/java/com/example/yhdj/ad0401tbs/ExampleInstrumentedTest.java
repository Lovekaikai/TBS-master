package com.example.yhdj.ad0401tbs;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {

        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.yhdj.ad0401tbs", appContext.getPackageName());
    }
}
