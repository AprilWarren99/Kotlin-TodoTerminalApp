
fun printMenu(){
    print("----------\n" +
        "[1] Print all tasks\n" +
        "[2] Add a Task\n" +
        "[3] Remove a Task\n" +
        "[0] Exit\n")
}
fun printGreeting(){
    println("Welcome to the Task Manager")
    printMenu()
}

fun main() {
    val filePath = "src/main/resources/tasks.csv"
    val csvHandler = CSVHandler(filePath)
    printGreeting()

    while(true) {
        when (readln()) {
            "1" -> println(csvHandler.getTodoItems())
            "2" -> println("Not yet implemented!")
            "3" -> println("Not yet implemented!")
            "0" -> break
            "" -> break
        }
        printMenu()
    }
}