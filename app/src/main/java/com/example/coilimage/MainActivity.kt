package com.example.coilimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.transform.CircleCropTransformation
import com.example.coilimage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
//              imageView.load("https://a.rgbimg.com/users/a/al/alessandro/600/mq2BRNG.jpg"){
//                crossfade(5000)
//            }
            imageView.load("https://a.rgbimg.com/users/a/al/alessandro/600/mq2BRNG.jpg") {
                crossfade(true)
                placeholder(R.drawable.ic_launcher_foreground)
                transformations(CircleCropTransformation())
            }
//          save.setOnClickListener {
//              var urlX ="https://a.rgbimg.com/users/a/al/alessandro/600/mq2BRNG.jpg"
//                  if (url.text.toString().isNotEmpry()){
//                      urlX=url.text.toString()
//                  }
//              imageView.load(urlx){
//                  crossfade(true)
//                  transformations(CircleCropTransformation())
//              }
//          }
        }
    }
}