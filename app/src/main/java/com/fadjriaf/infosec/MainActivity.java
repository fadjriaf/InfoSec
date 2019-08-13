package com.fadjriaf.infosec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDescript = new ArrayList<>();
    private ArrayList<String> mNameDescription = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://i.ibb.co/QYkGf3Z/acunetix.jpg");
        mNames.add("Acunetix");
        mImageDescript.add("Apa Itu Acunetix ?");
        mNameDescription.add("Acunetix merupakan sebuah Web Vulnerability Scanner (WVS) yang bisa memindai dan menemukan kelemahan dalam sebuah website yang kelemahan tersebut bisa berakibat fatal. Alat ini mampu menjelajahi situs website dan menemukan kerentanan yang berbahaya dari Cross-site Scripting, injeksi SQL dan kerentanan lainnya. Alat ini cepat dan mudah digunakan, salah satunya digunakan untuk memindai website Wordpress dan menemukan lebih dari 1200 kelemahan dalam wordpress." +
                "\n\nAcunetix dilengkapi dengan Login sequence recorder yang memungkinkan seseorang untuk mengakses area password yang di protect oleh sebuah website. Ditanamkan juga teknologi AcuSensor terbaru yang dapat mengurangi tingkat false positive rate.");

        mImageUrls.add("https://i.ibb.co/kmDHGZj/backdoor.png");
        mNames.add("Backdoor");
        mImageDescript.add("Backdoor ? Apakah Pintu Belakang ?");
        mNameDescription.add("Backdoor atau pintu belakang adalah akses masuk ke suatu sistem yang dibuat secara rahasia oleh sang programmer sehingga memungkinkan dia masuk ke sistem tersebut secara ilegal tanpa perlu melalui prosedur yang resmi." +
                "\n\nJadi si programmer akan menyisipkan kode yang berisi perintah khusus agar dia bisa mengakses hak user atau admin dengan mudah namun kode-kode tersebut tidak mengganggu kinerja dari sistem tersebut sehingga tidak terdeteksi.");

        mImageUrls.add("https://i.ibb.co/G0tL6f4/hydra.jpg");
        mNames.add("THC Hydra");
        mImageDescript.add("Apasih THC Hydra Itu ?");
        mNameDescription.add("THC Hydra adalah alat lain untuk cracking password dan kebanyakan Jhon The Ripper dan Hydra digunakan dari tangan ke tangan. THC Hydra juga dikenal sebagai Hydra adalah alat cracking password yang sangat populer untuk hacking Network Login menggunakan serangan Brute Force dan juga serangan kamus di halaman login. " +
                "\n\nDan mendukung berbagai protokol jaringan seperti SSH, Mail (POP3, IMAP, dll.), Database, SMB, VNC, LDAP, SMB, dan keseluruhan protokol lainnya.");

        mImageUrls.add("https://i.ibb.co/pbRWLxr/jtr.png");
        mNames.add("John The Ripper");
        mImageDescript.add("Apa Itu John The Ripper ?");
        mNameDescription.add("Jhon The Ripper adalah alat yang sangat populer untuk cracking password, juga dikenal sebagai JTR dan juga memiliki nama paling keren untuk semua alat. Sebagian besar hanya disebut sebagai ‘Jhon’ itu adalah alat yang paling umum digunakan untuk memecahkan kata sandi dan melakukan serangan kamus. " +
                "\n\nJhon The Ripper mengambil file teks, disebut ‘daftar kata’, yang berisi daftar kata sandi yang umum digunakan atau kata kunci asli yang diretas sebelumnya, dan mengenkripsi kata sandi di daftar kata dengan cara yang sama seperti kata sandi yang sedang dipecahkan. " +
                "\n\nKemudian bandingkan string output dengan string terenkripsi dari kata sandi yang tersedia.");


        mImageUrls.add("https://i.ibb.co/ZLd8yNp/metasploit.jpg");
        mNames.add("Metasploit");
        mImageDescript.add("Pernahkah Kamu Mendengar Metasploit ?");
        mNameDescription.add("Metasploit adalah framework untuk mengembangkan eksploitasi, shellcodes, fuzzing tool, payloads dll. Metasploit ini memiliki koleksi eksploitasi dan alat eksploitasi yang sangat banyak yang digabungkan ke dalam framework ini. Metasploit tersedia untuk semua Sistem Operasi utama di luar sana Windows, OS X, dan Linux dan telah terinstal di Kali Linux. " +
                "\n\nIni adalah alat ofensif dan untuk menyerang infrastruktur Anda sendiri atau perusahaan Anda untuk memeriksa celah keamanan dan memperbaikinya sebelum penyerang sebenarnya bisa masuk.");

        mImageUrls.add("https://i.ibb.co/123pb1c/nmap.png");
        mNames.add("Nmap");
        mImageDescript.add("Apa Itu Nmap ?");
        mNameDescription.add("Nmap digunakan untuk memindai keseluruhan jaringan untuk port terbuka dan untuk jaringan pemetaan dan lebih banyak hal. Hal ini terutama digunakan untuk memindai jaringan dan menemukan PC online dan untuk audit keamanan. Sebagian besar admin jaringan menggunakan Nmap untuk menemukan komputer online, port terbuka dan mengelola layanan yang berjalan. " +
                "\n\nMenggunakan paket IP mentah dengan cara yang kreatif untuk mengetahui host apa yang tersedia di jaringan dan port apa saja yang terbuka dimana layanan (nama aplikasi dan versi) berjalan pada sistem tersebut.");


        mImageUrls.add("https://i.ibb.co/948p8fm/sniff.png");
        mNames.add("Sniffer");
        mImageDescript.add("Apa Itu Sniffer ?");
        mNameDescription.add("Sniffer adalah suatu kegiatan penyerangan yang bertujuan untuk melakukan pencurian data atau penyadapan informasi. Walaupun sebenarnya data yang menjadi sasaran tetap tidak hilang karena hanya disadap saja, namun serangan ini sangat berbahaya. Karena bisa mencuri informasi-informasi penting seperti data password login dan data-data kredensial lainnya." +
                "\n\nAda beberapa program yang digunakan dalam aktifitas Sniffing, seperti pcapture (Unix), sniffit (Unix), tcpdump (Unix), dan WebXRay (Windows). Untuk menghindari serangan Sniffer ini, kita harus mengenkripsi semua data-data penting yang ditransfer melalui jaringan dengan menggunakan SSH (Secure Shell) ataupun VPN (Virtual Private Network). Sistem kerjanya semua data yang ditransfer melalui jaringan akam dienkripsi menggunakan sistem enkripsi 128 bit.");

        mImageUrls.add("https://i.ibb.co/tm7X0Dp/soceng.jpg");
        mNames.add("Social Engineering");
        mImageDescript.add("Apa Sih Social Engineering Itu ?");
        mNameDescription.add("Social Engineering atau kalau di Indonesia lebih dikenal dengan istilah Soceng adalah menyerang sistem melalui celah kelengahan orang atau administratornya. Misalnya kita menghubungi administrator dan berpura-pura sebagai orang yang memiliki akses terhadap suatu sistem. Disini kita bahkan bisa langsung meminta username dan password akses dengan seribu satu alasan, misalnya akun email untuk login ternyata dihack orang, dan sejenisnya. " +
                "\n\nUntuk mencegah serangan ini satu-satunya cara ya dengan memberikan edukasi seputar keamanan terhadap para administrator sistem.");

        mImageUrls.add("https://i.ibb.co/QH5s0jh/wireshark.jpg");
        mNames.add("Wireshark");
        mImageDescript.add("Apa Itu Wireshark ?");
        mNameDescription.add("Wireshark adalah alat open source untuk analisis jaringan dan pembuatan jaringan lalu lintas dan paket dan alat semacam ini disebut sebagai Network Sniffers." +
                "\n\nWireshark, yang sebelumnya dikenal sebagai Ethereal, digunakan untuk memantau lalu lintas jaringan dan menganalisis paket yang dikirim keluar. Wireshark dapat mencegat lalu lintas jaringan mulai dari informasi tingkat koneksi hingga bit informasi yang membentuk paket sinyal. Semua ini dilakukan secara real time dan menunjukkan kepada pengguna dalam format yang mudah dibaca. " +
                "\n\nAda banyak perkembangan yang dilakukan pada alat (platform) selama bertahun-tahun dan mencakup filter, pengkodean warna paket bergantung pada informasi mereka dan fitur ini benar-benar membantu penguji penetrasi untuk menggali lebih dalam lalu lintas jaringan dan memeriksa paket di dalamnya secara detail.");

        mImageUrls.add("https://i.ibb.co/RcT75Vq/xss.jpg");
        mNames.add("Cross Site Scripting");
        mImageDescript.add("Pernahkah Kamu Mendengar Istilah XSS ?");
        mNameDescription.add("Cross Scripting juga biasa disebut dengan nama Cross-site Scripting. Para hacker bisa mengeksploitasi pertukaran cookies atara browser dengan web server. Fitur tersebut dapat mengaktifkan script untuk mengubah tampilan laman website." +
                "\n\nScript dapat menjalankan malware, menyadap informasi penting, mengekspos data penting seperti kartu kredit, dan lain sebagainya. Selain itu, kerawanan script-script web juga bisa terjadi pada semua bahasa pemrograman web dan ekstensi aplikasi termasuk VB, Visual C++, ASP, TCL, Perl, PHP, XML, CGI, dan Coldfusion." +
                "\n\nPada dasarnya, penyerang akan mengekploitasi kelemahan dari suatu aplikasi seperti CGI script yang tidak memeriksa input atau kerawanan pada IIS RDS pada showcode.asp yang mengizinkan dijalankannya perintah secara remote (Remote Command Priviledges).");

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mImageDescript, mNameDescription);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profile:
                Intent intent = new Intent(this, ProfileActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}