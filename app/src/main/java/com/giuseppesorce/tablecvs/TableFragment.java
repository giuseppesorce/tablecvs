package com.giuseppesorce.tablecvs;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cleveroad.adaptivetablelayout.AdaptiveTableLayout;

/**
 * @author Giuseppe Sorce
 */

public class TableFragment extends Fragment {


    public static TableFragment createInstance() {
        TableFragment frag = new TableFragment();
        Bundle init = new Bundle();
        frag.setArguments(init);
        return frag;    }

    public TableFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_table, container, false);

        CsvFileDataSourceImpl mCsvFileDataSource = new CsvFileDataSourceImpl(this.getActivity(), null);
        AdaptiveTableLayout tlPipeline = (AdaptiveTableLayout) view.findViewById(R.id.tlPipeline);
        SampleLinkedTableAdapter mTableAdapter = new SampleLinkedTableAdapter(getActivity().getApplicationContext(), mCsvFileDataSource);
        tlPipeline.setAdapter(mTableAdapter);
        return view;
    }

}