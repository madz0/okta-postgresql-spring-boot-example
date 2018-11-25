package net.dovale.okta.spring_boot_postgressql.service;

import net.dovale.okta.spring_boot_postgressql.entities.Review;

import javax.validation.constraints.NotNull;


public interface TeacherService {

    /**
     *
     * @param teacherID
     * @param review
     * @throws javax.persistence.EntityNotFoundException
     */
    void addReview(@NotNull String teacherID, @NotNull Review review);
}
