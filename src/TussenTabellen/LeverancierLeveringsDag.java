/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Algemeen.Openingstijd;
import Leveringen.Leverancier;
import Leveringen.LeveringsDag;

/**
 *
 * @author stefa
 */
public class LeverancierLeveringsDag {

    public int LeverancierLeveringsDagId;

    public int LeverancierId;
    public int LeveringsDagId;

    public Leverancier Leverancier;
    public LeveringsDag LeveringsDag;

    public LeverancierLeveringsDag() {

    }

    public LeverancierLeveringsDag(Leverancier leverancier, LeveringsDag leveringsDag) {
        Leverancier = leverancier;
        LeverancierId = Leverancier.LeverancierId;
        LeveringsDag = leveringsDag;
        LeveringsDagId = LeveringsDag.LeveringsDagId;
    }
}
