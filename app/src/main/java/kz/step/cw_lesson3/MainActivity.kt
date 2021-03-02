package kz.step.cw_lesson3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

var textViewNames: TextView? = null
var textViewInfo: TextView? = null
var buttonSortByName: Button? = null
var buttonRandom: Button? = null


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        initializeViews()
        initializeLiseners()
    }

    private fun initializeViews() {
        textViewNames = findViewById(R.id.textview_names)
        textViewInfo = findViewById(R.id.textview_info)
        buttonSortByName = findViewById(R.id.sort_students)
        buttonRandom = findViewById(R.id.button_random_sort)
    }

    private fun initializeLiseners() {
        var listInfoStudents: SortedStudent = SortedStudent()
        textViewInfo?.text = listInfoStudents.InfoStudents()

        buttonSortByName?.setOnClickListener{
            var listNamesOfStudents: SortedStudent = SortedStudent()
            listNamesOfStudents.sortByName()
            var infoStudents: String = listNamesOfStudents.InfoStudents()
            textViewNames?.text = infoStudents
        }

        buttonRandom?.setOnClickListener{
            var listNamesOfStudents: SortedStudent = SortedStudent()
            listNamesOfStudents.sortRandom()
            var infoStudents: String = listNamesOfStudents.InfoStudents()
            textViewNames?.text = infoStudents
        }
    }


}