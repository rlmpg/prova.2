
import utfpr.ct.dainf.if62c.avaliacao.*;


/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author andreiaskoda
 */
public class Avaliacao2 {

    public static void main(String[] args) {
        
        PoligonalFechada poligonal = new PoligonalFechada(3);
        PontoXZ zero = new PontoXZ(-3,2);
        PontoXZ um = new PontoXZ(-3,6);
        PontoXZ dois = new PontoXZ(0,2);
        double comprimento;
        
        poligonal.set(0, zero);
        poligonal.set(1, um);
        poligonal.set(2, dois);

        comprimento = poligonal.getComprimento();
        
        System.out.println("Comprimento da poligonal = " + comprimento);
        
    }
    
}
