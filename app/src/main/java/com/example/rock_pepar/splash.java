package com.example.rock_pepar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        String win;

        AppCompatButton mhagigat=(AppCompatButton) findViewById(R.id.hagigat);
        AppCompatButton mjorat=(AppCompatButton) findViewById(R.id.jorat);
        AppCompatTextView mtexthagigat=(AppCompatTextView) findViewById(R.id.texthagigat);
        AppCompatTextView mtextjorat=(AppCompatTextView) findViewById(R.id.textjorat);
        AppCompatButton mbakcbutton=(AppCompatButton) findViewById(R.id.bakcbutton);
        mhagigat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int bhagigat = (random.nextInt(14));
                switch (bhagigat) {
                    case 0:
                        mtexthagigat.setText("برا دیگران تله انداختی؟");
                        break;
                    case 1:
                        mtexthagigat.setText("یکی از راز های مهم زندگیت رو بگو:");
                        break;
                    case 2:
                        mtexthagigat.setText("یکی از برنامه های اینده ات رو بگو:");
                        break;
                    case 3:
                        mtexthagigat.setText("هیچ کاری نکن تو خوش شانسی. ");
                        break;
                    case 4:
                        mtexthagigat.setText("اگه یک فرصت بهت میدادن که بین فرد مهم زندگیت و 10 میلیون دلار کدوم ر انتخاب میکردی؟");
                        break;
                    case 5:
                        mtexthagigat.setText("یکی از بدترین گند هاتو بگو :)");
                        break;
                    case 6:
                        mtexthagigat.setText("یه ویژگی بد از خودت بگو :");
                        break;
                    case 7:
                        mtexthagigat.setText("تا الان سیگار یا مواد مخدر کشیدی؟");
                        break;
                    case 8:
                        mtexthagigat.setText("اگر هر چی میتونستی بخری چی میخریدی؟");
                        break;
                    case 9:
                        mtexthagigat.setText("به کی حسودی میکنی؟");
                        break;
                    case 10:
                        mtexthagigat.setText("چند بار مزاحمی تلفنی کردی؟");
                        break;
                    case 11:
                        mtexthagigat.setText("کیو قامکی فروختی؟");
                        break;
                    case 12:
                        mtexthagigat.setText("چیز مخفی داری؟");
                        break;
                    case 13:
                        mtexthagigat.setText("تا الن کاری کردی که به گردن دیگران انداخته باشی؟(کی و چرا)");
                        break;
                }
            }
        });

        mjorat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random botrandom = new Random();
                int bjorat = (botrandom.nextInt(14));
                switch (bjorat) {
                    case 0:
                        mtextjorat.setText("پاشو برقص");
                        break;
                    case 1:
                        mtextjorat.setText(":60 تا دراز نشست برو .");
                        break;
                    case 2:
                        mtextjorat.setText("زیر اب سرد برو (خیلی سرد).");
                        break;
                    case 3:
                        mtextjorat.setText("هیچ کاری نکن تو خوش شانسی. ");
                        break;
                    case 4:
                        mtextjorat.setText("برو در خونه همسایه رو بزن فرار کن.");
                        break;
                    case 5:
                        mtextjorat.setText("10 بار بگو من ادم گوهی هستم.");
                        break;
                    case 6:
                        mtextjorat.setText("کلاغ پر برو ");
                        break;
                    case 7:
                        mtextjorat.setText("به یکی چیزی هدیه بده");
                        break;
                    case 8:
                        mtextjorat.setText("به یکه فرد عصبانی چیزی پرتاپ کن.");
                        break;
                    case 9:
                        mtextjorat.setText("10 هزار تومان به طرف مقابل بده");
                        break;
                    case 10:
                        mtextjorat.setText("یه ربع یه پا وایسا دستاتم بالا بیر");
                        break;
                    case 11:
                        mtextjorat.setText("زنگ بزن به یکی و ایستگاه اش رو بگیر ");
                        break;
                    case 12:
                        mtextjorat.setText("کجا ها قایمکی رفتی ؟");
                        break;
                    case 13:
                        mtextjorat.setText("الان که فصل سرماست نیم ساعت بیرون وایسا ");
                        break;
                }
            }
        });

        mbakcbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}