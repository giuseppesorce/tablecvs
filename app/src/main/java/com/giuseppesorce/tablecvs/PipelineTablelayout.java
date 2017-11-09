package com.giuseppesorce.tablecvs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.cleveroad.adaptivetablelayout.AdaptiveTableLayout;

/**
 * @author Giuseppe Sorce
 */

public class PipelineTablelayout extends FrameLayout{
    public PipelineTablelayout(Context context) {
        super(context);
        init();
    }



    public PipelineTablelayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PipelineTablelayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        View rootView = inflate(getContext(), R.layout.pipeline_table, this);
        CsvFileDataSourceImpl mCsvFileDataSource = new CsvFileDataSourceImpl(this.getContext(), null);
        AdaptiveTableLayout tlPipeline = (AdaptiveTableLayout) rootView.findViewById(R.id.tlPipeline);
        SampleLinkedTableAdapter mTableAdapter = new SampleLinkedTableAdapter(getContext().getApplicationContext(), mCsvFileDataSource);
        tlPipeline.setAdapter(mTableAdapter);

    }
}
