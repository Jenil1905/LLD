public class Main {
    public static void main(String[] args) {
        System.out.println("=== Evaluation Pipeline ===");
        Submission sub = new Submission("23BCS1007", "public class A{}", "A.java");
        ICodeGraderService grader = new CodeGrader();
        IPlagiarismService pc = new PlagiarismChecker();
        IReportWriterService writer = new ReportWriter();
        new EvaluationPipeline(grader , pc , writer).evaluate(sub);
    }
}
