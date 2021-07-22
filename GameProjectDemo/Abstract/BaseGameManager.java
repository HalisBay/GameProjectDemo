
public abstract class BaseGameManager implements GameService{

	@Override
	public void addNewGame(Game game) {
		System.out.println(game.getGameName() + "isimli  yeni bir oyun sisteme kaydedilmiştir");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() + "isimli   bir oyun sistemden silinmiştir");
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getGameName() + "isimli oyun bilgileri güncellenmiştir.");
		
	}

}
