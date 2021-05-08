package Abstract;

import Entities.Campaign;

public class BaseCampaignServiceManager implements CampaignService{

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Kampanya eklendi "+ campaign.getName());
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Kampanya silindi " + campaign.getName());
	}

}
