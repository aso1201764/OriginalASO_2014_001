package jp.ac.st.asojuku.original2014001;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;


	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){ //どのボタンが押されたか判定
		case R.id.btnOK: //btnが押された
			//エディトテキストから入力内容を取り出す
			EditText evt = (EditText)findViewById(R.id.edtName);
			String inputdaikiti = etv.getText().toString();

			//Randomクラスのインスタンスを作る
			Random rnd = new Random();


		}

	}

}
