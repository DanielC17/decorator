public abstract class HamburguerDecorator implements Hamburguer{
    private Hamburguer hamburguer;
    public String ingrediente;

    public HamburguerDecorator(Hamburguer hamburguer){
        this.hamburguer = hamburguer;
    }

    public Hamburguer getHamburguer(){
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer){
        this.hamburguer = hamburguer;
    }

    public abstract float getPrecoUnitario();

    @Override
    public float getPreco(){
        return this.hamburguer.getPreco() + this.getPrecoUnitario();
    }
    public abstract String getNomeIngrediente();

    @Override
    public String getIngrediente(){
        return this.hamburguer.getIngrediente() + " - " + this.getNomeIngrediente();
    }

    public void setIngrediente(String ingrediente){
        this.ingrediente = ingrediente;
    }
}