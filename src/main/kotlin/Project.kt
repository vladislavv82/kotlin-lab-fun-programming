import java.text.SimpleDateFormat
import java.util.Date

@JvmInline
value class Fio (val fio: String) //inline class, может принимать 1 параметр

class Project(var projectName: String, var customerName: Fio, deadline: String) {
    private val deadlineFormat = SimpleDateFormat("dd.MM.yyyy")
    val deadline: Date = deadlineFormat.parse(deadline)

    override fun toString(): String {
        return "\nназвание проекта - $projectName, \n заказчик $customerName,\n дедлайн сдачи проекта=$deadline,\n)"
    }
}
