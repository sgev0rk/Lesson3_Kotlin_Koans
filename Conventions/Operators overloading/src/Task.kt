import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

class TimeIntervalrep(val timeInterval: TimeInterval, val number: Int)
operator fun TimeInterval.times(number: Int) = TimeIntervalrep(this, number)


// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeIntervals: TimeIntervalrep) = addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
 return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
