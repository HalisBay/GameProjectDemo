 
public class GamePlayerManager extends BaseGamePlayerManager{
	
	@Override
	public void addNewAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + " isimli yeni bir kullan�c� veritaban�na kaydedilmi�tir");
		
	}

	@Override
	public void deleteAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + " isimli kullan�c� veritaban�ndan silinmi�tir");
		
	}

	@Override
	public void updateAccount(GamePlayer gamePlayer) {
		System.out.println(gamePlayer.getUserName() + " isimli kullan�c� bilgilerini g�ncellemi�tir.");
		
	}
}
