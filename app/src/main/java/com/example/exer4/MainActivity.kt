/*
* Author: Calibuso, Jericho R.
* Date finished: 3/2/20
* Program description: A simple program with several edit text to implement data binding
* */
package com.example.exer4

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.exer4.databinding.ActivityMainBinding
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    binding.submitButton.setOnClickListener {
      submitForm(it)
    }
  }

  private fun submitForm(view: View) {


    binding.apply {

      // Assigns the input of the user to the summary
      nameText.text = nameEdit.text.toString()
      nicknameText.text = nicknameEdit.text.toString()
      ageText.text = ageEdit.text.toString()
      birthdayText.text = birthdayEdit.text.toString()
      degreeText.text = degreeEdit.text.toString()
      numberText.text = numberEdit.text.toString()
      colorText.text = colorEdit.text.toString()
      dreamText.text = dreamEdit.text.toString()
      crushText.text = crushEdit.text.toString()
      messageText.text = messageEdit.text.toString()
      nameText.text = nameEdit.text.toString()


      // hides the edit text and titles
      titleText.visibility = View.GONE
      subtitleText.visibility = View.GONE
      nameEdit.visibility = View.GONE
      nicknameEdit.visibility = View.GONE
      ageEdit.visibility = View.GONE
      birthdayEdit.visibility = View.GONE
      degreeEdit.visibility = View.GONE
      numberEdit.visibility = View.GONE
      colorEdit.visibility = View.GONE
      dreamEdit.visibility = View.GONE
      crushEdit.visibility = View.GONE
      messageEdit.visibility = View.GONE
      submitButton.visibility = View.GONE

      nameEditBox.visibility = View.GONE
      nicknameEditBox.visibility = View.GONE
      ageEditBox.visibility = View.GONE
      birthdayEditBox.visibility = View.GONE
      degreeEditBox.visibility = View.GONE
      numberEditBox.visibility = View.GONE
      colorEditBox.visibility = View.GONE
      dreamEditBox.visibility = View.GONE
      crushEditBox.visibility = View.GONE
      messageEditBox.visibility = View.GONE

      // shows the summary
      nameLabel.visibility = View.VISIBLE
      nicknameLabel.visibility = View.VISIBLE
      ageLabel.visibility = View.VISIBLE
      birthdayLabel.visibility = View.VISIBLE
      degreeLabel.visibility = View.VISIBLE
      numberLabel.visibility = View.VISIBLE
      colorLabel.visibility = View.VISIBLE
      dreamLabel.visibility = View.VISIBLE
      crushLabel.visibility = View.VISIBLE
      messageLabel.visibility = View.VISIBLE
      exitButton.visibility = View.VISIBLE

      summaryLabel.visibility = View.VISIBLE
      nameText.visibility = View.VISIBLE
      nicknameText.visibility = View.VISIBLE
      ageText.visibility = View.VISIBLE
      birthdayText.visibility = View.VISIBLE
      degreeText.visibility = View.VISIBLE
      numberText.visibility = View.VISIBLE
      colorText.visibility = View.VISIBLE
      dreamText.visibility = View.VISIBLE
      crushText.visibility = View.VISIBLE
      messageText.visibility = View.VISIBLE


    }

    hideKeyboard(view)

    // if exit button is pressed exit the program
    binding.exitButton.setOnClickListener{
      exitProcess(1)
    }
  }

  private fun hideKeyboard(view: View){
    // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
  }
}
