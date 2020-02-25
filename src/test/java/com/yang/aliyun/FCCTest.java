package com.yang.aliyun;

import com.yang.aliyun.util.StringUtil;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringRunner.class)
@PowerMockIgnore( {"javax.management.*", "javax.net.ssl.*"})
@PrepareForTest(StringUtil.class)
@SpringBootTest
public class FCCTest extends AbstractTestNGSpringContextTests {

    @Test
    public void helloTest() {
        PowerMockito.mockStatic(StringUtil.class);
        when(StringUtil.getHello()).thenReturn("ffff");
        System.out.println(StringUtil.getHello());
    }
}
