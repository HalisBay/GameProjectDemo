
public abstract class BaseGamePlayerManager implements GamePlayerService {

	@Override
	public void addNewAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + "�simli yeni bir kullan�c� veritaban�na kaydedilmi�tir");
		
	}

	@Override
	public void deleteAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + "�simli kullan�c� veritaban�ndan silinmi�tir");
		
	}

	@Override
	public void updateAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + "�simli kullan�c� bilgilerini g�ncellemi�tir.");
		
	}

}
