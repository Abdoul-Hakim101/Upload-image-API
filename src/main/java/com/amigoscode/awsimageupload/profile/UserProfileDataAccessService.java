package com.amigoscode.awsimageupload.profile;

import com.amigoscode.awsimageupload.dataStore.FakeUserProfileDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {
    private final FakeUserProfileDataStore fakeUserProfileData;

    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserProfileData) {
        this.fakeUserProfileData = fakeUserProfileData;
    }

    List<UserProfile> getUserProfile() {
        return fakeUserProfileData.getUserProfiles();
    }
}
