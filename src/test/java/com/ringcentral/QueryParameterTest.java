package com.ringcentral;

import com.ringcentral.paths.Groups;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class QueryParameterTest extends BaseTest {

    @Test
    public void testGlipGroup() throws IOException, RestException {
        Groups.ListResponse result = restClient.get("/restapi/v1.0/glip/groups", Groups.ListResponse.class);
        assertTrue(result.records.length > 1);

        // options #1
        result = restClient.get("/restapi/v1.0/glip/groups", Groups.ListResponse.class, new HttpClient.QueryParameter("recordCount", "1"));
        assertTrue(result.records.length == 1);

        // options #2
        result = restClient.get("/restapi/v1.0/glip/groups?recordCount=1", Groups.ListResponse.class);
        assertTrue(result.records.length == 1);
    }
}
