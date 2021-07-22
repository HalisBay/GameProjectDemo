
public abstract class BaseCampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "Ýsimli yeni bir kampanya sisteme dahil edilmiþtir.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "Ýsimli kampanya sistemden silinmiþtir.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "Ýsimli kampanya güncellenmiþtir.");
		
	}

}
