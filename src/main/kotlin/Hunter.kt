class Hunter() :Heroes("Quirin", 500.0){





            /*
            Quirin der jäger ist nun dran,
            entscheide dich, ob du

            1. dem Jagdpfeil,
            2. dem Explosivpfeil,
            3. dem Bogen selbst und
            4. der Dornspritzenpfeil

            deinem Gegner aud die Pelle rückst.



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