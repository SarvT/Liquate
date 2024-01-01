package com.example.liquate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.liquate.databinding.ActivityMainBinding
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val topAppBar = findViewById<MaterialToolbar>(R.id.topAppBar)



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