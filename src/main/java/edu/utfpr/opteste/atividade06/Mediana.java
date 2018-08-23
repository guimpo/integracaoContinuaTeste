package edu.utfpr.opteste.atividade06;

/**
 *
 * @author paulo
 */
public class Mediana {
    
    public double getMediana(double[] v) {
        int i = v.length/2;
        if(v.length % 2 == 1) {
            return v[i];
        } else {
            return (v[i] + v[i - 1]) / 2;
        }
    }
}
