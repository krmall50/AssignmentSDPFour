public class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("<html><head><title>HTML Report</title></head><body><h1>HTML Header</h1>");
    }

    @Override
    protected void formatBody() {
        System.out.println("<p>HTML body</p>");
    }

    @Override
    protected void formatFooter() {
        System.out.println("<footer>HTML Footer</footer></body></html>");
    }
}
