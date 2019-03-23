package satelite;

public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distancia_tierra;
    Satelite (double m,double p,double d){
            meridiano=m;
            paralelo=p;
            distancia_tierra=d;
    }
    Satelite (){
            meridiano=paralelo=distancia_tierra=0;
    }
    public void setPosicion(double m,double p,double d){
            meridiano=m;
            paralelo=p;
            distancia_tierra=d;
    }
    
    public void variaAltura(double desplazamiento) {
    	this.distancia_tierra += desplazamiento;
    }
    
    public boolean enOrbita() {
    	boolean orbita = false;
    	if (distancia_tierra == 0) {
    		orbita = true;
    	}
    	
    	return orbita;
    }
    
    public void variaPosicion(double variap, double variam) {
    	this.paralelo += variap;
    	this.meridiano += variam;
    }
    public void printPosicion(){
        System.out.println("El satélite se encuentra en el paralelo " + paralelo + " Meridiano " + meridiano +
        		" a una distancia de la tierra de " + distancia_tierra + " Kilómetros");
    }
}