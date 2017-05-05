package com.huy6616.bai4_listenerinvariable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends Activity {
private Button btnFar,btnCel,btnClear;
private EditText txtFar,txtCel;
private OnClickListener myVarListener=new OnClickListener() {
@Override
public void onClick(View arg0) {
//Lấy F và C từ control ở đây
	EditText txtdc = (EditText)findViewById(R.id.txtC);
	int c = Integer.parseInt(txtdc.getText().toString());
	
	EditText txtdf = (EditText)findViewById(R.id.txtF);
	int f = Integer.parseInt(txtdf.getText().toString());
	
	
if(arg0==btnFar)
{
//Bạn xử lý chuyển đổi F–>C theo công thức
	txtdc.setText( ((f-32)*(float)5/9)+"");

}
else if(arg0==btnCel)
{
//Bạn xử lý chuyển đổi C–>F theo công thức
	txtdf.setText( (c*9/5+32)+"");
}
else if(arg0==btnClear)
{
txtFar.setText("");
txtCel.setText("");
txtFar.requestFocus();
}
}
};
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
btnFar = (Button)findViewById(R.id.btnFC);
btnCel = (Button)findViewById(R.id.btnCF);
btnClear = (Button)findViewById(R.id.btnDel);
txtFar = (EditText)findViewById(R.id.txtF);
txtCel = (EditText)findViewById(R.id.txtC);
btnFar.setOnClickListener(myVarListener);
btnCel.setOnClickListener(myVarListener);
btnClear.setOnClickListener(myVarListener);
}
}
