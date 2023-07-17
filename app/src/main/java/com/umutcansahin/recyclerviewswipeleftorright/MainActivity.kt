package com.umutcansahin.recyclerviewswipeleftorright

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.umutcansahin.recyclerviewswipeleftorright.R
import com.umutcansahin.recyclerviewswipeleftorright.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var userAdapter: UserAdapter
    private val list = AllData.getAllData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userAdapter = UserAdapter(list)
        binding.recyclerview.adapter = userAdapter

        val swipeGesture = object : SwipeGesture(this) {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                when (direction) {
                    ItemTouchHelper.LEFT -> {
                        Toast.makeText(this@MainActivity, "DELETED", Toast.LENGTH_SHORT).show()
                    }

                    ItemTouchHelper.RIGHT -> {
                        Toast.makeText(this@MainActivity, "ADDED", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
        val touchHelper = ItemTouchHelper(swipeGesture)
        touchHelper.attachToRecyclerView(binding.recyclerview)
    }
}