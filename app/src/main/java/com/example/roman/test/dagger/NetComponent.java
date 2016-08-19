package com.example.roman.test.dagger;

import com.example.roman.test.DetailOrderFragment;
import com.example.roman.test.LoginActivity;
import com.example.roman.test.LoginSettingsActivity;
import com.example.roman.test.MainActivity;
import com.example.roman.test.MainFragment;
import com.example.roman.test.MessageActivity;
import com.example.roman.test.OrderActivity;
import com.example.roman.test.SectorActivity;
import com.example.roman.test.SettingsActivity;
import com.example.roman.test.services.SocketService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(SocketService service);
    void inject(LoginActivity activity);
    void inject(LoginSettingsActivity activity);
    void inject(DetailOrderFragment fragment);
    void inject(OrderActivity activity);
    void inject(MessageActivity activity);
    void inject(SectorActivity activity);
    void inject(SettingsActivity activity);
    void inject(MainActivity activity);
    void inject(MainFragment fragment);
}
