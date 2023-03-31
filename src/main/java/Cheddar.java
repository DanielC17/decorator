public class Cheddar extends HamburguerDecorator{
    public Cheddar(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public float getPrecoUnitario() {
        return 3.0f;
    }

    @Override
    public String getNomeIngrediente() {
        return "Cheddar";
    }
}