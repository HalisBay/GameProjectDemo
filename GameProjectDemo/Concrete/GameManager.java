
public class GameManager extends BaseGameManager{
	@Override
	public void addNewGame(Game game) {
		System.out.println(game.getGameName() + " isimli  yeni bir oyun sisteme kaydedilmi�tir");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() + " isimli   bir oyun sistemden silinmi�tir");
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getGameName() + " isimli oyun bilgileri g�ncellenmi�tir.");
		
	}
}
