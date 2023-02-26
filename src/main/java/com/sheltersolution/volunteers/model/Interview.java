package com.sheltersolution.volunteers.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Interview {
    @Id
    @GeneratedValue
    private UUID id;
    @OneToOne
    private Adopter adopter;
    private String reason;
    private String idealAge;
    private String thoughtAboutNeedsOfPuppy;
    private String adoptersHouse;
    private String familyWithChildren;
    private String familyWithDog;
    private String yardAndFencing;
    private String fenceHeight;
    private String breedOrWeightRestrictions;
    private String whereWillDogSleep;
    private String activityWithDog;
    private String dogTraits;
    private String trainingDetails;
    private String previousDogBehaviourChallenge;
    private String expenseExpectations;
    private String upcomingTravel;
    private String typeOfApproval;

}
