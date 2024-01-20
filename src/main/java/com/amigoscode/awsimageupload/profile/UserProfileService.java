package com.amigoscode.awsimageupload.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class UserProfileService {
    private final UserProfileDataAccessService userProfileDataAccessService;

    @Autowired
    public UserProfileService(UserProfileDataAccessService userProfileDataAccessService) {
        this.userProfileDataAccessService = userProfileDataAccessService;
    }

    List<UserProfile> getUserProfiles() {
        return userProfileDataAccessService.getUserProfile();
    }

    public void uploadUserProfileImage(UUID userProfileId, MultipartFile file) {
        // 1.check if image is not empty
        // 2.if file is an image
        //3.user exists in our database
        //4.grab metadata from  file if any
        //5.store image in s3 and update database (userProfileImageLink) with s3 image link
    }
}
