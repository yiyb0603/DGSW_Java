package kr.hs.dgsw.c2.bbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BbsUpdateStrategy implements JdbcStrategy {
    protected Writing writing;

    public BbsUpdateStrategy (Writing writing) {
        this.writing = writing;
    }

    @Override
    public PreparedStatement makePreparedStatement(Connection con) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE bulletin SET ");
        sql.append("  title = ?,  ");
        sql.append("  content = ?,  ");
        sql.append(" WHERE id = ?  ");

        PreparedStatement pstmt = con.prepareStatement(sql.toString());
        pstmt.setString(1, writing.getTitle());
        pstmt.setString(2, writing.getContent());
        pstmt.setInt(3, writing.getIndex());

        return pstmt;
    }
}
