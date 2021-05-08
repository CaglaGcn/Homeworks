package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class BaseGameManager implements GameService {

	@Override
	public void buy(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() +"isimli kullan�c�" + game.getName() +  "adl� oyunu sat�n ald�" + game.getPrice());
	}

}
