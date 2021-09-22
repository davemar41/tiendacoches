package com.example.tiendacoches

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tiendacoches.databinding.ActivityCalculoBinding
import com.squareup.picasso.Picasso

class Calculo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityCalculoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var total1=0.0
        var bundle=intent.extras
        var modelo=bundle?.getString("modelo")
        var motor=bundle?.getString("motor")
        var precio=bundle?.getString("precio")
        var imagen=bundle?.getString("imagen")
        Picasso.get().load(imagen).into(binding.photo)
        binding.textView.setText(modelo+motor)
        binding.textView2.setText(precio)
        binding.volver.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.total.setOnClickListener {


            val mitotal=total(precio.toString(),total1).toString()
            val micuota=descuento(mitotal).toString()
            binding.textView3.setText(mitotal.toString()+" "+ "iva incluido y aplicado el descuento del 10%" +'\n'+" mi cuota finaciada en tres meses es " + micuota)

        }


    }
    fun total(precio:String,total1:Double):Double{
        var iva=precio.toDouble()*1.21
        var descuento=precio.toDouble()*10/100

         var total1=iva-descuento
        Log.d("TAG","resultado"+ total1.toString())
        var total2=total1

        return total2

    }
    fun descuento(mitotal:String):Double{
        val cuota=mitotal.toDouble()/36
        return  cuota
    }

}