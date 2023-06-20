package Seminar_5.service;

import Seminar_5.model.StudyGroup;

public interface GroupService<T extends StudyGroup> {
    void createGroup(String nameGroup);
}

