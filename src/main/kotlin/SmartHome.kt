class SmartHome(
    val smartTVDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    fun turnOnTv() {
        smartTVDevice.turnOn()
    }

    fun turnOffTv() {
        smartTVDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTVDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTVDevice.nextChannel()
    }

    fun turnOnLight() {
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}