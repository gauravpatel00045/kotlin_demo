package com.crudkotlin.validator

import android.text.TextUtils
import android.util.Patterns

class Validation {

    companion object {

        fun isValidEmail(email: String): Boolean {
            return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }

        fun isNumber(input: String): Boolean{
            return !TextUtils.isEmpty(input) && TextUtils.isDigitsOnly(input)
        }

        fun isAlphabet(input: String): Boolean{
            return !TextUtils.isEmpty(input)
        }
    }
}