
import Adapters.EDevletCheckManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;
import concrete.CampaingManager;
import concrete.GameManager;
import concrete.UserManager;

public class Main {
	

	public static void main(String[] args) {

new UserManager(new EDevletCheckManager());
new GameManager();
new CampaingManager();

new User(1, "Çaðla","Gülcan");
new Game(1,"Java", 500);
new Campaign(2,"yaz indirimi", 10);


}
}
