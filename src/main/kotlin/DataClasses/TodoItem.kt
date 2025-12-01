package DataClasses

import EnumClasses.TaskPriority
import EnumClasses.TaskStatus

data class TodoItem(val id: Int,
                    val task: String,
                    val taskPriority: TaskPriority,
                    val taskStatus: TaskStatus
)