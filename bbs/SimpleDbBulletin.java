package kr.hs.dgsw.c2.bbs;

import java.sql.*;
import java.util.*;

public class SimpleDbBulletin implements Bulletin {
    public void executeUpdate (JdbcStrategy strategy) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mariadb://10.80.162.201/Study", "root", "kimkim0825");

            pstmt = strategy.makePreparedStatement(con);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void write(Writing writing) {
        writing.setIndex(4);
        JdbcStrategy strategy = new JdbcStrategy() {
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
        };
        executeUpdate(strategy);
    }

    @Override
    public void update(Writing writing) {
        JdbcStrategy strategy = new JdbcStrategy() {
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
        };
        executeUpdate(strategy);
    }

    @Override
    public Writing read(int index) {
        try {
            for (Writing writing : list()) {
                if (writing.getIndex() == index) {
                    return writing;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Writing> list() {
        List<Writing> list = new ArrayList<Writing>();
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mariadb://10.80.162.201/Study", "root", "kimkim0825");

            StringBuilder sql = new StringBuilder();
                sql.append("SELECT  ");
                sql.append("  id, ");
                sql.append("  title,  ");
                sql.append("  content,   ");
                sql.append("  writer  ");
                sql.append(" FROM bulletin   ");
                sql.append(" ORDER BY id DESC   ");

                PreparedStatement pstmt = con.prepareStatement(sql.toString());
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String title = rs.getString("title");
                    String content = rs.getString("content");
                    String writer = rs.getString("writer");

                    Writing writing = new Writing();
                    writing.setIndex(id);
                    writing.setTitle(title);
                    writing.setContent(content);
                    writing.setWriter(writer);

                    list.add(writing);
            }

            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
