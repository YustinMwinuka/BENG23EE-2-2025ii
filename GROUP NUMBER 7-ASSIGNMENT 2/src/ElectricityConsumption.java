import java.sql.*;
import java.util.Scanner;

    public class ElectricityConsumption {

        private static final String DB_URL = "jdbc:postgresql://localhost:5432/electrical_recharging_data";
        private static final String DB_USER = "postgres";
        private static final String DB_PASSWORD = "my_password";
        private static final String TABLE_NAME = "meter_details"; // Replace with your actual table name
        private static final String UNITS_COLUMN = "units_available"; // Replace with your actual units column name
        private static final String USER_ID_COLUMN = "meter_number"; // Replace with your actual user ID column name

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                System.out.println("Connected to the PostgreSQL database successfully!");

                System.out.print("Enter your Meter Number: ");
                int meterNumber = scanner.nextInt();

                int remainingUnits = getRemainingUnits(connection, meterNumber);

                if (remainingUnits != -1) {
                    System.out.println("Remaining electricity units for User ID " + meterNumber + ": " + remainingUnits + " units.");

                    if (remainingUnits <= 10 && remainingUnits > 0) {
                        System.out.println("\n*URGENT: Only " + remainingUnits + " units remaining. Please recharge your meter immediately!*");
                    } else if (remainingUnits == 0) {
                        System.out.println("\n*WARNING: Your electricity units have run out. Please recharge your meter.*");
                    }
                } else {
                    System.out.println("Error: User ID " + meterNumber + " not found.");
                }

            } catch (SQLException e) {
                System.err.println("Error connecting to the database or executing query: " + e.getMessage());
                e.printStackTrace();
            } finally {
                scanner.close();
            }
        }

        public static int getRemainingUnits(Connection connection, int userId) throws SQLException {
            String sql = "SELECT " + UNITS_COLUMN + " FROM " + TABLE_NAME + " WHERE " + USER_ID_COLUMN + " = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, userId);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    return resultSet.getInt(UNITS_COLUMN);
                } else {
                    return -1; // User not found
                }
            }
        }
    }




