package fis.java.bigexample.model;

import fis.java.bigexample.enums.EmploymentStatus;
import fis.java.bigexample.enums.Rank;

import java.time.LocalDateTime;
import java.util.Set;

public class Detective {
    private  Person person;
    private String badgeNumber;
    private Rank rank;
    private  Boolean armed;
    private EmploymentStatus status;
    private Set<CriminalCase> criminalCases;
    private Set<TrackEntry> trackEntries;

    public Detective() {
    }

    public Detective(Person person, String badgeNumber, Rank rank, Boolean armed, EmploymentStatus status,
                     Set<CriminalCase> criminalCases, Set<TrackEntry> trackEntries) {
        this.person = person;
        this.badgeNumber = badgeNumber;
        this.rank = rank;
        this.armed = armed;
        this.status = status;
        this.criminalCases = criminalCases;
        this.trackEntries = trackEntries;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Boolean getArmed() {
        return armed;
    }

    public void setArmed(Boolean armed) {
        this.armed = armed;
    }

    public EmploymentStatus getStatus() {
        return status;
    }

    public void setStatus(EmploymentStatus status) {
        this.status = status;
    }

    public Set<CriminalCase> getCriminalCases() {
        return criminalCases;
    }

    public void setCriminalCases(Set<CriminalCase> criminalCases) {
        this.criminalCases = criminalCases;
    }

    public Set<TrackEntry> getTrackEntries() {
        return trackEntries;
    }

    public void setTrackEntries(Set<TrackEntry> trackEntries) {
        this.trackEntries = trackEntries;
    }
}
