open class SmartDevice protected constructor(val name: String, val category: String) {

     var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "ofline"
            1 -> "online"
            else -> "unkown"
        }
    }
    open fun turnOn() {
        deviceStatus = "On"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }

    open fun printDevice() {
        print("Device name: $name, category: $category, type: $deviceType")
    }
}