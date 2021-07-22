
public class GameSellerManager implements GameSellerService{

	@Override
	public void sellGames(GamePlayer gamePlayer, Game game, Campaign campaign) {
		double gameDiscount = game.getGameUnitPrice() - (game.getGameUnitPrice() * campaign.getDiscount()/100);
		System.out.println("merhaba "+ gamePlayer.getUserName()+ " satýn aldýðýn " + game.getGameName() + " isimli oyun "+
		campaign.getCampaignName() + " kampanyasý ile " + game.getGameUnitPrice() 
		+ " TL yerine " + gameDiscount + " TL olarak hesabýna eklenmiþtir. ÝYÝ OYUNLAR !!!");
		
	}

}
