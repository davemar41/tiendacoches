package com.example.tiendacoches

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tiendacoches.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding
val coches= listOf(Coches("hyunday i20 white","1.2 gasolina","7199","https://img-eu-c1.autohero.com/img/f02606ab-6f4e-4de1-9293-d5ae231d0293/768x432-8d296b80-263f-4bf2-b518-b7228f77978c.jpg"),
    Coches("mercedes","2.2 diesel","20000","https://img-eu-c1.autohero.com/img/3256060b-fa85-48a8-83af-0ee06fb1080c/768x432-758e7204-6133-46cf-8d79-8e466b14b7db.jpg"),
    Coches("C4","2.1 diesel","17000","https://img-eu-c1.autohero.com/img/6ce8c5230fac4b4f5ec57ad664e036230dabdff763ae10e4987586e5d7e35544/exterior/1/768x432-95c79139cf2a4a9eb6e9b4e9ffa00040.jpg"),
    Coches("Audi q2","2.4 gasolina","22000","https://img-eu-c1.autohero.com/img/a4564ae2c35c95d7ea7ca47519e2a9bec6b2babcbd7bd46798dde81cd3663741/exterior/1/768x432-0a627083200b40cc9e9ef54b404ed59f.jpg"),
    Coches("hyundai tucson","1.6","20000","https://img-eu-c1.autohero.com/img/307f72301fd1fea7c30d9495bd0cb00a930e2a4ece32ecc5f84ce305b0fd9cb2/exterior/1/768x432-2c704a9a42db4d8cba6d2baf8f320b25.jpg"),
    Coches("seat arona","2.4","18000","https://img-eu-c1.autohero.com/img/7975e9ab3620318c73d689d968408b2ee84ed251de9d57899fcb7080db6a5a94/exterior/1/768x432-41e934e4236440339baec3f6244dc590.jpg"),
    Coches("fiat tipo","1.3 gasolina","10000","https://img-eu-c1.autohero.com/img/f1b11a88ffbcf668d055b2efd7f359a3476f0ca257a6f534f92a39f13779f485/exterior/1/768x432-7b8d3da615444a6480440f886423c70a.jpg"),
    Coches("peugot partner","1.6 diesel hdi","9000","https://img-eu-c1.autohero.com/img/84e75948a504f8770ebb9e981411e1d1908a3e0f192dddfe21680e42e3b183b8/exterior/1/768x432-02e43b59195241629087627631e0fb8e.jpg"),
    Coches("hyundai tucson","1.7 gasolina","17.000","https://img-eu-c1.autohero.com/img/84e75948a504f8770ebb9e981411e1d1908a3e0f192dddfe21680e42e3b183b8/exterior/1/768x432-02e43b59195241629087627631e0fb8e.jpg"),
    Coches("volkswagen polo","1.4 TDI","8599","https://img-eu-c1.autohero.com/img/ddec81d9fffc8587950af7cffae742aa4ac4d36319328b47af0d66f91fc9ded0/exterior/1/768x432-6d5522daee194a4cb598081c71fa4691.jpg"),
    Coches("Audi q3","2.0 sport","24000","https://img-eu-c1.autohero.com/img/b85964b6bee0bab1a040a0b27a12bb14f78ec0711d472cb1ad6f02cadf0f8316/exterior/1/768x432-e238a72b2096413ab7b544c96c749206.jpg"),
    Coches("Audi A5 sportbacks","2.0 TFI","27200","https://img-eu-c1.autohero.com/img/00850fe8c808c68037a1781c4dc7c1fcf57d502b6da2e60db6773d47427c8983/exterior/1/768x432-c5dc8d96bc704ff3be33c47287cfc384.jpg"),
    Coches("Opel corsa 1.2 selective","1.2","7200","https://img-eu-c1.autohero.com/img/4c679d1d04059df09b6e64ddf9d8e9cf22ad6ced878aa6a9bee507fcb45051a8/exterior/1/768x432-daf2ad904e20464186d4209a66d31dbc.jpg"),
    Coches("Audi A4","2.0 TDI","19935","https://img-eu-c1.autohero.com/img/cd06efa692b438b4b2ea52cbf6dfb7d7f58dcfaa21f466cafb75a92a9c6f6001/exterior/1/768x432-c84739b906c64688bff74f8af0e225c9.jpg"),)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    fun init(){
        val adapter =CochesAdapter(coches)
        binding.rv.layoutManager=LinearLayoutManager(this)
        binding.rv.adapter=adapter
    }
}