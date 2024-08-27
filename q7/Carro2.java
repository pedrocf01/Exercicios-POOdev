class Motor {
    private boolean ligado;

    public Motor() {
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }
    
    public boolean estaLigado() {
        return ligado;
    }
}

class Carro2 {
    private Motor motor;

    public Carro2() {
        this.motor = new Motor();
    }

    public void ligarMotor() {
        motor.ligar();
    }

    public void desligarMotor() {
        motor.desligar();
    }
    
    public void statusMotor() {
        if (motor.estaLigado()) {
            System.out.println("O motor está ligado.");
        } else {
            System.out.println("O motor está desligado.");
        }
    }

    public static void main(String[] args) {
        Carro2 carro = new Carro2();
        
        carro.statusMotor();
        carro.ligarMotor();
        carro.statusMotor();
        carro.desligarMotor();
        carro.statusMotor();
    }
}
