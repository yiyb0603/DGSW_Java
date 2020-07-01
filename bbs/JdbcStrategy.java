package kr.hs.dgsw.c2.bbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface JdbcStrategy {
    PreparedStatement makePreparedStatement(Connection con) throws SQLException;
}