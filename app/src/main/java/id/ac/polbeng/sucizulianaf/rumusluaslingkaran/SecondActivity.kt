package id.ac.polbeng.sucizulianaf.rumusluaslingkaran

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.sucizulianaf.rumusluaslingkaran.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val isLuas = intent.getBooleanExtra("is_luas", true)

        if (isLuas) {
            // Terima dan tampilkan hasil luas lingkaran
            val luasLingkaran = intent.getDoubleExtra("luas_lingkaran", 0.0)
            binding.textView.text = "Luas Lingkaran: %.2f".format(luasLingkaran)
        } else {
            // Terima dan tampilkan hasil volume bola
            val volumeBola = intent.getDoubleExtra("volume_bola", 0.0)
            binding.textView.text = "Volume Bola: %.2f".format(volumeBola)
        }
    }
}
