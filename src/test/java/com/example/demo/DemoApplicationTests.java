package com.example.demo;

import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.spi.PowerMockTestListener;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.rule.PowerMockRule;
import org.powermock.tests.utils.impl.PowerMockTestNotifierImpl;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;

class MyStringUtil{
    public static String uppercase(String s){
        return s.toUpperCase(Locale.ROOT);
    }
}
@RunWith(PowerMockRunner.class)
@PrepareForTest(ZonedDateTime.class)
//@PowerMockIgnore({"org.mockito.*"})
class DemoApplicationTests {

//    @Rule
//    public PowerMockRule rule = new PowerMockRule();
    @Test
    void test01() {
        System.out.println(1);
    }
    @Before
    public void befor(){

    }

    @Test
    public void test() throws Exception {
        ZonedDateTime d =  PowerMockito.mock(ZonedDateTime.class);
        ZoneId zone = ZoneId.of("Europe/Paris");
        LocalDate date = LocalDate.of(2015, Month.AUGUST, 19);
        ZonedDateTime zdt1 = date.atStartOfDay(zone);
        PowerMockito.when(ZonedDateTime.now()).thenReturn(zdt1);
        System.out.println(d.now());
    }

}
