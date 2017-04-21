/**
 * Represents a player in game.
 */
public class Player {
    private Integer life;

    /**
    * Class constructor.
    * Creates new Player with fixed number of 5 lives.
    */
    public Player() {
        this.life = 5;
    }
    /**
    * Class constructor specifying number of lives .
    * Creates new Player with given number of lives.
    */
    public Player(Integer life) {
        this.life = life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public void changeLife(Integer point) {
        this.life +=  point;
    }

    public Integer getLife() {
            return this.life;
    }
}
