package id.ac.polbeng.sucizulianaf.rumusluaslingkaran

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.sucizulianaf.rumusluaslingkaran.databinding.ActivityMainBinding
import kotlin.math.PI

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol untuk menghitung luas lingkaran
        binding.buttonLuas.setOnClickListener {
            val radius = binding.editText.text.toString().toDoubleOrNull()

            if (radius != null) {
                // Hitung luas lingkaran
                val luasLingkaran = PI * radius * radius

                // Kirim hasil luas ke SecondActivity
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra("luas_lingkaran", luasLingkaran)
                intent.putExtra("is_luas", true) // Menandakan bahwa ini adalah hasil luas
                startActivity(intent)
            } else {
                binding.editText.error = "Masukkan angka yang valid"
            }
        }

        // Tombol untuk menghitung volume bola
        binding.buttonVolume.setOnClickListener {
            val radius = binding.editText.text.toString().toDoubleOrNull()

            if (radius != null) {
                // Hitung volume bola
                val volumeBola = (4.0 / 3.0) * PI * radius * radius * radius

                // Kirim hasil volume ke SecondActivity
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra("volume_bola", volumeBola)
                intent.putExtra("is_luas", false) // Menandakan bahwa ini adalah hasil volume
                startActivity(intent)
            } else {
                binding.editText.error = "Masukkan angka yang valid"
            }
        }
    }
}
