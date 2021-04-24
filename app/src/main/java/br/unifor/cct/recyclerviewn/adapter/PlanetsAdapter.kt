 package br.unifor.cct.recyclerviewn.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unifor.cct.recyclerviewn.R
import br.unifor.cct.recyclerviewn.model.Planets

class PlanetsAdapter(private val planets: List<Planets>):
    RecyclerView.Adapter<PlanetsAdapter.PlanetsViewHolder>(){

    private var listener: OnPlanetsItemListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false)
        return PlanetsViewHolder(view, listener)
    }

    override fun getItemCount(): Int {
        return planets.size
    }

    override fun onBindViewHolder(holder: PlanetsAdapter.PlanetsViewHolder, position: Int) {
        holder.iName.text = planets[position].name
        holder.iType.text = "Pertece a categoria de "+planets[position].type
        holder.iImage.setImageResource(planets[position].photo)
    }

    fun setOnUserItemListener(listener: OnPlanetsItemListener){
        this.listener = listener
    }

    class PlanetsViewHolder(view: View, listener: OnPlanetsItemListener?) : RecyclerView.ViewHolder(view){
        val iName: TextView = view.findViewById(R.id.user_item_textView_name)
        val iType: TextView = view.findViewById(R.id.user_item_textview_email)
        val iImage: ImageView = view.findViewById(R.id.imageView)

        init {
            view.setOnClickListener{
                listener?.onClick(it, adapterPosition)
            }

            /*
            view.setOnLongClickListener{
                listener?.onLongClick(it, adapterPosition)!!
            }
            */
        }
    }



}