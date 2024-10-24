public class PlainTextReportGenerator extends  ReportGenerator{
    @Override
    protected void formatHeader() {
        System.out.println("Plain text header");
    }

    @Override
    protected void formatBody() {
        System.out.println("Plain text body");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Plain text footer");
    }
}
