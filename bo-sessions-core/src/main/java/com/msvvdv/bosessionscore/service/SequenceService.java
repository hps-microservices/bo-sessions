package com.msvvdv.bosessionscore.service;

public interface SequenceService {
    long getNextSequenceId(String key) throws SecurityException;
}
