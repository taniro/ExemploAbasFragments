package tads.eaj.ufrn.exemploabasfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pageAdapter = FixedTabsPageAdapter(supportFragmentManager)

        viewpager.adapter = pageAdapter

        tab.setupWithViewPager(viewpager)
        tab.getTabAt(0)!!.setIcon(android.R.drawable.presence_online)
        tab.getTabAt(1)!!.setIcon(android.R.drawable.star_off)
        tab.getTabAt(2)!!.setIcon(android.R.drawable.btn_star_big_off)

        viewpager.addOnPageChangeListener(object : OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                when (position) {
                    0 -> {
                        tab.getTabAt(0)!!.setIcon(android.R.drawable.presence_online)
                        tab.getTabAt(1)!!.setIcon(android.R.drawable.star_off)
                        tab.getTabAt(2)!!.setIcon(android.R.drawable.btn_star_big_off)
                    }
                    1 -> {
                        tab.getTabAt(0)!!.setIcon(android.R.drawable.presence_offline)
                        tab.getTabAt(1)!!.setIcon(android.R.drawable.star_on)
                        tab.getTabAt(2)!!.setIcon(android.R.drawable.btn_star_big_off)
                    }
                    2 -> {
                        tab.getTabAt(0)!!.setIcon(android.R.drawable.presence_offline)
                        tab.getTabAt(1)!!.setIcon(android.R.drawable.star_off)
                        tab.getTabAt(2)!!.setIcon(android.R.drawable.btn_star_big_on)
                    }
                    else -> return
                }
            }

            override fun onPageSelected(position: Int) {
            }

        })
    }
}