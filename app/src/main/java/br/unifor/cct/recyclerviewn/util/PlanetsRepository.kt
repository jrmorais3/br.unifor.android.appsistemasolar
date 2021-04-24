package br.unifor.cct.recyclerviewn.util

import br.unifor.cct.recyclerviewn.R
import br.unifor.cct.recyclerviewn.model.Planets

object PlanetsRepository {

    fun getAll(): List<Planets>{
        return listOf(
                Planets("Mercurio", "Planeta", "6,083×10¹⁰ km³","3,3011×10²³ kg","5,427 g/cm³",
                        "166,85 ºC", R.drawable.planeta_mercurio),
                Planets("Venus", "Planeta",  "92,843×10¹⁰ km³","4,8685×10²⁴ kg","5,243 g/cm³",
                        "461 ºC ºC", R.drawable.planeta_venus),
                Planets("Terra", "Planeta", "1,08321×10¹² km³","5,9736×10²⁴ kg","5,515 g/cm³",
                        "14 ºC", R.drawable.planeta_terra),
                Planets("Marte", "Planeta", "1,6318×10¹¹ km³","6,4174×10²³ kg","3,933 g/cm³",
                        "−63 ºC", R.drawable.planeta_marte),
                Planets("Jupiter", "Planeta", "1,43128×10^15 km³","1,8986×10²⁷ kg","1,326 g/cm³",
                        "-108 ºC", R.drawable.planeta_jupiter),
                Planets("Saturno", "Planeta",  "8,2713×10¹⁴ km³","5,6846×10²⁶ kg","0,687 g/cm³",
                        "-139 ºC", R.drawable.planeta_saturno),
                Planets("Urano", "Planeta",  "6,833×10¹³ km³","(8,6810 ± 0,0013)×10²⁵ kg","1,27 g/cm³",
                        "-220 ºC", R.drawable.planeta_urano),
                Planets("Netuno", "Planeta",  "6,254×10¹³ km³","1,0243×10²⁶ kg","1,638 g/cm³",
                        "−223,15 ºC",  R.drawable.planeta_netuno),
                Planets("Ceres", "Planeta Anões",  "9,5×10²⁰ kg","3,3011×10²³ kg","2,08 g/cm³",
                        "-106 ºC", R.drawable.planeta_ceres),
                Planets("Plutao", "Planeta Anões",  "6,39×10⁹ km³","(1,305 ± 0,007)×10²² kg","2,03±0,06 g/cm³",
                        "-229 ºC", R.drawable.planeta_plutao),
                Planets("Haumea", "Planeta Anões",  "N/A","(4,2±0,1)×10²¹ kg","1,885 g/cm³",
                        "-223,2 ºC", R.drawable.planeta_haumea),
                Planets("Makemake", "Planeta Anões",  "1,7×10⁹ km³","N/A","1,4±3,2 g/cm³",
                        "−243 ºC", R.drawable.planeta_makemake),
                Planets("Eris", "Planeta Anões",  "6,59±0,10×10⁹ km³","1,66±0,02×10²² kg","2,52±0,05 g/cm³",
                        "-243 ºC", R.drawable.planeta_eris)

        )
    }


}