package com.example.tugasandroiddesychu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BelajarRecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_recycler_view)

        val kpopidolList = listOf<kpopidol>(
            kpopidol(
                R.drawable.kimnamjoon,
                namekpopidol= "Kim namjoon",
                descriptionkpopidol =  "Kim Nam-joon  known professionally as RM (formerly Rap Monster), is a South Korean rapper, songwriter, and record producer. He is the leader of South Korean boy band BTS."
            ),
            kpopidol(
                R.drawable.jin,
                namekpopidol = "Kim Seok Jin",
                descriptionkpopidol =  "Kim Seok-jin  is a South Korean singer, songwriter, and member of the South Korean boy band BTS. Kim has co-written and released three solo tracks with BTS."
            ),
            kpopidol(
                R.drawable.kimtaehyung,
                namekpopidol= "Kim Taehyung",
                descriptionkpopidol =  "KKim Tae-hyung  also known professionally as V, is a South Korean singer, songwriter, and member of the boy band BTS."
            ),
            kpopidol(
                R.drawable.jimin,
                namekpopidol= "Park Ji Min",
                descriptionkpopidol =  "Park Ji-min  known mononymously as Jimin, is a South Korean singer and dancer. In 2013, he made his debut as a member of the South Korean boy band BTS, under the record label Big Hit Entertainment."
            ),
            kpopidol(
                R.drawable.suga,
                namekpopidol= "Min Yoon Gi",
                descriptionkpopidol =  "Min Yoon-gi known professionally by his stage names Suga (stylized in all caps) and Agust D,[A] is a South Korean rapper, songwriter and record producer. Under Big Hit Music, he debuted as a member of the South Korean boy band BTS in 2013. "
            ),
            kpopidol(
                R.drawable.jhope,
                namekpopidol= "Jung Ho Seok",
                descriptionkpopidol =  "rJung Ho-seok  better known by his stage name J-Hope (stylized as j-hope), is a South Korean rapper, singer-songwriter, dancer, and record producer. He made his debut as a member of South Korean boy band BTS."
            ),
            kpopidol(
                R.drawable.jungkook,
                namekpopidol= "Jeon Jung Kook",
                descriptionkpopidol =  "Jeon Jung-kook known mononymously as Jungkook (stylized as Jung Kook), is a South Korean singer. He is a member and vocalist of the South Korean boy band BTS."
            )
        )
        val recyclerView= findViewById<RecyclerView>(R.id.rv_idol)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KpopIdolAdapter(this, kpopidolList) {
        }

    }
}