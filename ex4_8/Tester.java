abstract class Student {
    private String studentName;
    protected int[] testScores;  // Changed to protected
    protected String testResult;  // Changed to protected

    public Student(String studentName) {
        this.studentName = studentName;
        this.testScores = new int[4];
    }

    public void setTestScore(int testNumber, int testScore) {
        this.testScores[testNumber] = testScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTestResult() {
        return testResult;
    }

    public abstract void generateResult();
}

class UndergraduateStudent extends Student {
    public UndergraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        int totalScore = 0;
        for (int score : testScores) {
            totalScore += score;
        }
        double averageScore = totalScore / 4.0;
        if (averageScore >= 70) {
            testResult = "Pass";
        } else {
            testResult = "Fail";
        }
    }
}

class GraduateStudent extends Student {
    public GraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        int totalScore = 0;
        for (int score : testScores) {
            totalScore += score;
        }
        double averageScore = totalScore / 4.0;
        if (averageScore >= 80) {
            testResult = "Pass";
        } else {
            testResult = "Fail";
        }
    }
}

class Tester {
    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
        undergraduateStudent.generateResult();

        System.out.println("Student name: " + undergraduateStudent.getStudentName());
        System.out.println("Result: " + undergraduateStudent.getTestResult());

        System.out.println();

        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
        graduateStudent.generateResult();

        System.out.println("Student name: " + graduateStudent.getStudentName());
        System.out.println("Result: " + graduateStudent.getTestResult());
    }
}