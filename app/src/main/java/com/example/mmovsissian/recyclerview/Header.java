package com.example.mmovsissian.recyclerview;

import android.support.annotation.NonNull;
import android.widget.SectionIndexer;

import com.intrusoft.sectionedrecyclerview.Section;

import java.util.List;




import java.util.Comparator;

import java.util.List;


/**
 * Created by mmovsissian on 19-Jan-18.
 */


public abstract class Header implements Section<Child>{

//    List<Child> childList;
//    String sectionText;
//
//    public Header(List<Child> childList, String sectionText) {
//        this.childList = childList;
//        this.sectionText = sectionText;
//    }
//
//    @Override
//    public List<Child> getChildItems() {
//        return childList;
//    }
//
//      public String getSectionText{
//        return sectionText;
//    }



    List<Child> childList;

    String sectionText;

    int index;



    public Header(List<Child> childList, String sectionText, int index) {

        this.childList = childList;

        this.sectionText = sectionText;

        this.index = index;

    }



    @Override

    public List<Child> getChildItems() {

        return childList;

    }



    public String getSectionText() {

        return sectionText;

    }




}

