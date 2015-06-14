package nemchin.ru.object;

import javax.validation.constraints.Size;

public class User {
	@Size(min=4, message="Имя должно быть больше 4 знаков")
	private String name;
	@Size(min=6, max=10, message="Пароль должен быть от 5 до 10 знаков")
	private String password;
	private boolean admin;
	
	public String getName(){
		return name;
	}
	public String getPassword(){
		return password;
	}
	public Boolean getAdmin(){
		return admin;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public void setAdmin(Boolean admin){
		this.admin = admin;
	}
}
