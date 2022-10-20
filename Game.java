import GameMap
import GamePieces // need to import the functions in GampMap and GamePiece.


public class Game {
    
    private GameMap;
    private GamePieces;
    
    public void move (int x1, int y1, int x2, int y2) {
        // Move a certain piece from coordinate (x1, y1) to coordinate (x2, y2)
    }
    public boolean isMovable(string animal) {
        // Check if the chess piece is able to move to another location.
    }
    public int getCoordByAnimal(string animal) {
        // Given the animal, get the coordinate of it
    }
    public String getAnimalByCoord(int x, int y) {
        // Given the coordinate, know what animal is on that coordinate
    }
    public void getBoardState() {
        // Get the state of the board
    }
    public void getPiecesState() {
        // Get the state of a piece
    }
    public Boolean isWin() {
        // Check if a user wins the game or not.
    }
    public void win(){
        // If a user wins, show the win status.
    }
}
