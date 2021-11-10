package com.mindorks.bootcamp.learndagger.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.R
import com.mindorks.bootcamp.learndagger.di.components.DaggerFragmentComponent
import com.mindorks.bootcamp.learndagger.di.modules.FragmentModule
import javax.inject.Inject


class HomeFragment : Fragment() {

    @Inject
    lateinit var homeViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {

        val TAG = HomeFragment::class.java.name

        @JvmStatic
        fun newInstance() = HomeFragment()
    }

    fun getDependencies() {
        DaggerFragmentComponent
            .builder()
            .fragmentModule(FragmentModule(this))
            .applicationComponent((requireActivity().application as MyApplication).applicationComponent)
            .build()
            .inject(this)
    }
}