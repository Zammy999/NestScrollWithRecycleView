package com.example.ginoilpino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ginoilpino.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.RecycleView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.RecycleView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.RecycleView3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.RecycleView4.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val list1 = listOf<CardViewModel>(
            CardViewModel("sus" , "https://www.travelandleisure.com/thmb/jpXNsHgcQ6KT25cotEb243MA2lc=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/sakura-temple-pagoda-japan-VISITJP0218-73f37dad55eb4cb5b02ea4ae0eee714d.jpg"),
            CardViewModel("ses" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg"),
            CardViewModel("sas" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg"),
            CardViewModel("jej" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg")
        )
        val list2 = listOf<CardViewModel>(
            CardViewModel("sus" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg"),
            CardViewModel("ses" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg"),
            CardViewModel("sas" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg"),
            CardViewModel("jej" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg")
        )
        val list3 = listOf<CardViewModel>(
            CardViewModel("sus" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg"),
            CardViewModel("ses" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg"),
            CardViewModel("sas" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg"),
            CardViewModel("jej" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg")
        )
        val list4 = listOf<CardViewModel>(
            CardViewModel("sus" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg"),
            CardViewModel("ses" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg"),
            CardViewModel("sas" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg"),
            CardViewModel("jej" , "https://dthezntil550i.cloudfront.net/2c/latest/2c2203021257533060016988584/e2417ceb-258f-4c29-a8d7-b9423378d3fe.jpg")
        )

        binding.RecycleView1.adapter = CardAdapter(list1)
        binding.RecycleView2.adapter = CardAdapter(list2)
        binding.RecycleView3.adapter = CardAdapter(list3)
        binding.RecycleView4.adapter = CardAdapter(list4)
    }
}