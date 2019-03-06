/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Usuario
 */
public class PizzaBuilder {
    private float gharina;
    private float mlAgua;
    private float grSal = 0;
    private float mlAceite = 0;
    private float grTomate = 0;
    private float grQueso = 0;
    private float grPinha = 0;
    private String tipoAceite = "";
    private String tipoQueso;

    public PizzaBuilder(final float gharina,final float mlAgua) {
        this.gharina=gharina;
        this.mlAgua=mlAgua;
    }

    public PizzaBuilder setGharina(float gharina) {
        this.gharina = gharina;
        return this;
    }

    public PizzaBuilder setMlAgua(float mlAgua) {
        this.mlAgua = mlAgua;
        return this;
    }

    public PizzaBuilder setGrSal(float grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilder setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilder setGrTomate(float grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilder setGrQueso(float grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilder setGrPinha(float grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public PizzaBuilder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public Pizza createPizza() {
        return new Pizza(gharina, mlAgua, grSal, mlAceite, grTomate, grQueso, grPinha, tipoAceite, tipoQueso);
    }
}
