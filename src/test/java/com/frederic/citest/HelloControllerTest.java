package com.frederic.citest;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest
    {
    @Test
    public void should_return_Helloworld_when_param_is_null()
        {
        HelloController helloController = new HelloController();
        String result = helloController.index(null);

        assertThat(result).isEqualTo("Hello world");
        }
    @Test
    public void should_return_Hello_string_when_param_is_string()
        {
        HelloController helloController = new HelloController();
        String nom = "toto";
        String result = helloController.index(nom);

        assertThat(result).isEqualTo("Hello " + nom);
        }
    }
