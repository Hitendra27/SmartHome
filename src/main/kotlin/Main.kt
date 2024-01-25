fun main(args: Array<String>) {
    val smartTvDevice = SmartDevice()
    println("Device name is ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}