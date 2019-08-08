/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Algemeen.Openingstijd;
import Leveringen.Leverancier;

/**
 *
 * @author stefa
 */
public class LeverancierOpeningstijd {

    public int LeverancierOpeningsTijdId;

    public int LeverancierId;
    public int OpeningstijdId;

    public Leverancier Leverancier;
    public Openingstijd Openingstijd;

    public LeverancierOpeningstijd() {

    }

    public LeverancierOpeningstijd(Leverancier leverancier, Openingstijd openingstijd) {
        Leverancier = leverancier;
        LeverancierId = Leverancier.LeverancierId;
        Openingstijd = openingstijd;
        OpeningstijdId = Openingstijd.OpeningsTijdId;
    }
}
