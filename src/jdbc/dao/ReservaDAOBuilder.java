package jdbc.dao;

import java.sql.Connection;

public class ReservaDAOBuilder {
    private Connection connection;

    public ReservaDAOBuilder setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

    public ReservaDAO createReservaDAO() {
        return new ReservaDAO(connection);
    }
}