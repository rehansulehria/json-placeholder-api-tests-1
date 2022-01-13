package com.api.jsonplaceholder.report;

import com.github.automatedowl.tools.AllureEnvironmentWriter;
import com.google.common.collect.ImmutableMap;
import static com.api.jsonplaceholder.api.endpoints.BASE_URI;


public class AllureManager {
        private AllureManager() {
        }

        public static void setAllureEnvironmentInformation() {
            AllureEnvironmentWriter.allureEnvironmentWriter(
                    ImmutableMap.<String, String>builder().
                            put("Test URL", BASE_URI).
                            put("Global timeout", String.valueOf(1000)).
                            put("Headless mode", "true").
                            put("Local browser", "chrome").
                            build());
        }
}
