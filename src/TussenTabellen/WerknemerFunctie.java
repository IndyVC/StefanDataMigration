/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Bedrijven.FunctieVanPersoon;
import Gebruikers.Werknemer;

/**
 *
 * @author stefa
 */
public class WerknemerFunctie {

    public int WerknemerFunctieId;
    public int WerknemerId;
    public int FunctieVanPersoonId;

    public Werknemer Werknemer;
    public FunctieVanPersoon FunctieVanPersoon;

    public WerknemerFunctie() {

    }

    public WerknemerFunctie(Werknemer werknemer, FunctieVanPersoon functieVanPersoon) {
        this.Werknemer = werknemer;
        this.WerknemerId = werknemer.WerknemerId;
        this.FunctieVanPersoon = functieVanPersoon;
        this.FunctieVanPersoon.FunctieVanPersoonId = functieVanPersoon.FunctieVanPersoonId;
    }

}
