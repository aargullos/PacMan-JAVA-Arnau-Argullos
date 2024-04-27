//Clase abstracte perque no hi ha un comportamente generic cada fantasma te el seu propi comportament
public abstract class Fantasma {
    private int posX;
    private int posY;
    private boolean espantat;

    public Fantasma(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.espantat = false;
    }

    public void move(int newPosX, int newPosY) {
        this.posX = newPosX;
        this.posY = newPosY;
    }
    //Aqui actualitzem el estat
    public void actualitzarEstat(boolean newEstat) {
        espantat = newEstat;
    }
    //Si espantat == true siganifica que el pacman sel menja / espantat == false significa que no sel menja
    public boolean serMenjat() {
        return espantat;
    }
    //Cambiem el valor espantat al seu valor opost
    public void cambiarModeEspantat() {
        espantat = !espantat;
    }

    public void reset(int newPosX, int newPosY) {
        posX = newPosX;
        posY = newPosY;
        espantat = false;
    }

    //Detectar colicio amb pacman
    public boolean detectColisionPacman(Pacman pacman) {
        return posX == pacman.getPosX() && posY == pacman.getPosY();
    }

    //Getters i setters
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public boolean isEspanat() {
        return espantat;
    }

    public void setEspanat(boolean espanat) {
        this.espantat = espanat;
    }
}