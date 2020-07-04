// Posted from EduTools plugin
val calendar = createCalendar()

calendar.selectCurrentDay()
calendar.run { print("$day $month $year") }
