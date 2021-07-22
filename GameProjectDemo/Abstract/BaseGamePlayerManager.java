
public abstract class BaseGamePlayerManager implements GamePlayerService {

	@Override
	public void addNewAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + "Ýsimli yeni bir kullanýcý veritabanýna kaydedilmiþtir");
		
	}

	@Override
	public void deleteAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + "Ýsimli kullanýcý veritabanýndan silinmiþtir");
		
	}

	@Override
	public void updateAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + "Ýsimli kullanýcý bilgilerini güncellemiþtir.");
		
	}

}
