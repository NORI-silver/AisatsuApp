package jp.techacademy.yukinori.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import androidx.appcompat.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")

                /*if ($hour:$minute == between 2:00 to 9:59) {
                    textView.text = "おはよう"
                } else if ($hour:$minute == between 10:00 to 17:59) {
                    textView.text = "こんにちは"
                } else if ($hour:$minute == between 18:00 to 1:59) {
                textView.text = "こんばんわ"
            }*/
            },
            13, 0, true)
        timePickerDialog.show()

    }
}