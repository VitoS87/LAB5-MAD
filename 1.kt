import java.util.Scanner
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    val queens = mutableListOf<Pair<Int, Int>>()

    // Считываем 8 пар координат
    for (i in 1..8) {
        if (scanner.hasNextInt()) {
            val x = scanner.nextInt()
            val y = scanner.nextInt()
            queens.add(Pair(x, y))
        }
    }

    var hasConflict = false

    // Проверяем каждую пару ферзей между собой
    for (i in 0 until queens.size) {
        for (j in i + 1 until queens.size) {
            val q1 = queens[i]
            val q2 = queens[j]

            // Ферзи бьют друг друга, если:
            // 1. На одной горизонтали (q1.first == q2.first)
            // 2. На одной вертикали (q1.second == q2.second)
            // 3. На одной диагонали (разница координат по X равна разнице по Y)
            if (q1.first == q2.first || 
                q1.second == q2.second || 
                abs(q1.first - q2.first) == abs(q1.second - q2.second)) {
                hasConflict = true
                break
            }
        }
        if (hasConflict) break
    }

    if (hasConflict) println("YES") else println("NO")
}
