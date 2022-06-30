package id.co.edtslib.percentagebarview.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.co.edtslib.percentagebarview.PercentageBarView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val percentageBarView = findViewById<PercentageBarView>(R.id.percentageBarView)
        percentageBarView.setPercentage(0.4f)
    }
}