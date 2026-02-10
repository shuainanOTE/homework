package com.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    // SQL Server 密碼 Zz123456789
    private String url = "jdbc:sqlserver://localhost:1433;databaseName=Shop;encrypt=true;trustServerCertificate=true;";
    private String user = "sa"; 
    private String password = "Zz123456789";

    public List<Product> searchProducts(String keyword) {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM Product WHERE name LIKE ?";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                
                pstmt.setString(1, "%" + keyword + "%");
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
                    Product p = new Product();
                    p.setId(rs.getInt("id"));
                    p.setName(rs.getString("name"));
                    p.setPrice(rs.getInt("price"));
                    p.setQuantity(rs.getInt("quantity"));
                    list.add(p);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
