package testng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utilities.SqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestNgMavenExampleTest {
    private static final Logger LOGGER = LogManager.getLogger(TestNgMavenExampleTest.class);

    @Test
    public void run() {
        ResultSet resultSet = SqlConnector.readData("select * from monthly_mortgage");
        try {
            while (resultSet.next()) {
                System.out.println("The Loan Type is: " + resultSet.getString("loantype"));
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
        }

    }
}
