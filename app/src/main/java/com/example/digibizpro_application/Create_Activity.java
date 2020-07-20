package com.example.digibizpro_application;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class Create_Activity extends AppCompatActivity {
    TextView txtadd_new, txtemail, txtadd_name, txtadd_phno, txtadd_email, txtadd_address, txtadd_work, txtadd_note;
    public static TextView edtname, txtphone_number;
    ViewPager viewPager;
    EditText edtnamestring, edtphonenumber, edtemail, edtadress, edtwork, edtnote, edt_addressname;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;
    Button btnsave;
    ImageView imageback, minusphone, minusemail, imgnote, imgnameminus, imgaddress, imgwork;
    Spinner emailspinner;

    LinearLayout layoutname, layphone, lay_email, layaddress, laywork, laynote;

    String straddnm, strname;
    public static BottomSheetDialog alert;
    String strphno, stremail, straddress, strwork, strnote;

    RecyclerView rv_addname, recyclername_list, recyclerphone_list;
    Adapter_AddName adapter_addName;
    Adapter_NameLIst adapter_namelist;
    Adapter_phone_list adapter_phone_list;
    ArrayList arrayList_name_list, arrayList_phone_list;
    Context mContext;
    ArrayList<AddName> arrayList = new ArrayList<>();
    ImageView img_name_dropdown, img_phone_dropdown;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_act);


        txtadd_new = findViewById(R.id.txtadd_name);
        viewPager = findViewById(R.id.viewPager);
        imageback = findViewById(R.id.imageback);
        imgnote = findViewById(R.id.imgnote);
        imgnameminus = findViewById(R.id.imgnameminus);
        layoutname = findViewById(R.id.layoutname);
        txtadd_name = findViewById(R.id.txtadd_name);
        txtadd_phno = findViewById(R.id.txtadd_phno);
        layphone = findViewById(R.id.layphone);
        lay_email = findViewById(R.id.lay_email);
        txtadd_email = findViewById(R.id.txtadd_email);
        layaddress = findViewById(R.id.layaddress);
        laywork = findViewById(R.id.laywork);
        txtadd_work = findViewById(R.id.txtadd_work);
        laynote = findViewById(R.id.laynote);
        txtadd_note = findViewById(R.id.txtadd_note);
        btnsave = findViewById(R.id.btnsave);
        txtphone_number = findViewById(R.id.txtphone_number);
        txtemail = findViewById(R.id.txtemail);
        minusphone = findViewById(R.id.minusphone);
        minusemail = findViewById(R.id.minusemail);
        edtname = findViewById(R.id.edtname);
        rv_addname = findViewById(R.id.rv_addname);
        recyclerphone_list = findViewById(R.id.recyclerphone_list);
        edtnamestring = findViewById(R.id.edtnamestring);
        edtwork = findViewById(R.id.edtwork);
        edtadress = findViewById(R.id.edtadress);
        edtnote = findViewById(R.id.edtnote);
        edtphonenumber = findViewById(R.id.edtphonenumber);
        edtemail = findViewById(R.id.edtemail);
        img_phone_dropdown = findViewById(R.id.img_phone_dropdown);
        img_phone_dropdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPhonedialog();
            }

            private void showPhonedialog() {
                ViewGroup viewGroup;
                viewGroup = findViewById(android.R.id.content);

                arrayList_phone_list = new ArrayList();
                arrayList_phone_list.add("Name");
                arrayList_phone_list.add("Prefix");
                arrayList_phone_list.add("Mobile No.");
                arrayList_phone_list.add("Work");
                arrayList_phone_list.add("Work Home");
                arrayList_phone_list.add("Prefix");
                arrayList_phone_list.add("Mobile No.");
                arrayList_phone_list.add("Work");
                arrayList_phone_list.add("Work Home");

                final View dialogView = LayoutInflater.from(Create_Activity.this).inflate(R.layout.alert_phone_listdropdown, viewGroup, false);
                alert = new BottomSheetDialog(Create_Activity.this);
                adapter_phone_list = new Adapter_phone_list(arrayList_phone_list, getApplicationContext());
                alert.setContentView(dialogView);
                recyclerphone_list = dialogView.findViewById(R.id.recyclerphone_list);
                recyclerphone_list.setAdapter(adapter_phone_list);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
                recyclerphone_list.setLayoutManager(linearLayoutManager);
                adapter_phone_list.notifyDataSetChanged();
                alert.show();

            }
        });
        img_name_dropdown = findViewById(R.id.img_name_dropdown);
        img_name_dropdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNameDialog();
            }

            private void showNameDialog() {
                {
                    ViewGroup viewGroup = findViewById(android.R.id.content);
                    arrayList_name_list = new ArrayList();
                    arrayList_name_list.add("Name");
                    arrayList_name_list.add("Prefix");
                    arrayList_name_list.add("Mobile No.");
                    arrayList_name_list.add("Work");
                    arrayList_name_list.add("Work Home");
                    arrayList_name_list.add("Prefix");
                    arrayList_name_list.add("Mobile No.");
                    arrayList_name_list.add("Work");
                    arrayList_name_list.add("Work Home");

                    final View dialogView = LayoutInflater.from(Create_Activity.this).inflate(R.layout.alert_name_listdropdown, viewGroup, false);
                    alert = new BottomSheetDialog(Create_Activity.this);
                    adapter_namelist = new Adapter_NameLIst(arrayList_name_list, getApplicationContext());
                    arrayList_name_list = new ArrayList();
                    alert.setContentView(dialogView);
                    recyclername_list = dialogView.findViewById(R.id.recyclername_list);
                    recyclername_list.setAdapter(adapter_namelist);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                    linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
                    recyclername_list.setLayoutManager(linearLayoutManager);
                    adapter_namelist.notifyDataSetChanged();
                    alert.show();
                }
            }
        });

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strphno = edtphonenumber.getText().toString();
                stremail = edtemail.getText().toString();
                straddress = edtadress.getText().toString();
                strwork = edtwork.getText().toString();
                strnote = edtnote.getText().toString();

                Intent intent = new Intent(Create_Activity.this, SaveButtonActivity.class);
                intent.putExtra("Name", strname);
                intent.putExtra("Phone_Number", strphno);
                intent.putExtra("Email", stremail);
                intent.putExtra("Address", straddress);
                intent.putExtra("Work", strwork);
                intent.putExtra("Note", strnote);
                startActivity(intent);
            }
        });
        txtadd_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laynote.setVisibility(View.VISIBLE);
            }
        });

        txtadd_work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laywork.setVisibility(View.VISIBLE);
            }
        });
        imgwork = findViewById(R.id.imgwork);
        imgwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laywork.setVisibility(View.GONE);
            }
        });

        imgaddress = findViewById(R.id.imgaddress);
        imgaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layaddress.setVisibility(View.GONE);
            }
        });

        txtadd_address = findViewById(R.id.txtadd_address);
        txtadd_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layaddress.setVisibility(View.VISIBLE);
            }
        });
        txtadd_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lay_email.setVisibility(View.VISIBLE);
            }
        });
        txtadd_phno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layphone.setVisibility(View.VISIBLE);
            }
        });
        txtadd_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutname.setVisibility(View.VISIBLE);
                ShowAddNameRecycler();
            }

            private void ShowAddNameRecycler() {
                straddnm = edtname.getText().toString();
                strname = edtnamestring.getText().toString();

                Log.e("NAMeeee1111", straddnm);
                Log.e("1111", straddnm);

                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                linearLayoutManager.setOrientation(RecyclerView.VERTICAL);

                adapter_addName = new Adapter_AddName(mContext, arrayList);
                rv_addname.setAdapter(adapter_addName);
                rv_addname.setLayoutManager(linearLayoutManager);
                adapter_addName.notifyDataSetChanged();
                Log.e("NAMeeee", straddnm + " " + strname + " ");
                AddName addName = new AddName(straddnm, strname);

                arrayList.add(addName);
            }
        });

        imageback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Create_Activity.this, Dashboard_1.class);
                startActivity(intent1);
            }
        });

        minusphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layphone.setVisibility(View.GONE);
            }

        });

        imgnote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laynote.setVisibility(View.GONE);
            }
        });

        minusemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lay_email.setVisibility(View.GONE);
            }

        });

        imgnameminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutname.setVisibility(View.GONE);
            }

        });


        emailspinner = findViewById(R.id.email_spinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.email_spinner, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        emailspinner.setAdapter(adapter1);
        emailspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);
                txtemail.setText(selectedItemText);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];
        for (int i = 0; i < dotscount; i++) {
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);
            sliderDotspanel.addView(dots[i], params);
        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < dotscount; i++) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

}



