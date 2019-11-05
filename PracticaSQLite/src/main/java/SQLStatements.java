public class SQLStatements {


    public static String createTableProductos(){
        return "CREATE TABLE IF NOT EXISTS productos (id numeric primary key, descripcion varchar(50) not null," +
                " stockactual numeric, stockminimo numeric, pvp numeric);";
    }
    public static String createTableClentes(){
        return "CREATE TABLE if not exists clientes (id numeric primary key, nombre varchar(50) not null," +
                " direccion varchar(50), poblacion varchar(60), telefono varchar(20),nif varchar(10));";

    }
    public static String createTableVentas(){

        return "CREATE TABLE IF NOT EXISTS ventas (idventa numeric primary key, fechaventa DATE not null," +
                "id_cli numeric , id_prod numeric, cantidad numeric ," +
                "foreing key(id_cli) references clientes(id)," +
                "foreing key(id_prod) references productos(id);";

    }


}
