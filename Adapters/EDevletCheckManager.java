package Adapters;

import Abstract.UserCheckService;
import Entities.User;

public class EDevletCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		return true;
	}

}
