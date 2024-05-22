package com.rcd.quotes3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.rcd.qoutes3.R

class ThirdActivity : AppCompatActivity() {
    private lateinit var outputImage: ImageView
    private lateinit var outputGif: ImageView

    private val imagelist = listOf(
        R.drawable.quote,
        R.drawable.img_1,
        R.drawable.img_2,
        R.drawable.img_3,
        R.drawable.img_4,
        R.drawable.img_5,
        R.drawable.img_6,
        R.drawable.img_7
    )
    private val gifUrl = "https://example.com/your_gif.gif" // Replace with your actual GIF URL

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        outputImage = findViewById(R.id.outputImage)
        outputGif = findViewById(R.id.outputGif)

        val button: Button = findViewById(R.id.someButton)
        button.setOnClickListener {
            showRandomImageWithGif()
        }

        // Load the GIF once and keep it displayed
        loadGif()
    }

    private fun showRandomImageWithGif() {
        val random = (0 until imagelist.size).random()
        val image = imagelist[random]
        outputImage.setImageResource(image)
    }

    private fun loadGif() {
       outputImage.setImageResource(outputGif)
    }
}

private fun ImageView.setImageResource(outputGif: ImageView) {
    TODO("Not yet implemented")
}
