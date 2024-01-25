fun main(args: Array<String>) {
    val smartTvDevice = SmartDevice("Android TV", "Entertainment")
    println("Device name is ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}