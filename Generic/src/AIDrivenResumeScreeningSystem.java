import java.util.*;

// Define an abstract class JobRole
abstract class JobRole {
    abstract void processResume();
}

// Implement different job roles
class SoftwareEngineer extends JobRole {
    public void processResume() {
        System.out.println("Processing Software Engineer Resume");
    }
}

class DataScientist extends JobRole {
    public void processResume() {
        System.out.println("Processing Data Scientist Resume");
    }
}

class ProductManager extends JobRole {
    public void processResume() {
        System.out.println("Processing Product Manager Resume");
    }
}

// Generic class to handle resumes
class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void screen() {
        jobRole.processResume();
    }
}

// Resume screening pipeline
class AIDrivenResumeScreeningSystem {
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.processResume();
        }
    }

    public static void main(String[] args) {
        List<JobRole> resumes = new ArrayList<>();
        resumes.add(new SoftwareEngineer());
        resumes.add(new DataScientist());
        resumes.add(new ProductManager());

        screenResumes(resumes);
    }
}

