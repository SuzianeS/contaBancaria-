package com.example.contabancaria

import androidx.fragment.app.Fragment

interface NavigationHost {
    //fun navigateTo(fragment: Fragment, addToBackstack: Boolean)
    fun navigateTo(fragment : Fragment, addToBackstack : Boolean)
}