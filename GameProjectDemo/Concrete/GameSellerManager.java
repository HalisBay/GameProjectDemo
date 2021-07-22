
public class GameSellerManager implements GameSellerService{

	@Override
	public void sellGames(GamePlayer gamePlayer, Game game, Campaign campaign) {
		double gameDiscount = game.getGameUnitPrice() - (game.getGameUnitPrice() * campaign.getDiscount()/100);
		System.out.println("merhaba "+ gamePlayer.getUserName()+ " sat�n ald���n " + game.getGameName() + " isimli oyun "+
		campaign.getCampaignName() + " kampanyas� ile " + game.getGameUnitPrice() 
		+ " TL yerine " + gameDiscount + " TL olarak hesab�na eklenmi�tir. �Y� OYUNLAR !!!");
		
	}

}
