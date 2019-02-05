package cash.andrew.testissue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cash.andrew.test.test

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun funStuff() {
    // test from test lib 1
    test()
}
