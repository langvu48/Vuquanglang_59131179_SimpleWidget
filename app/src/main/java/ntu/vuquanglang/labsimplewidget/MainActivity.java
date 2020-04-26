package ntu.vuquanglang.labsimplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.NotActiveException;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtngaysinh, edtSothich;
    RadioGroup radioGioitinh;
    RadioButton rdbNam, rdbNu;
    CheckBox Film, music, cafe, home, cook;
    Button btnXacnhan;
    String Khongcocaigihet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }

    private void addView() {
        edtName = findViewById(R.id.edtName);
        edtngaysinh = findViewById(R.id.edtNgaysinh);
        edtSothich = findViewById(R.id.edtSothich);
        radioGioitinh = findViewById(R.id.RadioGioitinh);
        Film = findViewById(R.id.fiml);
        music = findViewById(R.id.music);
        cafe = findViewById(R.id.cafe);
        home = findViewById(R.id.home);
        cook = findViewById(R.id.cook);
        btnXacnhan = findViewById(R.id.btnXacnhan);

    }

    private void addEvent() {
        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KQ();

            }
        });
    }

    private void KQ() {
        Khongcocaigihet = edtName.getText().toString() + "\n" +
                "Ngày sinh : " + edtngaysinh.getText().toString() +
                "\n" + "Giới tính : ";
        if (radioGioitinh.getCheckedRadioButtonId() == R.id.rdbNam)
            Khongcocaigihet += "Nam" + "\n" + "Sở thích: ";
        else
            Khongcocaigihet += "Nữ" + "\n" + "Sở Thích: ";

        if (Film.isChecked())
            Khongcocaigihet += "xem phim , ";
        if (music.isChecked())
            Khongcocaigihet += "nghe nhạc , ";
        if (cafe.isChecked())
            Khongcocaigihet += "Đi cà phê với bạn , ";
        if (home.isChecked())
            Khongcocaigihet += "ở nhà một mình , ";
        if (cook.isChecked())
            Khongcocaigihet += "vào bếp nấu ăn , ";

        Khongcocaigihet += edtSothich.getText().toString();
        Toast.makeText(getApplicationContext(), Khongcocaigihet , Toast.LENGTH_LONG).show();

    }
   }

