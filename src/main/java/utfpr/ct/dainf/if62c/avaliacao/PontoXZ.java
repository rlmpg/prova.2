/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1237365
 */
public class PontoXZ extends Ponto2D {
    
    public PontoXZ() {
        super();
    }
    
    public PontoXZ(double x, double z) {
        super(x, 0, z);
    }
    
    @Override
    public String toString() {
        String nome;
        nome = getNome() + "(" + getX() + "," + getZ() + ")";
        return nome;
    }
    
}
