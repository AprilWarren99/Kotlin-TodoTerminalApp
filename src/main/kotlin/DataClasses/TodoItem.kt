package org.terminaltodoapp.DataClasses

import org.terminaltodoapp.EnumClasses.TaskPriority
import org.terminaltodoapp.EnumClasses.TaskStatus

data class TodoItem(val id: Int,
                    val task: String,
                    val taskPriority: TaskPriority,
                    val taskStatus: TaskStatus)
