package org.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.w3c.dom.ls.LSOutput;

@Configuration
public class PersonConfig {
    @Bean("person")
    public Person personSingle()
    {
        return new Person();
    }
}
