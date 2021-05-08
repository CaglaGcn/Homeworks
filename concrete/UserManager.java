package concrete;

import Abstract.BaseUserManager;
import Abstract.UserCheckService;
import Entities.User;

public class UserManager extends BaseUserManager {
	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void save(User user) {
			if(userCheckService.CheckIfRealPerson(user)) {
				save(user);
				
			}else {
				System.out.println("Geçersiz kullanýcý");
				
			}
	}

	@Override
	public void update(User user) {
		if(userCheckService.CheckIfRealPerson(user)) {
			save(user);
			
		}else {
			System.out.println("Geçersiz kullanýcý");
			
		}
	}

	@Override
	public void delete(User user) {
		delete(user);
	}
	
	
}
