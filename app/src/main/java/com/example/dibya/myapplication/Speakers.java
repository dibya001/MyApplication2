package com.example.dibya.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Speakers extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speakers);

        tv= (TextView) findViewById(R.id.txt);
        tv.setText(Html.fromHtml("\n" +
                "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<h3>\n" +
                "\tDr. Debadutta Mohanty <Pic11>\n" +
                "\n" +
                "</h3>\n" +
                "<p>\n" +
                "\tDr. Debadutta Mohanty is a Senior Scientist at the CSIR-Central Institute of Mining and Fuel Research. He holds a PhD degree in Geology from IIT Roorkee. He has more than thirty publications in peer-reviewed journals and conference proceedings. He has also held visiting positions at the Southern Illinois University at Carbondale, Ergo Exergy Inc and The University of Queensland. He is a fellow of the Geological Society of India. As part of a SERB funded project, he designed and developed indigenously a unique high pressure adsorption isotherm experimental setup at CSIR-CIMFR for research on unconventional gas reservoir systems and CO2- sequestration under replicated in situ conditions.\n" +
                "\n" +
                "</p>\n" +
                "</html>\n" +
                "\n" +
                "\t\n"));
    }
}
