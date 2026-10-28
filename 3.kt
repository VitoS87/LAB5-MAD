fun main() {
    // Даны два списка одинаковой длины
    val keysList = listOf("Иван", "Анна", "Сергей", "Ольга")
    val valuesList = listOf(25, 30, 22, 28)

    // Функция zip соединяет элементы списков попарно: (keysList[0], valuesList[0]), ...
    // а toMap() превращает эти пары в ассоциативный массив (Map)
    val resultNameAgeMap: Map<String, Int> = keysList.zip(valuesList).toMap()

    // Выводим получившийся словарь
    println(resultNameAgeMap)
}
