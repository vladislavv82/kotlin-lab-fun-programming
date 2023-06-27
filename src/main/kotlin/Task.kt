import java.text.SimpleDateFormat
import java.util.Date

class Task(var taskName: String,
           var deadline: Date,
           var subtasks: HashMap<String, Int> = hashMapOf()
) {
        override fun toString(): String {
            val sdf = SimpleDateFormat("dd.MM.yyyy")
            val deadlineString = sdf.format(deadline)

            val sb = StringBuilder()
            sb.append("Название задачи: $taskName\n")
            sb.append("Дедлайн: $deadlineString\n")
            sb.append("Подзадачи проекта:\n")

            for ((subtask, days) in subtasks) {
                sb.append("$subtask - $days дней до дедлайна\n")
            }

            return sb.toString()
        }

}
