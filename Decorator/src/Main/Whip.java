/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author manue
 */
public class Whip extends Adicional {

    public Whip(Bebida beber) {
        super("Whip");
        this.beber = beber;

    }

    @Override
    public String GetNombre() {
        return this.beber.GetNombre() + "     [-] " + this.nombre + "\n";

    }

    @Override
    public int GetPrecio() {
        return this.beber.GetPrecio() + 2000;
    }

}
