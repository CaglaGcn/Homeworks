package concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameManager implements GameService{

	@Override
	public void buy(User user, Game game, Campaign campaign) {
		game.setPrice(game.getPrice() - (game.getPrice()/campaign.getDiscountPrice()));
		buy(user, game, campaign);
	}

}
