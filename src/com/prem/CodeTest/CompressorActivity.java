package com.prem.CodeTest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.L;
import android.widget.TextView;

public class CompressorActivity extends Activity {

  private EditText inputText;
  private Button compressButton;
  private TextView compressedText;


  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.compressor);
    getWidgets();

  }

  private void getWidgets() {
    inputText = (EditText) findViewById(R.id.text_input);
    compressButton = (Button) findViewById(R.id.button_compressor);
    compressedText = (TextView) findViewById(R.id.text_compressed);
  }


}
