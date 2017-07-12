package com.maning.gankmm.ui.activity.login;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.maning.gankmm.R;
import com.maning.gankmm.ui.base.BaseActivity;
import com.maning.librarycrashmonitor.utils.StatusBarUtil;

import butterknife.Bind;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class UserInfoActivity extends BaseActivity {

    @Bind(R.id.avatar)
    CircleImageView mAvatar;
    @Bind(R.id.ll_content)
    LinearLayout mLlContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        ButterKnife.bind(this);

        StatusBarUtil.setTranslucentForImageView(this, 20, mLlContent);
    }
}