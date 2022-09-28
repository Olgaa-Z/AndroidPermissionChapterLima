package coding.withze.androidpermissionchapterlima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coding.withze.androidpermissionchapterlima.databinding.ActivityNormalPermissionBinding
import com.bumptech.glide.Glide

class NormalPermission : AppCompatActivity() {

    lateinit var binding : ActivityNormalPermissionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNormalPermissionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowImg.setOnClickListener {
            Glide.with(this).load("https://i.ibb.co/zJHYGBP/binarlogo.jpg")
                .circleCrop()
                .into(binding.imgView)
        }
    }


}