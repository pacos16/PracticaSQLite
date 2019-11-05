

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            DBConection.conSQLite();
            DBConection.c.createStatement().execute(SQLStatements.createTableClentes());
        }catch (SQLException sqle){
            System.out.println("What");
        }
    }
}
