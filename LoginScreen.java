import java.util.HashMap;
import java.util.Map;

// A classe LoginScreen faz autenticação com base no usuario e senha, sendo utilizado um banco simulado. 
public class LoginScreen {
		private Map<String,String> userDatabase;
		// inicializa o banco de dados com alguns usuários
		public LoginScreen() {
			userDatabase = new HashMap<>();
			userDatabase.put("john", "password123");
			userDatabase.put("alice", "securepass");
		}

	
	//verifica se o usuário e a senha fornecidos são válidos
	public boolean login(String username, String password) {
		
		if (userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if (storedPassword.equals(password)) {
				return true; // Retorna true se a autenticação for bem-sucedida
			}
		}	
		return false;// Retorna false se a autenticação falhar
	}
	//adiciona novos usuários ao banco de dados
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
		
	}

}
