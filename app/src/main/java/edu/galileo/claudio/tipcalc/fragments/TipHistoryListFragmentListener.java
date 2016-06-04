package edu.galileo.claudio.tipcalc.fragments;

import edu.galileo.claudio.tipcalc.models.TipRecord;

/**
 * Created by claudio on 31-05-16.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clear();
}
