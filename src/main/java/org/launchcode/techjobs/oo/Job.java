package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String jobString = "";

        if (name == null && employer == null && location == null && positionType == null && coreCompetency == null) {
            jobString = "OOPS! This job does not seem to exist.";
        } else {
            jobString += "\n";

            jobString += "ID: ";
            jobString += id;
            jobString += "\n";

            jobString += "Name: ";
            if (name.isEmpty()) {
                jobString += "Data not available";
            } else jobString += name;
            jobString += "\n";

            jobString += "Employer: ";
            if (employer.toString().isEmpty()) {
                jobString += "Data not available";
            } else jobString += employer.toString();
            jobString += "\n";

            jobString += "Location: ";
            if (location.toString().isEmpty()) {
                jobString += "Data not available";
            } else jobString += location.toString();
            jobString += "\n";

            jobString += "Position Type: ";
            if (positionType.toString().isEmpty()) {
                jobString += "Data not available";
            } else jobString += positionType.toString();
            jobString += "\n";

            jobString += "Core Competency: ";
            if (coreCompetency.toString().isEmpty()) {
                jobString += "Data not available";
            } else jobString += coreCompetency.toString();
            jobString += "\n";
        }

        return jobString;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
