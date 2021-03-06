package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.CustomGreetingInfo_AnsweringRuleInfo;

public class Greeting extends Path {
    public Greeting(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "greeting", id);
    }

    public static class PostParameters {
        // Type of a greeting, specifying the case when the greeting is played. See also Greeting Types
        public String type;
        // Information on an answering rule that the greeting is applied to
        public CustomGreetingInfo_AnsweringRuleInfo answeringRule;

        public PostParameters type(String type) {
            this.type = type;
            return this;
        }

        public PostParameters answeringRule(CustomGreetingInfo_AnsweringRuleInfo answeringRule) {
            this.answeringRule = answeringRule;
            return this;
        }
    }
}
