
public abstract class BaseCampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "�simli yeni bir kampanya sisteme dahil edilmi�tir.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "�simli kampanya sistemden silinmi�tir.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "�simli kampanya g�ncellenmi�tir.");
		
	}

}
