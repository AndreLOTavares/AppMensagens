package com.example.appmensagens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val lista = listOf(
            Mensagem("Pedro", "Tudo bem com você? ", "07:30"),
            Mensagem("Paulo", "Estou bem obrigado e você?", "07:35"),
            Mensagem("Maria","Ontem cheguei atrasada na escola!","11:00"),
            Mensagem("Poliana","O nosso jantar está de pé?", "18:25"),
            Mensagem("Julio","Claro que sim nosso jantar está confirmado","18:40"),
            Mensagem("Célia","Nossa hoje cheguei exausta do trabalho","18:10"),
            Mensagem("Tiago","A música preferida dela é The End de Link Park","14:12"),
            Mensagem("Vanessa","Realmente essa música é um clássico","14:30"),
            Mensagem("Ana","O que você pediu para comprar no supermercado?","20:25"),
            Mensagem("Julia","Macarrão e queijo","20:28")

        )

        rvLista = findViewById(R.id.rv_lista)

        rvLista.adapter = MensagemAdapter(lista)

        rvLista.layoutManager = LinearLayoutManager(this)

        //rvLista.layoutManager

    }
}