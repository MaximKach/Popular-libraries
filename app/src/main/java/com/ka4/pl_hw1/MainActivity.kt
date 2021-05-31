package com.ka4.pl_hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import com.ka4.pl_hw1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        val listener1 = View.OnClickListener {
            presenter.incrementCounter1()
        }

        val listener2 = View.OnClickListener {
            presenter.incrementCounter2()
        }

        val listener3 = View.OnClickListener {
            presenter.incrementCounter3()
        }

        vb?.btnCounter1?.setOnClickListener(listener1)
        vb?.btnCounter2?.setOnClickListener(listener2)
        vb?.btnCounter3?.setOnClickListener(listener3)
    }

    override fun setButtonText(index: Int, text: String) {
        when(index){
            0 -> vb?.btnCounter1?.text = text
            1 -> vb?.btnCounter2?.text = text
            2 -> vb?.btnCounter3?.text = text
        }
    }
}