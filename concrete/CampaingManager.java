package concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaingManager implements CampaignService{

	@Override
	public void Add(Campaign campaign) {
Add(campaign);		
	}

	@Override
	public void Delete(Campaign campaign) {
Delete(campaign);		
	}
	
}
