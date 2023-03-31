
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class HamburguerTest {

    @Test
    void deveRetornarPrecoHamburguer(){
        Hamburguer hamburguer = new HamburguerCasa(26.0f);
        assertEquals(26.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerBacon(){
        Hamburguer hamburguer = new Bacon(new HamburguerCasa(26.0f));
        assertEquals(28.5f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerCheddar(){
        Hamburguer hamburguer = new Cheddar(new HamburguerCasa(26.0f));
        assertEquals(29.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerCatupiry(){
        Hamburguer hamburguer = new Catupiry(new HamburguerCasa(26.0f));
        assertEquals(29.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComTodosAdicionais(){
        Hamburguer hamburguer = new Cheddar(new Bacon(new Catupiry(new HamburguerCasa(26.0f))));
        assertEquals(34.5f, hamburguer.getPreco());
    }


}
