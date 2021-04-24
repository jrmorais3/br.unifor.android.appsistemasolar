package br.unifor.cct.recyclerviewn.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unifor.cct.recyclerviewn.R
import br.unifor.cct.recyclerviewn.adapter.OnPlanetsItemListener
import br.unifor.cct.recyclerviewn.adapter.PlanetsAdapter
import br.unifor.cct.recyclerviewn.util.PlanetsRepository

class MainActivity : AppCompatActivity(), OnPlanetsItemListener {
   private lateinit var mList: RecyclerView
    private val users = PlanetsRepository.getAll()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val llm = LinearLayoutManager(this)
        val userAdapter = PlanetsAdapter(users)
        userAdapter.setOnUserItemListener(this)

        mList = findViewById(R.id.main_recycleview_list)

        mList.apply {
            adapter = userAdapter
            layoutManager = llm
            hasFixedSize()
        }
    }

    override fun onClick(view: View, position: Int) {
        //Toast.makeText(view.context,"[$position, ${users[position].name}, ${users[position].type}]", Toast.LENGTH_LONG).show()

        val it = Intent(this, DetailActivity::class.java)
        it.putExtra("position", position)
        startActivity(it)

    }
    /*
    override fun onLongClick(view: View, position: Int): Boolean {
        Toast.makeText(view.context,"O clique longo foi realizado na posicao $position", Toast.LENGTH_LONG).show()
        return true
    }
     */
}