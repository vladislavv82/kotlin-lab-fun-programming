import java.text.SimpleDateFormat

fun main() {
    val sdf = SimpleDateFormat("dd.MM.yyyy")

    val managers = listOf(
        Manager(
            "Иван",
            "Иванов",
            30,
            1,
            "Менеджер",
            mutableListOf(
                Job(
                    "Ростов на Дону",
                    listOf("Выполнять план продаж").toMutableList(),
                    "Менеджер по продажам"
                )
            ),

            mutableListOf(
                Project(
                    "Проект менеджера",
                    Fio("Alex"),
                    "27.06.2023"
                )
            ),

            mutableListOf(
                Task(
                    "Проект менеджера", sdf.parse("26.06.2023"), hashMapOf(
                        "Подзадача 1" to 5,
                        "Подзадача 2" to 3,
                        "Подзадача 3" to 2
                    )
                )
            )
        ), Manager(
            "Василий",
            "Михайлович",
            30,
            2,
            "Менеджер",
            mutableListOf(
                Job(
                    "Ростов на Дону",
                    listOf("Выполнять план продаж").toMutableList(),
                    "Менеджер по продажам"
                )
            ),

            mutableListOf(
                Project(
                    "Проект менеджера",
                    Fio("Alex"),
                    "27.06.2023"
                )
            ),

            mutableListOf(
                Task(
                    "Проект менеджера", sdf.parse("26.06.2023"), hashMapOf(
                        "Подзадача 1" to 5,
                        "Подзадача 2" to 3,
                        "Подзадача 3" to 2
                    )
                )
            )
        ), Manager(
            "Михаил",
            "Петрович",
            30,
            3,
            "Менеджер",
            mutableListOf(
                Job(
                    "Ростов на Дону",
                    listOf("Выполнять план продаж").toMutableList(),
                    "Менеджер по продажам"
                )
            ),

            mutableListOf(
                Project(
                    "Проект менеджера",
                    Fio("Alex"),
                    "27.06.2023"
                )
            ),

            mutableListOf(
                Task(
                    "Проект менеджера", sdf.parse("26.06.2023"), hashMapOf(
                        "Подзадача 1" to 5,
                        "Подзадача 2" to 3,
                        "Подзадача 3" to 2
                    )
                )
            )
        )
    )

    val programmers = listOf(
        Programmer(
            "Влад",
            "Акопян",
            19,
            1,
            "Программист",
            mutableListOf(
                Job(
                    "Ростов на Дону",
                    listOf("написание кода").toMutableList(),
                    "intern developer"
                )
            ),

            mutableListOf(
                Project(
                    "Проект 1",
                    Fio("Sergei Sidenko"),
                    "27.06.2023"
                ),Project(
                    "Проект 2",
                    Fio("Sergei Sidenko"),
                    "27.06.2023"
                ),Project(
                    "Проект 3",
                    Fio("Sergei Sidenko"),
                    "27.06.2023"
                ),Project(
                    "Проект 4",
                    Fio("Sergei Sidenko"),
                    "27.06.2023"
                ),
            ),

            mutableListOf(
                Task(
                    "Лабораторная по Kotlin",
                    sdf.parse("27.06.2023"),
                    hashMapOf(
                        "Лабораторная 4.1" to 1,
                        "Лабораторная 4.2" to 1,
                    )
                )
            )
        ),
        Programmer(
            "Александр",
            "Сергеевич",
            19,
            3,
            "Программист",
            mutableListOf(
                Job(
                    "Ростов на Дону",
                    listOf("написание кода").toMutableList(),
                    "intern developer"
                )
            ),

            mutableListOf(
                Project(
                    "Лабораторная 1",
                    Fio("Sergei Sidenko"),
                    "27.06.2023"
                ),Project(
                    "Лабораторная 2",
                    Fio("Sergei Sidenko"),
                    "27.06.2023"
                ),Project(
                    "Лабораторная 4",
                    Fio("Sergei Sidenko"),
                    "27.06.2023"
                ),Project(
                    "Лабораторная 3",
                    Fio("Sergei Sidenko"),
                    "27.06.2023"
                ),

            ),

            mutableListOf(
                Task(
                    "Лабораторная по Kotlin",
                    sdf.parse("27.06.2023"),
                    hashMapOf(
                        "Лабораторная 1" to 1,
                        "Лабораторная 2" to 1,
                    )
                )
            )
        ),
        Programmer(
            "Анатолий",
            "Косолапкин",
            19,
            4,
            "Программист",
            mutableListOf(
                Job(
                    "Ростов на Дону",
                    listOf("написание кода").toMutableList(),
                    "intern developer"
                )
            ),

            mutableListOf(
                Project(
                    "Лабораторная по Kotlin",
                    Fio("Sergei Sidenko"),
                    "27.06.2023"
                )
            ),

            mutableListOf(
                Task(
                    "Лабораторная по Kotlin",
                    sdf.parse("27.06.2023"),
                    hashMapOf(
                        "Подзадача 5" to 1,
                        "Подзадача 10" to 1,
                    )
                ),Task(
                    "Лабораторная по Kotlin",
                    sdf.parse("27.06.2023"),
                    hashMapOf(
                        "Подзадача 1" to 2,
                        "Подзадача 2" to 3 ,
                    )
                )
            )
        )
    )
//task0
    println("\nСписок менеджеров:")
    managers.forEach { manager -> println(manager.firstName) }

    println("\nСписок программистов:")
    programmers.forEach { programmer -> println(programmer.firstName) }

//task1
    val allEmployees = managers.flatMap { listOf(it) } + programmers.flatMap { listOf(it) }
    val employeesExperience = allEmployees.filter { employee ->
        when (employee) {
            is Manager -> employee.experience < 2
            is Programmer -> employee.experience < 2
            else -> false
        }
    }

    println("Список работников со стажем менее 2 лет:")
    employeesExperience.forEach { employee -> println(employee.firstName) }

//task2
    val managersProject = managers.filter { manager ->
        manager.projects.size < 3
    }

    println("Список менеджеров с количеством проектов менее 3:")
    managersProject.forEach { manager ->
        println("Менеджер: ${manager.firstName}, Количество проектов: ${manager.projects.size}")
    }
//task3
    val allSubtasks = mutableListOf<String>()

    programmers.forEach { programmer ->
        programmer.tasks.forEach { task ->
            allSubtasks.addAll(task.subtasks.keys)
        }
    }

    println("Список всех subtasks программистов:")
    allSubtasks.forEach { subtask -> println(subtask) }

//task 4
    val previousJobsLessThan3Years = mutableListOf<Job>()
    val employees  = managers + programmers

    allEmployees.forEach { employee ->
        if (employee.experience < 3) {
            previousJobsLessThan3Years.addAll(employee.previousJobs)
        }
    }

    println("Список всех предыдущих работ работников со стажем менее 3 лет:")
    previousJobsLessThan3Years.forEach { job ->
        println("Прошлое место работы: ${job.workplace}, должность: ${job.position}, обязанности: ${job.responsibilities}")
    }

}