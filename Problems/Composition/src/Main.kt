// write the classes here
data class OperatingSystem(var name: String = "Linux")

data class DualBoot(
        var primaryOs: OperatingSystem = OperatingSystem(),
        var secondaryOs: OperatingSystem = OperatingSystem("Windows")
)
