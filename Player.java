public class Player {
    private Integer life;

    public Player(){
        this.life = 5;
    }
    public Player(Integer life){
        this.setLife(life);
    }

    public void setLife(Integer life){
        this.life = life;
    }

    public void changeLife(Integer point){
        this.life +=  point;
    }

    public Integer getLife(){
            return life;
    }
}
