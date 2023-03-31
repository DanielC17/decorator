public class Bacon extends HamburguerDecorator{
    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public float getPrecoUnitario() {
        return 2.5f;
    }

    @Override
    public String getNomeIngrediente() {
        return "Bacon";
    }
}