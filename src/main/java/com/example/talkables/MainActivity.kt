import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.talkables.R
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var randomWordTextView: TextView
    private lateinit var generateButton: Button

    private val words = arrayOf("Maçã", "Banana", "Abacaxi", "Morango", "Laranja", "Pera")

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Main", "iniciando onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomWordTextView = findViewById(R.id.text_random_word)
        generateButton = findViewById(R.id.button_generate)

        generateButton.setOnClickListener {
            // Gerar palavra aleatória
            val randomWord = getRandomWord()
            // Exibir palavra aleatória
            randomWordTextView.text = randomWord
        }
        Log.i("Main", "finalizando o onCreate")
    }

    private fun getRandomWord(): String {
        val random = Random()
        val index = random.nextInt(words.size)
        return words[index]
    }
}
