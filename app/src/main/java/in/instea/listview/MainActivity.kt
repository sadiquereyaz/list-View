package `in`.instea.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listVw = findViewById<ListView>(R.id.lVLanguage)

        val languageList = arrayListOf<String>("C", "C++", "Java", "Java Script", "Ruby", "Python")
        languageList.add("Kotlin")

        val listViewAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languageList)

        listVw.adapter = listViewAdapter             //setting adapter to language list

        listVw.setOnItemClickListener { adapterView, view, i, l ->
            val extractText = "Clicked on " + (view as TextView).text.toString()

            Toast.makeText(this, extractText, Toast.LENGTH_SHORT).show()
        }
    }
}