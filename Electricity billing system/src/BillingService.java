import java.sql.*;
import java.time.LocalDateTime;

public class BillingService {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/electricity_db";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "28postgress54"; // Replace with your actual password

    // Connect to database
    private Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    // Make a payment
    public void makePayment(int userId, int meterId, double amount) {
        String insertTransaction = "INSERT INTO transactions (user_id, meter_id, amount, date) VALUES (?, ?, ?, ?)";
        String updateMeterStatus = "UPDATE meters SET status = TRUE WHERE meter_id = ?";

        try (Connection conn = connect()) {
            conn.setAutoCommit(false); // Transactional

            try (
                    PreparedStatement paymentStmt = conn.prepareStatement(insertTransaction);
                    PreparedStatement statusStmt = conn.prepareStatement(updateMeterStatus)
            ) {
                // Insert transaction
                paymentStmt.setInt(1, userId);
                paymentStmt.setInt(2, meterId);
                paymentStmt.setDouble(3, amount);
                paymentStmt.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
                paymentStmt.executeUpdate();

                // Update meter status
                statusStmt.setInt(1, meterId);
                statusStmt.executeUpdate();

                conn.commit();
                System.out.println("Payment successful. Electricity activated.");

            } catch (SQLException ex) {
                conn.rollback();
                System.err.println("Transaction failed. Rolled back.");
                ex.printStackTrace();
            }

        } catch (SQLException e) {
            System.err.println("Database error.");
            e.printStackTrace();
        }
    }

    // Main method to test
    public static void main(String[] args) {
        BillingService billingService = new BillingService();

        // Sample test: user 1 pays for meter 1
        billingService.makePayment(1, 1, 15000.00);
    }
}