package com.maxfour.music.model;

import android.content.Context;
import android.os.Parcel;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public abstract class AbsCustomPlaylist extends Playlist {
    public AbsCustomPlaylist(int id, String name) {
        super(id, name);
    }

    public AbsCustomPlaylist() {
    }

    public AbsCustomPlaylist(Parcel in) {
        super(in);
    }

    @NonNull
    public abstract ArrayList<Song> getSongs(Context context);
}
