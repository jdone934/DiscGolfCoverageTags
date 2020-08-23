package com.doneyTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

import static j2html.TagCreator.*;

public class StateSelect extends SimpleTagSupport {
    private String selectId;
    private String divClass;

    public void setSelectId(String selectId) {
        this.selectId = selectId;
    }

    public void setDivClass(String divClass) {
        this.divClass = divClass;
    }

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        out.print(div(
            label(
            "State"
            ).attr("for", selectId),
            select(
                option(
                    "Select a State"
                ).withValue(""),
                option(
                    "Alabama"
                ).withValue("AL"),
                option(
                        "Alaska"
                ).withValue("AK"),
                option(
                        "Arizona"
                ).withValue("AZ"),
                option(
                        "Arkansas"
                ).withValue("AR"),
                option(
                        "California"
                ).withValue("CA"),
                option(
                        "Colorado"
                ).withValue("CO"),
                option(
                        "Connecticut"
                ).withValue("CT"),
                option(
                        "Delaware"
                ).withValue("DE"),
                option(
                        "District of Columbia"
                ).withValue("DC"),
                option(
                        "Florida"
                ).withValue("FL"),
                option(
                        "Georgia"
                ).withValue("GA"),
                option(
                        "Hawaii"
                ).withValue("HI"),
                option(
                        "Idaho"
                ).withValue("ID"),
                option(
                        "Illinois"
                ).withValue("IL"),
                option(
                        "Indiana"
                ).withValue("IN"),
                option(
                        "Iowa"
                ).withValue("IA"),
                option(
                        "Kansas"
                ).withValue("KS"),
                option(
                        "Louisiana"
                ).withValue("LA"),
                option(
                        "Maine"
                ).withValue("ME"),
                option(
                        "Maryland"
                ).withValue("MD"),
                option(
                        "Massachusetts"
                ).withValue("MA"),
                option(
                        "Michigan"
                ).withValue("MI"),
                option(
                        "Minnesota"
                ).withValue("MN"),
                option(
                        "Mississippi"
                ).withValue("MS"),
                option(
                        "Missouri"
                ).withValue("MO"),
                option(
                        "Montana"
                ).withValue("MT"),
                option(
                        "Nebraska"
                ).withValue("NE"),
                option(
                        "Nevada"
                ).withValue("NV"),
                option(
                        "New Hampshire"
                ).withValue("NH"),
                option(
                        "New Jersey"
                ).withValue("NJ"),
                option(
                        "New Mexico"
                ).withValue("NM"),
                option(
                        "New York"
                ).withValue("NY"),
                option(
                        "North Caorlina"
                ).withValue("NC"),
                option(
                        "North Dakota"
                ).withValue("ND"),
                option(
                        "Ohio"
                ).withValue("OH"),
                option(
                        "Oklahoma"
                ).withValue("OK"),
                option(
                        "Oregon"
                ).withValue("OR"),
                option(
                        "Pennsylvania"
                ).withValue("PA"),
                option(
                        "Rhode Island"
                ).withValue("RI"),
                option(
                        "South Carolina"
                ).withValue("SC"),
                option(
                        "South Dakota"
                ).withValue("SD"),
                option(
                        "Tennessee"
                ).withValue("TN"),
                option(
                        "Texas"
                ).withValue("TX"),
                option(
                        "Utah"
                ).withValue("UT"),
                option(
                        "Vermont"
                ).withValue("VT"),
                option(
                        "Washington"
                ).withValue("WA"),
                option(
                        "West Virginia"
                ).withValue("WV"),
                option(
                        "Wisconsin"
                ).withValue("WI"),
                option(
                        "Wyoming"
                ).withValue("WY")
            ).withClass("form-control").withName(selectId).withId(selectId)
        ).withClass(divClass).render());
    }
}
