package com.example.dummy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexandru Somai
 *         date 5/4/16
 */
@RunWith(MockitoJUnitRunner.class)
public class HelloWorldTest {

    @InjectMocks
    private HelloWorld helloWorld;

    @Test
    public void testSayHello(){
        assertThat(helloWorld.sayHello(), is("hello"));
    }
}
