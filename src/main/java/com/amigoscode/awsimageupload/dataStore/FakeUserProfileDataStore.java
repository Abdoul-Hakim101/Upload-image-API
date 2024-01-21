package com.amigoscode.awsimageupload.dataStore;

import com.amigoscode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("4d2a2624-f0ef-41b0-a25f-96cabece5fd8"), "Abdoul-Hakim", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("89276e90-ed9a-44a0-ae07-c50a309362fd"), "Souleika", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
