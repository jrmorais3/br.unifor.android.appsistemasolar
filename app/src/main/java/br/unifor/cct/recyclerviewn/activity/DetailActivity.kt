package br.unifor.cct.recyclerviewn.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import br.unifor.cct.recyclerviewn.R
import br.unifor.cct.recyclerviewn.util.PlanetsRepository

class DetailActivity : AppCompatActivity() {

    private lateinit var nName: TextView
    private lateinit var nType: TextView
    private lateinit var nVolume: TextView
    private lateinit var nMassa: TextView
    private lateinit var nDensidade: TextView
    private lateinit var nTemp: TextView
    private lateinit var nImage: ImageView
    private val planets = PlanetsRepository.getAll()

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

       nName = findViewById(R.id.detail_textview_name)
       nType = findViewById(R.id.detail_textview_type)
       nVolume = findViewById(R.id.detail_textview_volume)
       nMassa = findViewById(R.id.detail_textview_massa)
       nDensidade = findViewById(R.id.detail_textview_densidade)
       nTemp = findViewById(R.id.detail_textview_temp)
       nImage = findViewById(R.id.detail_textview_planet)

       val position = intent.getIntExtra("position", -1)


       if (position != -1){
           nName.text = planets[position].name
           nType.text = "Categoria: "+planets[position].type
           nMassa.text = "Massa: "+planets[position].massa
           nVolume.text = "Volume: "+planets[position].volume
           nDensidade.text = "Densidade: "+planets[position].densidade
           nTemp.text = "Temperatura Média: "+planets[position].temp
           this.nImage.setImageResource(planets[position].photo)
       }


    }
}