package com.soundcity

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Data arrays to store song information for four songs
    val songTitles = Array(4) { "" }
    val artistNames = Array(4) { "" }
    val songRatings = IntArray(4)
    val songComments = Array(4) { "" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etSongTitle1 = findViewById<EditText>(R.id.etSongTitle1)
        val etArtistName1 = findViewById<EditText>(R.id.etArtistName1)
        val etSongRating1 = findViewById<EditText>(R.id.etSongRating1)
        val etSongComment1 = findViewById<EditText>(R.id.etSongComment1)

        val etSongTitle2 = findViewById<EditText>(R.id.etSongTitle2)
        val etArtistName2 = findViewById<EditText>(R.id.etArtistName2)
        val etSongRating2 = findViewById<EditText>(R.id.etSongRating2)
        val etSongComment2 = findViewById<EditText>(R.id.etSongComment2)

        val etSongTitle3 = findViewById<EditText>(R.id.etSongTitle3)
        val etArtistName3 = findViewById<EditText>(R.id.etArtistName3)
        val etSongRating3 = findViewById<EditText>(R.id.etSongRating3)
        val etSongComment3 = findViewById<EditText>(R.id.etSongComment3)

        val etSongTitle4 = findViewById<EditText>(R.id.etSongTitle4)
        val etArtistName4 = findViewById<EditText>(R.id.etArtistName4)
        val etSongRating4 = findViewById<EditText>(R.id.etSongRating4)
        val etSongComment4 = findViewById<EditText>(R.id.etSongComment4)

        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnViewPlaylist = findViewById<Button>(R.id.btnViewPlaylist)
        val btnSecondScreen = findViewById<Button>(R.id.btnSecondScreen)
        val btnExitApp = findViewById<Button>(R.id.btnExitApp)

        btnSave.setOnClickListener {
            // Save data for song 1
            songTitles[0] = etSongTitle1.text.toString()
            artistNames[0] = etArtistName1.text.toString()
            songRatings[0] = etSongRating1.text.toString().toIntOrNull() ?: 0
            songComments[0] = etSongComment1.text.toString()

            // Save data for song 2
            songTitles[1] = etSongTitle2.text.toString()
            artistNames[1] = etArtistName2.text.toString()
            songRatings[1] = etSongRating2.text.toString().toIntOrNull() ?: 0
            songComments[1] = etSongComment2.text.toString()

            // Save data for song 3
            songTitles[2] = etSongTitle3.text.toString()
            artistNames[2] = etArtistName3.text.toString()
            songRatings[2] = etSongRating3.text.toString().toIntOrNull() ?: 0
            songComments[2] = etSongComment3.text.toString()

            // Save data for song 4
            songTitles[3] = etSongTitle4.text.toString()
            artistNames[3] = etArtistName4.text.toString()
            songRatings[3] = etSongRating4.text.toString().toIntOrNull() ?: 0
            songComments[3] = etSongComment4.text.toString()

            Toast.makeText(this, "Song details saved!", Toast.LENGTH_SHORT).show()
        }

        btnClear.setOnClickListener {
            // Clear all input fields and reset arrays
            songTitles.fill("")
            artistNames.fill("")
            songRatings.fill(0)
            songComments.fill("")

            etSongTitle1.text.clear()
            etArtistName1.text.clear()
            etSongRating1.text.clear()
            etSongComment1.text.clear()

            etSongTitle2.text.clear()
            etArtistName2.text.clear()
            etSongRating2.text.clear()
            etSongComment2.text.clear()

            etSongTitle3.text.clear()
            etArtistName3.text.clear()
            etSongRating3.text.clear()
            etSongComment3.text.clear()

            etSongTitle4.text.clear()
            etArtistName4.text.clear()
            etSongRating4.text.clear()
            etSongComment4.text.clear()

            Toast.makeText(this, "Data cleared!", Toast.LENGTH_SHORT).show()
        }

        btnViewPlaylist.setOnClickListener {
            val intent = Intent(this, PlaylistDetailActivity::class.java)
            intent.putExtra("songTitles", songTitles)
            intent.putExtra("artistNames", artistNames)
            intent.putExtra("songRatings", songRatings)
            intent.putExtra("songComments", songComments)
            startActivity(intent)
        }

        btnSecondScreen.setOnClickListener {
            // Navigate to a generic second screen (can be customized later)
            startActivity(Intent(this, SecondScreenActivity::class.java))
        }

        // Inside MainActivity.kt, within onCreate()
// ...
        btnSecondScreen.setOnClickListener {
            val intent = Intent(this, SecondScreenActivity::class.java)
            // Pass all song data to the SecondScreenActivity
            intent.putExtra("songTitles", songTitles)
            intent.putExtra("artistNames", artistNames)
            intent.putExtra("songRatings", songRatings)
            intent.putExtra("songComments", songComments)
            startActivity(intent)
        }
// ...

        btnExitApp.setOnClickListener {
            // Exit the app
            finish()
        }
    }
}
