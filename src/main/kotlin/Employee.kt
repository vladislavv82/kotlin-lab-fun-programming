abstract class Employee(
    var firstName: String,
    var lastName: String,
    var age: Int,
    var experience: Int,
    var position: String,
    var previousJobs: MutableList<Job>
) {
    abstract fun work(): String
    override fun toString(): String {
        return "Работник( Имя='$firstName', Фамилия='$lastName', Возраст=$age, Стаж =$experience, Должность ='$position', Прошлое место работы=$previousJobs)"
    }
}