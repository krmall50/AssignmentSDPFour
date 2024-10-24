public class PDFReportGenerator extends ReportGenerator{
    @Override
    protected void formatHeader() {
        System.out.println("PDF header");
    }

    @Override
    protected void formatBody() {
        System.out.println("PDF body");
    }

    @Override
    protected void formatFooter() {
        System.out.println("PDF footer");
    }
}
