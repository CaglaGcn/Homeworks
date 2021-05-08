package concrete;

import Abstract.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		return false;
	}

}
