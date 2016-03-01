package org.springframework.social.connect.web;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.ConnectionFactoryLocator;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Petri Kainulainen
 */
public class TestProviderSignInAttempt extends ProviderSignInAttempt {

    private Connection<?> connection;

    private Set<String> connections = new HashSet<>();

    public TestProviderSignInAttempt(Connection<?> connection) {
        super(connection);
        this.connection = connection;
    }

    @Override
    public Connection<?> getConnection(final ConnectionFactoryLocator connectionFactoryLocator) {
        return connection;
    }

    /*@Override
    void addConnection(String userId) {
        connections.add(userId);
    }*/

    public Set<String> getConnections() {
        return connections;
    }
}
