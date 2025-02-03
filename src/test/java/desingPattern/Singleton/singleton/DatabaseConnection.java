package desingPattern.Singleton.singleton;

public class DatabaseConnection {
    private static DatabaseConnection db;
    private DatabaseConnection(){
        System.out.println("Inside constructor");
    }
    public static DatabaseConnection getInstance(){
        if(db == null) {
            synchronized (DatabaseConnection.class){
                if(db == null){
                    db = new DatabaseConnection();
                }
            }
        }
        return db;
    }
}
