package kz.step.cw_lesson3

public class SortedStudent{

    var listNames: ArrayList<Student> = arrayListOf(Student("Башков", "Данил"),
            Student("Дудник", "Дмитрий"),
            Student("Воробьев", "Юра"),
            Student("Акиласов", "Арлан"),
            Student("Ильчук", "Григорий"),
            Student("Махамбетов", "Асхат"),
            Student("Лущенко", "Алексей"),
            Student("Смаглюк", "Владислав"),
            Student("Симчук", "Артем"),
            Student("Сенников", "Александр"),
            Student("Соловьев", "Данил"),
            Student("Фищук", "Даниил"),
            Student("Шефер", "Арон"),
            Student("Майданов", "Асар"),
            Student("Рамазанов", "Диас")
    )

    fun sortRandom(): ArrayList<Student>{
        listNames.shuffle()
        return listNames
    }

    fun sortByName(): ArrayList<Student>
    {
        listNames.sortBy { it.name }
        return listNames
    }

    fun InfoStudents(): String {
        var info: String = ""
        for(l in listNames)
        {
            info += l.name + "  " + l.surname + "\n"
        }
        return info
    }



}