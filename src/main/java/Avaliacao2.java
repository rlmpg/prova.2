
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
        
        /* No programa principal, instancie uma poligonal fechada no plano XZ
        com os vértices de coordenadas (x, z), (-3,2), (-3,6) e (0,2), calcule
        e exiba o comprimento. O programa deve exibir uma mensagem no formato 
        "Comprimento da poligonal = 123,456". */
        
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
