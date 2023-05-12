package pe.edu.tecsup.componentesui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button2 = findViewById<Button>(R.id.boton_1)
        button2.setOnClickListener {
            startActivity(Intent(this, ScrollOrizontalActivity::class.java))
        }

            val button = findViewById<Button>(R.id.radio_botton)
            button.setOnClickListener {
                startActivity(Intent(this, RadioButtontActivity::class.java))
        }
        val button1 = findViewById<Button>(R.id.puntacion)
        button1.setOnClickListener {
            startActivity(Intent(this, RatingBarAtivity::class.java))
        }

        val button4 = findViewById<Button>(R.id.spiner)
        button4.setOnClickListener {
            startActivity(Intent(this, SpinnerActivity::class.java))
        }
        val button5 = findViewById<Button>(R.id.progreso)
        button5.setOnClickListener {
            startActivity(Intent(this, ProgressBarActivity::class.java))
        }

        val button6 = findViewById<Button>(R.id.camara)
        button6.setOnClickListener {
            startActivity(Intent(this, ActionButtonAtivity::class.java))
        }




    }
}