
package com.farmacia.laboratorio9;

public class AbogadoJunior extends Abogado {
    private float bonoPorCasoApoyo = 200;
    private int numCasosApoyo;
    
    public AbogadoJunior(String nombres, String apellidos, String status, int numHijos, int aniosExperiencia, int numCasosCargo, int numCasosApoyo) {
        super(nombres, apellidos, status, numHijos, aniosExperiencia, 2500, 500, numCasosCargo);
        this.numCasosApoyo = numCasosApoyo;
    }
    
    @Override
    public float calcularSueldoMensual(){
        float monto1 =  super.calcularSueldoMensual();
        float monto2 = this.numCasosApoyo * this.bonoPorCasoApoyo;
        return monto1 + monto2;
    }
    
}
