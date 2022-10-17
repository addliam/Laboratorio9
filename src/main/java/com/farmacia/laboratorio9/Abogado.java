
package com.farmacia.laboratorio9;

abstract class Abogado {
    protected String nombres;
    protected String apellidos;
    protected String status;
    protected int numHijos;
    protected int aniosExperiencia;
    protected float montoFijoMensual;
    protected float bonoCasosCargo;
    protected int numCasosCargo;
    
    // constructor

    public Abogado(String nombres, String apellidos, String status, int numHijos, int aniosExperiencia, float montoFijoMensual, float bonoCasosCargo, int numCasosCargo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.status = status;
        this.numHijos = numHijos;
        this.aniosExperiencia = aniosExperiencia;
        this.montoFijoMensual = montoFijoMensual;
        this.bonoCasosCargo = bonoCasosCargo;
        this.numCasosCargo = numCasosCargo;
    }
    
    
    public float calcularSueldoMensual(){
        // 2500 - 500
        float sueldoMensual = this.montoFijoMensual + this.bonoCasosCargo * this.numCasosCargo;
        return sueldoMensual;
    }
    
    public String getInfo(){
        //Es Juan Pérez, tiene 2 hijos, con 10 años de experiencia profesional. Es un abogado
        //con el estatus de Senior con un total de pago a recibir este mes de S/.9,000
        String info = "Es "+this.nombres+" "+this.apellidos+", tiene "+this.numHijos+" hijos, con "+this.aniosExperiencia+" anios de experiencia profesional.\n Es un abogado con el estatus de "+this.status+" con un total de pago a recibir este mes de S/."+this.calcularSueldoMensual();
        return info;
    }
}
