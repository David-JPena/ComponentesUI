package pe.edu.tecsup.componentesui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
        val button3 = findViewById<Button>(R.id.registrar)
        button3.setOnClickListener {
            startActivity(Intent(this, EditTextActivity::class.java))

        }
    }
}