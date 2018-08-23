package edu.utfpr.opteste.atividade06;

/**
 *
 * @author paulo
 */
public class Media {
    
    double media = 0d;
    
    public Media(double[] v) {
        media = 0d;
        for(int i = 0; i < v.length; i++) {
            media += v[i];
        }
        media /= v.length;
    }
    
    public double getMedia() {
        return this.media;
    }
}
