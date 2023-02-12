package com.example.doubletapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.doubletapp.constance.Constance
import com.example.doubletapp.databinding.ActivitySquareBinding

class SquareActivity : AppCompatActivity() {
    lateinit var binding: ActivitySquareBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySquareBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("MyLog", "onCreateSquareAct")

        val counter = intent.getIntExtra(Constance.COUNTER_KEY, 0)
        binding.tvCounter.text = (counter * counter).toString()

        onClickBtnBackToMainAct()
    }

    private fun onClickBtnBackToMainAct() {
        binding.btnToMain.setOnClickListener {
            finish()
        }
    }

    override fun onResume() {
        super.onResume()

        Log.d("MyLog", "onResumeSquareAct")
    }

    override fun onPause() {
        super.onPause()

        Log.d("MyLog", "onPauseSquareAct")
    }

    override fun onStart() {
        super.onStart()

        Log.d("MyLog", "onStartSquareAct")
    }

    override fun onStop() {
        super.onStop()

        Log.d("MyLog", "onStopSquareAct")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("MyLog", "onDestroySquareAct")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("MyLog", "onRestartSquareAct")
    }
}