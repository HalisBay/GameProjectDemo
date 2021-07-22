 
public class GamePlayerManager extends BaseGamePlayerManager{
	
	@Override
	public void addNewAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + " isimli yeni bir kullanıcı veritabanına kaydedilmiştir");
		
	}

	@Override
	public void deleteAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + " isimli kullanıcı veritabanından silinmiştir");
		
	}

	@Override
	public void updateAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + " isimli kullanıcı bilgilerini güncellemiştir.");
		
	}
}
