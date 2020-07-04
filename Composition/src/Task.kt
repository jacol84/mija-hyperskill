class OperatingSystem {
    var name: String? = null
}

class DualBoot {
    lateinit var primaryOs: OperatingSystem
    lateinit var secondaryOs: OperatingSystem
}