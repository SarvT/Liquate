package com.example.liquate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.constraintlayout.helper.widget.Carousel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.liquate.databinding.ActivityMainBinding
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.card.MaterialCardView
import com.google.android.material.carousel.CarouselLayoutManager
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val topAppBar = findViewById<MaterialToolbar>(R.id.topAppBar)
//        val carouselRV = findViewById<RecyclerView>(R.id.carousel_list_rv)
        val HistoryRv = findViewById<RecyclerView>(R.id.history_list_rv)
        val home_card_main = findViewById<MaterialCardView>(R.id.home_card_main)
        val add_btn_edittext = findViewById<ImageButton>(R.id.add_btn)
        val water_intake_edittext = findViewById<TextInputEditText>(R.id.water_intake_text)
//        carouselRV.layoutManager = CarouselLayoutManager()
        val datalist=ArrayList<String>(List(100){"Today at 15 mins ago"})
        val historyRVAdapter = HistoryRVAdapter(datalist)
        HistoryRv.layoutManager = LinearLayoutManager(this)
        HistoryRv.adapter = historyRVAdapter



        add_btn_edittext.setOnClickListener {
            Toast.makeText(this, "You added ${water_intake_edittext.text} liters of water.", Toast.LENGTH_SHORT).show()
        }



        home_card_main.setOnLongClickListener {
            home_card_main.setChecked(!home_card_main.isChecked)
            true
        }


        topAppBar.setNavigationOnClickListener {
            binding.drawerLayout.open()
        }

        binding.navView.setNavigationItemSelectedListener {
//            it.isChecked = true
            when(it.itemId){
                R.id.favourites_item->{
                    true
                    Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
                }
            }
            binding.drawerLayout.close()
            true
        }

        topAppBar.setOnMenuItemClickListener{
            when(it.itemId){
                R.id.home->{

                    true
                }
                else -> false
            }

        }

    }
}