import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConection {

    public static Connection c;

    public static void conSQLite() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
        }catch (ClassNotFoundException cnfe){

        }
        String urlConection="jdbc:sqlite:C:\\Users\\user\\DataBases\\newDB.db";
         c= DriverManager.getConnection(urlConection);
        if (c !=null)
            System.out.println("OK-SQLITE");
        else
            System.out.println("ERROR SQLite");

    }
    public static void conApacheDerby() throws SQLException {
        //Conectar con el driver
        String urlConection="jdbc:derby:/home/vesprada/Desktop/db-derby-10.14.2.0-bin/bin/dbalumnos";
        c=DriverManager.getConnection(urlConection);
        if (c !=null)
            System.out.println("OK-DERBY");
        else
            System.out.println("ERROR DERBY");

    }
    public static void conH2() throws SQLException {
        //Conectar con el driver
        //Class.forName("org.sqlite.JDBC");
        String urlConection="jdbc:sqlite:/home/vesprada/test.mv.db";
        c=DriverManager.getConnection(urlConection);
        if (c !=null)
            System.out.println("OK-H2");
        else
            System.out.println("ERROR H2");

    }
    public static void conMySql() throws SQLException {
        //Conectar con el driver
        //Class.forName("org.sqlite.JDBC");
        String urlConection="jdbc:sqlite:/home/vesprada/test.mv.db";
        c=DriverManager.getConnection(urlConection);
        if (c !=null)
            System.out.println("OK-MYSQL");
        else
            System.out.println("ERROR MYSQL");

    }


}
