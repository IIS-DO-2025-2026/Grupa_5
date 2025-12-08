package singleton;

public class TestSingoleton {

	public static void main(String[] args) {
		
		/*DatabaseConnection databaseConnection1 = new DatabaseConnection();
		DatabaseConnection databaseConnection2 = new DatabaseConnection();*/
		
		// I način - eager loading
		DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
		DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
		
		System.out.println(databaseConnection1);
		System.out.println(databaseConnection2);
		
		System.out.println("Hash vrednost objekta 1: " + Integer.toHexString(databaseConnection1.hashCode()));
		System.out.println("Hash vrednost objekta 2: " + Integer.toHexString(databaseConnection2.hashCode()));

	
		// II način - lazy loading
		DatabaseConnectionLazy databaseConnectionLazy1 = DatabaseConnectionLazy.getInstance();
		DatabaseConnectionLazy databaseConnectionLazy2 = DatabaseConnectionLazy.getInstance();

		System.out.println(databaseConnectionLazy1);
		System.out.println(databaseConnectionLazy2);
	}

}
