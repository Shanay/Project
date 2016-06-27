package com.example.shanay.internship;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Bundle data=getIntent().getExtras();
        int num=data.getInt("no");
        TextView abc=(TextView)findViewById(R.id.about);
        String[] s={"Software for Insurance Brokers SAIBA is capable of consolidating all the activities of an Insurance Brokers, which helps in retaining the existing business as well as getting new business by providing handful information and various analysis support.\n" +
                " \n" +
                "We have two variants available for SAIBA to choose from based on your requirement:\n" +
                "SAIBA Desktop Version (Thick Client) \n" +
                "This variant of the software will require windows networking, where database will be installed on a server and users will be connected through LAN by SAIBA client.\n" +
                "This offiline version of SAIBA is for the small or mid size insurance brokers who are operating from one or two locations with very limited number of users.\n" +
                "SAIBA Online Version (Web Based) \n" +
                "SAIBAOnline is a web based application which needs to be hosted on a web server and all the users will have to be connected through web browser by using intranet or internet connectivity to the server.\n" +
                "SAIBAOnline now a days is most popular version as you have the facility here to provide the access also to your server.\n" +
                "You may host SAIBAOnline in your office server, may opt for cloud hosting or ask us to do so on your behalf.\n",
                "SATA is the kind of ERP solutions for third party administrators for claims management, analysis, accounting as well as 3600 reporting to TPA, Insurers, Hospital, Corporate, Individuals, Brokers & Agents.\n" +
                        "Some of the key features of SATA are :\n" +
                        "Comprehensive policy data management\n" +
                        "End to end claims management starting from intimation of claims to the reimbursement of payments to insured or hospitals.\n" +
                        "Comprehensive accounts management through our multi-currency financial accounting system SiFAMs.\n" +
                        "Inbuilt Document management of soft files. Complete file processing electronically if required.\n" +
                        "Integrated SMS and Email Management. Sending emails and SMS at various steps to insured.\n" +
                        "Flexibility of customization to suite your requirement and changes requested by growing business process, insurers, regulators etc.",
                    "Insurance Agency Management Software “BimaPro 1.0” is a single machine insurance agency management software. It has been used by many insurance professionals in India. BimaPro is an unique product in India which provides comprehensive marketing tools and costing management of life insurance & non-life insurance. From CRM to final accounting, BimaPro is an ideal application for an insurance agent.\n" +
                            "Salient feature of insurance agents software BimaPro are:\n" +
                            "Calculate the premium for all the traditional products of various life insurance companies.\n" +
                            "Premium wise as well as feature wise, comparison available.\n" +
                            "Generate comprehensive quotations for customers.\n" +
                            "Able to manage your entire marketing activities such as daily diary preparation, track customers conversation, keeps history of customer interaction, performance & costing analysis, travel expense management, etc.\n" +
                            "Keep record of entire leaves of a cover note book once you receive it from insurer till it is return back.\n" +
                            "Manage policy details, which includes life and general policy data entry to system, attachment of documents, endorsement if any, renewal of policy, etc.\n" +
                            "Take care of brokerage reconciliation part in life and general insurance section, such as receive brokerage from insurers, reconciliation, generate supplementary bills if any, income and profit analysis,TDS reports, etc.\n" +
                            "Provide automated email and SMS reminders to client\n" +
                            "Manage multiple agencies in one application.",
                            "Our software for reinsurance brokers “SARB” has now created a leading place in reinsurance broking Industry.\n" +
                                    "SARB provides comprehensive management of all reinsurance business processes in very user friendly way.\n" +
                                    "Integrated email, SMS and electronic document management to assist you in your day to day business to improve your efficiencies.\n" +
                                    "Various reports to enable you for better analysis and negotiations.\n" +
                                    "State of the art reminder system for PPWs, Closings and Renewals.\n" +
                                    "Various system generated documents like DN/CN, reinsurer balance statements, Claim Advices etc.",
                                "For the growing industry of private train operations in India. This products helps in train operations and financial co-ordination with indian railway.\n"      };

        switch(num)
        {
            case 0:abc.setText(s[0]);
                    break;
            case 1:abc.setText(s[1]);
                   break;
            case 2:abc.setText(s[2]);
                   break;
            case 3:abc.setText(s[3]);
                   break;
            case 4:abc.setText(s[4]);
                   break;
            default:abc.setText(s[0]);

        }
    }
}
