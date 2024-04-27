public class Pacman {
    private int posX;
    private int posY;
    private int cantitatBolas;
    private int cantitatBolasEspecials;
    private int cantitatFruitas;
    private int vidas;

    public Pacman(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.cantitatBolas = 0;
        this.cantitatBolasEspecials = 0;
        this.cantitatFruitas = 0;
        this.vidas = 3;

    }

    public void move(int newPosX, int newPosY){
        this.posX = newPosX;
        this.posY = newPosY;
    }
    //Per incrementar la cantitat de bolas cuan menja una bola
    public void pickupBola() {
        cantitatBolas++;
    }
    //Per incrementar la cantitat de bolase specials cuan menja una bola especial
    public void pickupBolaEspecial() {
        cantitatBolasEspecials++;
    }
    //Per incrementar la cantitat de fruita cuan menja una fruita
    public void pickupFruita() {
        cantitatFruitas++;
    }
    //Decrement de la vida
    public void loseLife() {
        vidas--;
    }
    //Per detectar si hi ha una coliscio amb un fantasma
    public boolean detectColisionFantasma(Fantasma fantasma) {
        return posX == fantasma.getPosX() && posY == fantasma.getPosY();
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

    public int getCantitatBolas() {
        return cantitatBolas;
    }

    public void setCantitatBolas(int cantitatBolas) {
        this.cantitatBolas = cantitatBolas;
    }

    public int getCantitatBolasEspecials() {
        return cantitatBolasEspecials;
    }

    public void setCantitatBolasEspecials(int cantitatBolasEspecials) {
        this.cantitatBolasEspecials = cantitatBolasEspecials;
    }

    public int getCantitatFruitas() {
        return cantitatFruitas;
    }

    public void setCantitatFruitas(int cantitatFruitas) {
        this.cantitatFruitas = cantitatFruitas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
