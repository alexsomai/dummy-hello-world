package com.example.dummy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexandru Somai
 */
@RunWith(MockitoJUnitRunner.class)
public class OperationTest {

    @InjectMocks
    private Operation victim;

    @Test
    public void testSum() throws Exception {
        assertThat(victim.sum(2, 2), is(4));
    }
}
