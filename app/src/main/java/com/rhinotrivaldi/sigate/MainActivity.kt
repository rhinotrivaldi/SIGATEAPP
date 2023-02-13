package com.rhinotrivaldi.sigate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.rhinotrivaldi.sigate.fragment.AccountFragment
import com.rhinotrivaldi.sigate.fragment.BagFragment
import com.rhinotrivaldi.sigate.fragment.HomeFragment

class MainActivity : AppCompatActivity() {

    val fragmentHome: Fragment = HomeFragment()
    val fragmentAccount: Fragment = AccountFragment()
    val fragmentBag: Fragment = BagFragment()

    val fm:FragmentManager = supportFragmentManager

    var active: Fragment = fragmentHome
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fm.beginTransaction().add(R.id.container, fragmentHome).show(fragmentHome).commit()
        fm.beginTransaction().add(R.id.container, fragmentBag).hide(fragmentBag).commit()
        fm.beginTransaction().add(R.id.container, fragmentAccount).hide(fragmentAccount).commit()

    }
}