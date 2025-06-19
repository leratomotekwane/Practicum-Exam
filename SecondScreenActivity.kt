package com.soundcity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class SecondScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        val tvNowPlayingTitle = findViewById<TextView>(R.id.tvNowPlayingTitle)
        val tvNowPlayingArtist = findViewById<TextView>(R.id.tvNowPlayingArtist)
        val tvNowPlayingRating = findViewById<TextView>(R.id.tvNowPlayingRating)
        val tvNowPlayingComment = findViewById<TextView>(R.id.tvNowPlayingComment)
        val tvMusicFact = findViewById<TextView>(R.id.tvMusicFact)
        val btnBackToMain = findViewById<Button>(R.id.btnBackToMain)

        // Retrieve song data from the intent
        val songTitles = intent.getStringArrayExtra("songTitles") ?: arrayOf()
        val artistNames = intent.getStringArrayExtra("artistNames") ?: arrayOf()
        val songRatings = intent.getIntArrayExtra("songRatings") ?: intArrayOf()
        val songComments = intent.getStringArrayExtra("songComments") ?: arrayOf()

        // Music facts to display
        val musicFacts = arrayOf(
            "The longest song ever released is 'The Rise and Fall of Bossanova' by PC III, lasting 13 hours, 23 minutes, and 32 seconds.",
            "The first music video ever aired on MTV was 'Video Killed the Radio Star' by The Buggles.",
            "A group of flamingos is called a 'flamboyance'.",
            "The world's smallest playable violin is 4.1 cm long.",
            "Music can help plants grow faster by stimulating their growth hormones."
        )

        if (songTitles.isNotEmpty()) {
            // Pick a random song from the saved list
            val randomIndex = Random.nextInt(songTitles.size)
            tvNowPlayingTitle.text = "Now Playing: ${songTitles[randomIndex]}"
            tvNowPlayingArtist.text = "Artist: ${artistNames[randomIndex]}"
            tvNowPlayingRating.text = "Rating: ${songRatings[randomIndex]}/5"
            tvNowPlayingComment.text = "Comments: ${songComments[randomIndex]}"
        } else {
            tvNowPlayingTitle.text = "No songs added yet!"
            tvNowPlayingArtist.text = ""
            tvNowPlayingRating.text = ""
            tvNowPlayingComment.text = ""
        }

        // Display a random music fact
        tvMusicFact.text = "Fun Music Fact: ${musicFacts[Random.nextInt(musicFacts.size)]}"

        btnBackToMain.setOnClickListener {
            finish() // Go back to the previous activity (MainActivity)
        }
    }
}a
