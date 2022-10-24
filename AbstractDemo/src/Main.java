
public class Main {

	public static void main(String[] args) {

		
		BaseDatabaseManager[] baseDatabaseManagers= {new HibernateDatabaseManager(),new JdbcDatabaseManager()};
		
		for(BaseDatabaseManager bdm:baseDatabaseManagers) {
			bdm.add();
		}
	}

}
