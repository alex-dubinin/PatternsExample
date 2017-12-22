package com.patterns.behavier.iterator.social_networks;

import com.patterns.behavier.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    public ProfileIterator createFriendsIterator(String profileEmail);

    public ProfileIterator createCoworkersIterator(String profileEmail);
}
