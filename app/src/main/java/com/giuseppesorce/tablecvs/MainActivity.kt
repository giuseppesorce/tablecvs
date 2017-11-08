package com.giuseppesorce.tablecvs

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.cleveroad.adaptivetablelayout.AdaptiveTableLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mCsvFileDataSource = CsvFileDataSourceImpl(this, null)
        val tlPipeline   = findViewById<AdaptiveTableLayout>(R.id.tlPipeline)

        var mTableAdapter = SampleLinkedTableAdapter(this, mCsvFileDataSource)
        tlPipeline.setAdapter(mTableAdapter)


        var fragment: TableFragment = TableFragment.createInstance()
       //  showFragment(fragment, "ff", R.id.fmContainer, 0, 0)


    }


    protected fun showFragment(frag: Fragment, tag: String, container: Int, typeanimation: Int, action: Int) {

        val fm = fragmentManager
        val ft = fm.beginTransaction()
        ft.replace(container, frag, tag)
        ft.addToBackStack(null)
        ft.commitAllowingStateLoss()


    }
}
