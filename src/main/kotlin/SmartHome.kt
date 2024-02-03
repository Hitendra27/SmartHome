class SmartHome(
    val smartTVDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTVDevice.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTVDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTVDevice.increaseSpeakerVolume()
    }

    fun decreaseTvVolume() {
        smartTVDevice.decreaseSpeakerVoulume()
    }

    fun changeTvChannelToPrevious() {
        smartTVDevice.previousChannel()
    }

    fun changeTvChannelToNext() {
        smartTVDevice.nextChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun decreaseLightBrightness() {
        smartLightDevice.decreaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }

    fun printSmartTvInfo() {
        smartTVDevice.printDevice()
    }

    fun printSmartLightInfo() {
        smartLightDevice.printDevice()
    }
}