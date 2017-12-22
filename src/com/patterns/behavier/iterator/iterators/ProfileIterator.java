package com.patterns.behavier.iterator.iterators;

public interface ProfileIterator {
    public boolean hasNext();

    public com.patterns.behavier.iterator.profile.Profile getNext();

    public void reset();
}
