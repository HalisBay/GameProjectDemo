
public class Game implements Entity{
	private int gameId;
	private String gameName;
	private double gameUnitPrice;
	
	public Game() {
		
	}
	
	public Game(int gameId, String gameName, double gameUnitPrice) {
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameUnitPrice = gameUnitPrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGameUnitPrice() {
		return gameUnitPrice;
	}

	public void setGameUnitPrice(double gameUnitPrice) {
		this.gameUnitPrice = gameUnitPrice;
	}

}
