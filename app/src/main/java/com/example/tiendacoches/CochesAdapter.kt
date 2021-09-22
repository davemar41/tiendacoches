package com.example.tiendacoches

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.tiendacoches.databinding.CochesItemBinding
import com.squareup.picasso.Picasso

class CochesAdapter(val coches:List<Coches>):RecyclerView.Adapter<CochesAdapter.Cochesholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CochesAdapter.Cochesholder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return Cochesholder(layoutInflater.inflate(R.layout.coches_item,parent,false))
    }

    override fun onBindViewHolder(holder: CochesAdapter.Cochesholder, position: Int) {
        holder.render(coches[position])
    }



    override fun getItemCount(): Int {
        return  coches.size
    }
    class Cochesholder(val view: View):RecyclerView.ViewHolder(view) {
        val binding=CochesItemBinding.bind(view)
        fun render(coches: Coches){
            binding.modelo.setText(coches.modelos)
            binding.motor.setText(coches.motor)
            binding.precio.setText(coches.precio)
            Picasso.get().load(coches.imagen).into(binding.photoche)
            view.setOnClickListener {
                val intent= Intent(view.context,Calculo::class.java)

                val bundle= Bundle()
                bundle.putString("modelo",coches.modelos)
                bundle.putString("motor",coches.motor)
                bundle.putString("precio",coches.precio)
                bundle.putString("imagen",coches.imagen)
                intent.putExtras(bundle)
                startActivity(view.context,intent,bundle)


            }

        }

    }
}