
public class Main {

	public static void main(String[] args) {
		
		///kullanici 
		GamePlayer gamePlayer = new GamePlayer(1, "kullanýcý", "þifre", "Halis Buðrahan", "Bay", 1999, "Tc No");
		//oyun
		Game game = new Game(2, "oyun adý", 5000);
		//kampanya
		Campaign campaign = new Campaign(3, "kafamýza göreee", 50);
		//Veritabanýn simülasyonu
		PlayerCheck playerCheck2 = new PlayerCheck("kullanýcý", "þifre", "Halis Buðrahan", "Bay", 1999, "Tc No");
		
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		GameSellerManager gameSellerManager = new GameSellerManager();
		BaseGamePlayerManager baseGamePlayerManager = new GamePlayerManager();
		
		
		//Basit Validation simülasyonu
		if(playerCheck2.getFirstName() == gamePlayer.getFirstName() &&
			playerCheck2.getLastName() == gamePlayer.getLastName()&& 
			playerCheck2.getNationalityId() == gamePlayer.getNationalityId() &&
			playerCheck2.getUserName() == gamePlayer.getUserName() &&
			playerCheck2.getPassword() == gamePlayer.getPassword()&& 
			playerCheck2.getDateOfBirth() == gamePlayer.getDateOfBirth())
			{
			baseGamePlayerManager.addNewAccount(gamePlayer);
			gameManager.deleteGame(game);
			campaignManager.addCampaign(campaign);
			gameSellerManager.sellGames(gamePlayer, game, campaign);
			}
			else {
					System.out.println("Bilgilerinizin doðru olduðuna emin olun.");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
