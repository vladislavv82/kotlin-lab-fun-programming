class Programmer(
    firstName: String,
    lastName: String,
    age: Int,
    experience: Int,
    position: String,
    previousJobs: MutableList<Job>,
    val projects: MutableList<Project>,
    val tasks: MutableList<Task>
) : Employee(firstName, lastName, age, experience, position, previousJobs), SoftSkills, HardSkills {

    override fun toString(): String {
        return "Имя ='$firstName', Фамилия='$lastName', возраст=$age, стаж =$experience, должность ='$position', \nпредыдущее место работы=$previousJobs, \nпроекты=$projects,\nзадачи=$tasks)"
    }

    override fun work(): String {
        return "$position $firstName $lastName работает над кодом"
    }

    override fun speakForeignLanguage(language: String) {
        println("Программист $firstName говорит на языке: $language")
    }

    override fun creatingArchitecture(): String {
        return "Программист умеет создавать архитектуру"
    }

    override fun managingEvents(): String {
        return "Программист НЕ умеет организовывать мероприятия"
    }
}