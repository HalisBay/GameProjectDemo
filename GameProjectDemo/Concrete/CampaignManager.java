
public class CampaignManager extends BaseCampaignManager{
	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli yeni bir kampanya sisteme dahil edilmiþtir.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya sistemden silinmiþtir.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya güncellenmiþtir.");
		
	}

}
