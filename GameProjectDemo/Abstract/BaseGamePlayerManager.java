
public abstract class BaseGamePlayerManager implements GamePlayerService {

	@Override
	public void addNewAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + "İsimli yeni bir kullanıcı veritabanına kaydedilmiştir");
		
	}

	@Override
	public void deleteAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + "İsimli kullanıcı veritabanından silinmiştir");
		
	}

	@Override
	public void updateAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + "İsimli kullanıcı bilgilerini güncellemiştir.");
		
	}

}
