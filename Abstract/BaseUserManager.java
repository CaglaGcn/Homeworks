package Abstract;

import Entities.User;

public abstract class BaseUserManager implements UserService {

	public void Add(User user) {
	
	System.out.println("Kaydedildi: " + user.getFirstName());}
	}

