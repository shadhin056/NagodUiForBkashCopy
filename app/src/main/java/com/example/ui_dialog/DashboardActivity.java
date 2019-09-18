package com.example.ui_dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    com.github.loadingview.LoadingView loading_view;
    TextView checkBalance;
    private static int SPLASH_TIME_OUT = 500;
    GridView menuGridView;
    ArrayList<WelcomeMenuModel> list= new ArrayList<>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        checkBalance=findViewById(R.id.checkBalance);
        loading_view=findViewById(R.id.loading_view);
        menuGridView = (GridView) findViewById(R.id.menuGridView) ;

        menuView();
        checkBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loading_view.start();
                checkBalance.setText("Loading");
                new Handler().postDelayed(new Runnable() {

                    /*
                     * Showing splash screen with a timer. This will be useful when you
                     * want to show case your app logo / company
                     */

                    @Override
                    public void run() {
                        loading_view.stop();
                        loading_view.setVisibility(View.GONE);
                        checkBalance.setText("10tk");
                        // This method will be executed once the timer is over
                        // Start your app main activity
                        // close this activity
                        //finish();
                    }
                }, SPLASH_TIME_OUT);


            }
        });
    }

    private void menuView() {
        list.clear();
        list.add(new WelcomeMenuModel("হিসাবের স্থিতি", R.drawable.desco, "ACBAL"));
        list.add(new WelcomeMenuModel("হিসাবের বিবরণ", R.drawable.dpdc, "ACSTMT"));
        list.add(new WelcomeMenuModel("ফান্ড ট্রান্সফার", R.drawable.arrow, "FTHOME"));
        list.add(new WelcomeMenuModel("ফান্ড ট্রান্সফার অনুরোধ", R.drawable.desco, "STINS"));

        UsersAdapter adapter = new UsersAdapter(this, list);
        menuGridView.setAdapter(adapter);

        menuGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pstion, long l) {
                TextView menu_soft_code = (TextView) view.findViewById(R.id.menu_soft_code);
                TextView menu_name = (TextView) view.findViewById(R.id.menu_name);

                if("ACBAL".equals(menu_soft_code.getText().toString())){
                     Intent intent = new Intent(DashboardActivity.this, DashboardActivity.class);
                    startActivity(intent);

                }else if("ACSTMT".equals(menu_soft_code.getText().toString())){
                    Intent intent = new Intent(DashboardActivity.this, DashboardActivity.class);
                    startActivity(intent);
                }else if("FTHOME".equals(menu_soft_code.getText().toString())){
                    Intent intent = new Intent(DashboardActivity.this, DashboardActivity.class);
                    startActivity(intent);
                }else if("STINS".equals(menu_soft_code.getText().toString())){
                    Intent intent = new Intent(DashboardActivity.this, DashboardActivity.class);
                    startActivity(intent);
                }


            }
        });
    }
    public class UsersAdapter extends ArrayAdapter<WelcomeMenuModel> {

        // View lookup cache

        private  class ViewHolder {

            ImageView menu_icon;
            TextView menu_name;
            TextView menu_soft_code ;


        }



        public UsersAdapter(Context context, ArrayList<WelcomeMenuModel> welcomeMenuModels) {

            super(context, R.layout.row_grideview_welcome_agent, welcomeMenuModels);

        }



        @Override

        public View getView(int position, View convertView, ViewGroup parent) {

            // Get the data item for this position

            WelcomeMenuModel model = getItem(position);

            UsersAdapter.ViewHolder viewHolder; // view lookup cache stored in tag

            if (convertView == null) {

                viewHolder = new UsersAdapter.ViewHolder();

                LayoutInflater inflater = LayoutInflater.from(getContext());

                convertView = inflater.inflate(R.layout.row_grideview_welcome_agent, parent, false);

                viewHolder.menu_icon = (ImageView) convertView.findViewById(R.id.menu_icon);
                viewHolder.menu_name = (TextView) convertView.findViewById(R.id.menu_name);
                viewHolder.menu_soft_code = (TextView) convertView.findViewById(R.id.menu_soft_code);


                convertView.setTag(viewHolder);

            } else {

                viewHolder = (UsersAdapter.ViewHolder) convertView.getTag();

            }

            // Populate the data into the template view using the data object

            viewHolder.menu_icon.setImageResource(model.getImageId());


                viewHolder.menu_name.setText(model.getMenuName());


            viewHolder.menu_soft_code.setText(model.getSoftcode());



            return convertView;

        }

    }

}
