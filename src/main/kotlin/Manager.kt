class Manager(
    firstName: String,
    lastName: String,
    age: Int,
    experience: Int,
    position: String,
    previousJobs: MutableList<Job>,
    var projects: MutableList<Project>,
    var tasks: MutableList<Task>
) :  Employee(firstName, lastName, age, experience, position, previousJobs), SoftSkills, HardSkills{

    override fun toString(): String {
        return "Имя ='$firstName', Фамилия='$lastName', возраст=$age, стаж =$experience, должность ='$position', \nпредыдущее место работы=$previousJobs, \nпроекты=$projects,\nзадачи=$tasks)"
    }

    override fun work(): String {
        return "$position $firstName $lastName в настоящее время управляет проектами и задачами."
    }

    override fun speakForeignLanguage(language: String) {
        println("Менеджер $firstName говорит на языке: $language")
    }

    override fun creatingArchitecture(): String {
        return "Менеджер НЕ умеет создавать архитектуру"
    }

    override fun managingEvents(): String {
        return "Менеджер умеет организовывать мероприятия"
    }
}