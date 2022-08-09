class ChieftainsLittleHelper() :Enemies("Minitaurus", 1250.0) {


    /* Der Minitaurus ist beschwört worden!
         Er kann mit
         1. der Komakeule
         2. der Tornadofaust
         3. dem Wadenbeisser oder der
         4. Kampfkeule

         angreifen.
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