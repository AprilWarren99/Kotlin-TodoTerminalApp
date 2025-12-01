import org.jetbrains.kotlinx.dataframe.DataFrame
import org.jetbrains.kotlinx.dataframe.api.rows
import org.jetbrains.kotlinx.dataframe.io.readCsv
import DataClasses.TodoItem
import EnumClasses.TaskPriority
import EnumClasses.TaskStatus

//It would be nice if this also took a file structure type for handling other csv formats
class CSVHandler (val filePath: String){
    var fileData: DataFrame<*>? = null

    init {
        readInFile()
    }

    fun readInFile(): DataFrame<*>?{
        try {
        fileData = DataFrame.readCsv(filePath)
        } catch (e: Exception){
            print("Got an error reading data: \n$e")
            return null
        }
        return fileData
    }

    fun getTodoItems(): Set<TodoItem> {
        var todoItems: MutableSet<TodoItem> = mutableSetOf()

        fileData?.rows()?.forEach {
            todoItems.add(
                TodoItem(
                    id = Integer.parseInt(it[0].toString()),
                    task = it[1].toString(),
                    taskPriority = TaskPriority.valueOf(it[2].toString()),
                    taskStatus = TaskStatus.valueOf(it[3].toString())
                )
            )
        }
        return todoItems
    }
}