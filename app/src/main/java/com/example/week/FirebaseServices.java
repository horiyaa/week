package com.example.week;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class FirebaseServices {
    private static FirebaseServices instance;
    private FirebaseAuth auth;
    private FirebaseFirestore fire;
    private FirebaseStorage storage;

    public FirebaseServices(){
        this.auth=FirebaseAuth.getInstance();
        this.fire=FirebaseFirestore.getInstance();
        this.storage=FirebaseStorage.getInstance();
    }

    public FirebaseServices getInstance(){
        if(instance==null)
            instance=new FirebaseServices();
        return instance;
    }

    public FirebaseAuth getAuth() {
        return auth;
    }

    public FirebaseFirestore getFire() {
        return fire;
    }

    public FirebaseStorage getStorage() {
        return storage;
    }
}
