package com.in28minutes.spring.basics.componentscan;

import com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ComponentDAO {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ComponentJdbcConnection getJdbcConnection() {
        return componentJdbcConnection;
    }

    public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.componentJdbcConnection = jdbcConnection;
    }

    @Autowired
    ComponentJdbcConnection componentJdbcConnection;

}
