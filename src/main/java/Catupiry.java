public class Catupiry extends HamburguerDecorator{
    public Catupiry(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public float getPrecoUnitario() {
        return 3.0f;
    }

    @Override
    public String getNomeIngrediente() {
        return "Catupiry";
    }
}