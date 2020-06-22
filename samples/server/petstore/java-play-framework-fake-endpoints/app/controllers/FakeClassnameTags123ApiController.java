package controllers;

import apimodels.Client;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.LinkedHashSet;
=======
>>>>>>> ooof
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import play.Configuration;

import openapitools.OpenAPIUtils.ApiAction;

<<<<<<< HEAD
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
=======

>>>>>>> ooof
public class FakeClassnameTags123ApiController extends Controller {

    private final FakeClassnameTags123ApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private FakeClassnameTags123ApiController(Configuration configuration, FakeClassnameTags123ApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result testClassname() throws Exception {
        JsonNode nodebody = request().body().asJson();
        Client body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Client.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            throw new IllegalArgumentException("'body' parameter is required");
        }
        Client obj = imp.testClassname(body);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
