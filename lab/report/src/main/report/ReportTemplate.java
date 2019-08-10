package report;

import java.util.LinkedList;
import java.util.List;

public class ReportTemplate {

    //列标题
    public List<String> columnHeaders = new LinkedList<String>();

    //字段的公式
    public List<String> fields = new LinkedList<String>();

    //创建一个例子报表
    public static ReportTemplate sampleReport1(){
        ReportTemplate template = new ReportTemplate();

        template.columnHeaders.add("部门      ");
        template.columnHeaders.add("人数");
        template.columnHeaders.add("销售额");
        template.columnHeaders.add("人均销售额");

        template.fields.add("{=dept}");
        template.fields.add("{=num_person}");
        template.fields.add("{=sales_amount}");
        template.fields.add("{=sales_amount/num_person}");

        return template;
    }

    public static ReportTemplate sampleReport2(){
        ReportTemplate template = new ReportTemplate();

        template.columnHeaders.add("部门      ");
        template.columnHeaders.add("人数");
        template.columnHeaders.add("销售额");
        template.columnHeaders.add("销售额排序");
        template.columnHeaders.add("人均销售额");
        template.columnHeaders.add("人均销售额排序");

        template.fields.add("{=dept}");
        template.fields.add("{=num_person}");
        template.fields.add("{=sales_amount}");
        template.fields.add("{=rank(sales_amount)}");
        template.fields.add("{=sales_amount/num_person}");
        template.fields.add("{=rank(sales_amount/num_person)}");

        return template;
    }

   
}
