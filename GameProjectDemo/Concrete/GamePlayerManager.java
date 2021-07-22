 
public class GamePlayerManager extends BaseGamePlayerManager{
	
	@Override
	public void addNewAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + " isimli yeni bir kullanýcý veritabanýna kaydedilmiþtir");
		
	}

	@Override
	public void deleteAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + " isimli kullanýcý veritabanýndan silinmiþtir");
		
	}

	@Override
	public void updateAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + " isimli kullanýcý bilgilerini güncellemiþtir.");
		
	}
}
