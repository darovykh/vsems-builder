import java.time.LocalDate;

public class Main {

    public static void main(String [] args) {
        Student student = new Student.Builder()
                .withUniversity("KHPI")
                .withFaculty("KSIT")
                .withAcademicDepartment("IST")
                .withAcademicGroup("Н721")
                .withSpeciality("Information systems and technology")
                .withSpecialtyCode("126")
                .withFieldOfKnowledge("Computer sience")
                .withFieldOfKnowledgeCode("12")
                .withStudentTicketNumber("13630677")
                .withAdmissionDate(LocalDate.of(2017, 9, 1))
                .withStudyPeriod(2)
                .withTotalNumberOfDisciplines(32)
                .withAverageMark(4.7)
                .withNumberOfAcademicDebts(0)
                .withNumberOfScientificPublications(2)
                .withEducationalLevel("master")
                .withFormOfEducation("full-time")
                .withScholarshipAmount(2000)
                .withCourse(5)
                .withIsStudentOfMilitaryDepartment(false)
                .build();

        System.out.println(student);
    }

}
