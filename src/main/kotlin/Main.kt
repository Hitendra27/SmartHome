fun main(args: Array<String>) {
    var smartDevice: SmartDevice = SmartTvDevice("Android Tv", "Entertainment")
    smartDevice.turnOn()
    smartDevice.printDevice()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
    smartDevice.printDevice()
}