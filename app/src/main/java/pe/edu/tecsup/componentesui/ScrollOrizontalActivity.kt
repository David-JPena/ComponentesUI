package pe.edu.tecsup.componentesui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ScrollOrizontalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_orizontal)


        val button3 = findViewById<Button>(R.id.boton_4)
        button3.setOnClickListener {
            startActivity(Intent(this, EditTextActivity::class.java))

        }
    }
}