package org.whl.annotation.demo;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestDemo {

    @Test
    public void test() {

        String x = "4";
        assertThat(x, equalTo("3"));
    }
}
