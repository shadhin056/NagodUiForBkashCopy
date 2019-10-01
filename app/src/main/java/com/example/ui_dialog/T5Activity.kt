package com.example.ui_dialog

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import java.util.ArrayList
import android.opengl.ETC1.getHeight
import android.view.ViewTreeObserver
import android.support.v4.app.SupportActivity
import android.support.v4.app.SupportActivity.ExtraData
import android.support.v4.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class T5Activity : AppCompatActivity() {

    internal lateinit var gvMenu: GridView
    internal var list = ArrayList<MenuModel>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t5)
        supportActionBar?.hide();

        initID()
        menuView()
    }

    private fun initID() {
        Log.e("XXX","inside id")
        gvMenu = findViewById(R.id.gvMenu) as GridView



    }


    private fun menuView() {
        Log.e("XXX","inside menu")
        list.clear()
        list.add(MenuModel("ONGOING EVENT", R.drawable.events, "CHARITY"))
        list.add(MenuModel("DONATE BDT", R.drawable.doantion_cion_5, "DONET"))
        list.add(MenuModel("SHCOLARSHIP", R.drawable.sholarship_icon1, "SCHOLARSHIPS"))

        val adapter = MenuAdapter(this, list)
        gvMenu?.setAdapter(adapter)

        gvMenu?.setOnItemClickListener(AdapterView.OnItemClickListener { adapterView, view, pstion, l ->
            val menu_soft_code = view.findViewById(R.id.menu_soft_code) as TextView
            val menu_name = view.findViewById(R.id.menu_name) as TextView

            if ("CHARITY" == menu_soft_code.text.toString()) {


            } else if ("DONET" == menu_soft_code.text.toString()) {

            }else if ("SCHOLARSHIPS" == menu_soft_code.text.toString()) {

            }
        })
    }

    inner class MenuAdapter(context: Activity, menuModel: ArrayList<MenuModel>) :
            ArrayAdapter<MenuModel>(context, R.layout.row_grideview_menu, menuModel) {

        // View lookup cache

        private inner class ViewHolder {

            internal var menu_icon: ImageView? = null
            internal var menu_name: TextView? = null
            internal var menu_soft_code: TextView? = null


        }


        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var convertView = convertView

            // Get the data item for this position

            val model = getItem(position)

            val viewHolder: ViewHolder // view lookup cache stored in tag

            if (convertView == null) {

                viewHolder = ViewHolder()

                val inflater = LayoutInflater.from(context)

                convertView = inflater.inflate(R.layout.row_grideview_menu, parent, false)

                viewHolder.menu_icon = convertView!!.findViewById(R.id.menu_icon) as ImageView
                viewHolder.menu_name = convertView.findViewById(R.id.menu_name) as TextView
                viewHolder.menu_soft_code = convertView.findViewById(R.id.menu_soft_code) as TextView


                convertView.tag = viewHolder

            } else {

                viewHolder = convertView.tag as ViewHolder

            }

            // Populate the data into the template view using the data object

            viewHolder.menu_icon!!.setImageResource(model!!.imageId)


            viewHolder.menu_name!!.text = model.menuName


            viewHolder.menu_soft_code!!.text = model.softcode



            return convertView

        }

    }
}
