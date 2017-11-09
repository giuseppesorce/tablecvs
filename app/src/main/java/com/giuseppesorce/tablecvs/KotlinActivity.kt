package com.giuseppesorce.tablecvs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.cleveroad.adaptivetablelayout.AdaptiveTableLayout

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val mCsvFileDataSource = CsvFileDataSourceImpl(this, null)


        val tlPipeline = findViewById<AdaptiveTableLayout>(R.id.tlPipeline)
        val mTableAdapter = SampleLinkedTableAdapter(applicationContext,
                mCsvFileDataSource)
        tlPipeline.setAdapter(mTableAdapter)
        tlPipeline.notifyDataSetChanged()
    }
}
