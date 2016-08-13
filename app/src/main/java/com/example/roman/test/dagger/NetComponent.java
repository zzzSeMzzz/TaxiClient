package com.example.roman.test.dagger;

import com.example.roman.test.MainActivity;
import com.example.roman.test.socket.SocketService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(SocketService service);
    void inject(MainActivity activity);
}