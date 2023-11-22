public class Rettangolo extends Forma {

    public Rettangolo(int base, int altezza) {
        super(base, altezza);
    }

    @Override
    public void calcolaArea() {
        System.out.println(getBase() * getAltezza());
    }
}
