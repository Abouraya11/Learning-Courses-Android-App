package com.example.leado.ui.coursedescription

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.leado.R
import kotlinx.android.synthetic.main.activity_video_player.*

class VideoPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_player)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.videoplayback))
        videoView.setMediaController(mediaController)
        videoView.start()

        lesson_name_in_video_player.text = intent.getStringExtra("LessonName")
        lesson_num_in_video_player.text = intent.getStringExtra("LessonOrder")
        lesson_time.text = intent.getStringExtra("LessonTime")

        heart_btn.setOnClickListener {
            heart_btn.setImageResource(R.drawable.ic_heart_red)
            brokenHeart_btn.setImageResource((R.drawable.ic_heartbreak_empty))
        }

        brokenHeart_btn.setOnClickListener {
            heart_btn.setImageResource(R.drawable.ic_heart)
            brokenHeart_btn.setImageResource((R.drawable.ic_heartbreak_filled))
        }
    }
}