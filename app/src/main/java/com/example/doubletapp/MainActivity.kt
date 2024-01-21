package com.example.doubletapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.doubletapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvCounter.text = counter.toString()

        onClickBtnToSquareAct()
        Log.d("MyLog", "onCreateMainAct")
    }

    private fun onClickBtnToSquareAct() {
        binding.btnToSquare.setOnClickListener {
            val intent = Intent(this, SquareActivity::class.java)
            intent.putExtra(Constance.COUNTER_KEY, counter)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putInt(Constance.COUNTER_KEY, counter)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        counter = savedInstanceState.getInt(Constance.COUNTER_KEY) + 1
    }

    override fun onResume() {
        super.onResume()
        binding.tvCounter.text = counter.toString()
        Log.d("MyLog", "onResumeMainAct")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLog", "onPauseMainAct")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLog", "onStartMainAct")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog", "onStopMainAct")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog", "onDestroyMainAct")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLog", "onRestartMainAct")
    }
}