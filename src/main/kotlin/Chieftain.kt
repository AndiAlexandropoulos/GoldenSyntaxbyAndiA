class Chieftain() :Enemies("Megataurus", 3000.0) {

    /* Der Chieftain kann sich mit

        1. dem 10% Fluch,
        2. dem Beschwören seines kleinen Helfers,
        3. einem Axtschlag,
        4. der Raketenschelle
        5. dem Doppelrammbock oder dem
        6. dem Dampfhammer

        gegen die Helden zur Wehr setzen.
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