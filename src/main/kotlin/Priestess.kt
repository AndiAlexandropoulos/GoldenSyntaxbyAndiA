class Priestess() :Heroes("Fabiola", 550.0){


   /* Zu guter letzt in diesem Kampf ist
        Fabiola am Zug, entscheide dich ob sie
        1. mit der Schockwelle angreift,
        2. den Würgegriff oder
        3. dem inneren Feuer dem gegner einheizt.
        Außerdem kann sie
        4. einen Helden deiner Wahl um 250 Gesundheitspunkte heilen
    */

    // Ausweichchance 10 %

    override fun dodge():Boolean {
        var dodge = false
        if((0..99).random() < 10)
            dodge = true
        return dodge
    }
// Blockt Schaden 50 %

    override fun block():Double {
        return 0.5
    }
}