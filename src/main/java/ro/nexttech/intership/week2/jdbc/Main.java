package ro.nexttech.intership.week2.jdbc;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/accountancy_db?autoReconnect=true&&useSSL=false";
        String user = "root";
        String password = "password";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String selectAll = "select * from accountancy_db.user";

            String selectAllPayedInvoices = "select * from INVOICE i JOIN PAYMENT_HAS_INVOICE pi ON i.idinvoice=pi.idinvoice " +
                    "JOIN PAYMENT p ON p.idpayment WHERE p.type='BANK' AND i.company_id=1";
            String selectAllUnpaidInvoicesOrderedByMaturityDate = "SELECT i.idinvoice FROM INVOICE i JOIN PAYMENT_HAS_INVOICE pi ON i.idinvoice = pi.idinvoice JOIN PAYMENT p ON p.idpayment=pi.idpayment WHERE i.company_id = 1 GROUP BY i.idinvoice, i.value HAVING sum(p.sum) < i.value ORDER BY i.maturity_date DESC;";
            String selectAllElectricaInvoices = "select * from INVOICE i JOIN COMPANY c ON i.company_id=c.company_id WHERE c.company_name='Electrica'; ";
            String selectAllOrangeInvoicesFromLastYear = "select * from INVOICE i JOIN COMPANY c ON i.company_id=c.company_id WHERE c.company_name='Orange' AND  i.release_date>='2020-01-01';";
            String selectAllAllCompanyUsersGroupedByRoles = "select s.supplier_name from SUPPLIER s JOIN INVOICE i ON s.id_supplier=i.id_supplier JOIN PAYMENT_HAS_INVOICE pi ON i.idinvoice=pi.idinvoice JOIN PAYMENT p ON p.idpayment WHERE p.type='CASH' AND p.data>'2020-09-11' <current_date();";
            String selectAllSuppliersNamePayedCashFromLastTwoMoths = "";
            ResultSet result = statement.executeQuery(selectAll);

            while (result.next())
                System.out.println(result.getString("username"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
