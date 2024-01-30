class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory){

    override val deviceType = "Smart Light"

    //private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

                 var brightnessLevel = 0
                     set(value) {
                         if (value in 0..100) {
                             field = value
                         }
                     }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness leve is $brightnessLevel.")

    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}