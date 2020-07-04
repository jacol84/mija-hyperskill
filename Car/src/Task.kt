class Car(val make: String, val year: Int) {

    var speed: Int = 0

    fun accelerate() {
        speed = speed.plus(5)
    }

    fun decelerate() {
        speed = speed.minus(5)
        speed = if (speed < 0) 0 else speed
    }
}