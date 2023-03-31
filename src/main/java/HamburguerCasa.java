public class HamburguerCasa implements Hamburguer{
    public float preco;

    public HamburguerCasa(){

    }

    public HamburguerCasa(float preco){
        this.preco = preco;
    }

    @Override
    public float getPreco(){
        return preco;
    }

    @Override
    public String getIngrediente(){
        return "Base";
    }
}