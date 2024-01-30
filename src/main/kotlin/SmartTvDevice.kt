class SmartTvDevice(deviceNmae: String, deviceCategory: String) :
   SmartDevice(name = deviceNmae, category = deviceCategory) {

    override val deviceType = "Smart TV"

   // private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
   // private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

    var speakerVolume = 2
           set(value) {
               if (value in 0..100) {
                   field = value
               }
           }

    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
            "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}