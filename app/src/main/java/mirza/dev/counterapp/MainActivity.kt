package mirza.dev.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: declare variable
        var counter = 0

        // TODO: TextView
        val countTextView = findViewById<TextView>(R.id.countTextView)

        // TODO: Button
        val clickMeButton = findViewById<Button>(R.id.clickMeButton)
        clickMeButton.setOnClickListener {
            "Count: ${counter++}".also { countTextView.text = it }

            // TODO: Toast Message
            Toast.makeText(this, "Number is increasing", Toast.LENGTH_LONG).show()
        }
    }
}