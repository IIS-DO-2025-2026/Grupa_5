package singleton;

// I način - nestrpljivo učitavanje (eager loading)
public class DatabaseConnection {
	
	private static DatabaseConnection instance = new DatabaseConnection();
	
	/*public*/ private DatabaseConnection() {
		
	}

	// pravila za konekciju nad BP
	
	public static DatabaseConnection getInstance() {
		return instance;
	}
	
}
