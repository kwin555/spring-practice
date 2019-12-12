package com.in28minutes.spring.basics.componentscan;

import com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

    public ComponentJdbcConnection getJdbcConnection() {
        return componentJdbcConnection;
    }

    public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.componentJdbcConnection = jdbcConnection;
    }

    @Autowired
    ComponentJdbcConnection componentJdbcConnection;
}
