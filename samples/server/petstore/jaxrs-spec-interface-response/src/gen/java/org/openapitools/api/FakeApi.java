package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Client;
import java.util.Date;
import java.io.File;
import org.openapitools.model.FileSchemaTestClass;
import org.joda.time.LocalDate;
import java.util.Map;
<<<<<<< HEAD
import org.openapitools.model.ModelApiResponse;
=======
>>>>>>> ooof
import org.openapitools.model.OuterComposite;
import org.openapitools.model.User;
import org.openapitools.model.XmlItem;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

<<<<<<< HEAD
@Path("/fake")
@Api(description = "the fake API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public interface FakeApi {

    @POST
    @Path("/create_xml_item")
=======
@Path("/Fake")
@Api(description = "the Fake API")
public interface FakeApi {

    @POST
>>>>>>> ooof
    @Consumes({ "application/xml", "application/xml; charset=utf-8", "application/xml; charset=utf-16", "text/xml", "text/xml; charset=utf-8", "text/xml; charset=utf-16" })
    @ApiOperation(value = "creates an XmlItem", notes = "this route creates an XmlItem", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    Response createXmlItem(@Valid XmlItem xmlItem);

    @POST
<<<<<<< HEAD
    @Path("/outer/boolean")
=======
>>>>>>> ooof
    @Produces({ "*/*" })
    @ApiOperation(value = "", notes = "Test serialization of outer boolean types", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output boolean", response = Boolean.class) })
    Response fakeOuterBooleanSerialize(@Valid Boolean body);

    @POST
<<<<<<< HEAD
    @Path("/outer/composite")
=======
>>>>>>> ooof
    @Produces({ "*/*" })
    @ApiOperation(value = "", notes = "Test serialization of object with outer number type", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output composite", response = OuterComposite.class) })
    Response fakeOuterCompositeSerialize(@Valid OuterComposite body);

    @POST
<<<<<<< HEAD
    @Path("/outer/number")
=======
>>>>>>> ooof
    @Produces({ "*/*" })
    @ApiOperation(value = "", notes = "Test serialization of outer number types", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output number", response = BigDecimal.class) })
    Response fakeOuterNumberSerialize(@Valid BigDecimal body);

    @POST
<<<<<<< HEAD
    @Path("/outer/string")
=======
>>>>>>> ooof
    @Produces({ "*/*" })
    @ApiOperation(value = "", notes = "Test serialization of outer string types", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output string", response = String.class) })
    Response fakeOuterStringSerialize(@Valid String body);

    @PUT
<<<<<<< HEAD
    @Path("/body-with-file-schema")
=======
>>>>>>> ooof
    @Consumes({ "application/json" })
    @ApiOperation(value = "", notes = "For this test, the body for this request much reference a schema named `File`.", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Void.class) })
    Response testBodyWithFileSchema(@Valid FileSchemaTestClass body);

    @PUT
<<<<<<< HEAD
    @Path("/body-with-query-params")
=======
>>>>>>> ooof
    @Consumes({ "application/json" })
    @ApiOperation(value = "", notes = "", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Void.class) })
    Response testBodyWithQueryParams(@QueryParam("query") @NotNull    String query,@Valid User body);

    @PATCH
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "To test \"client\" model", notes = "To test \"client\" model", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    Response testClientModel(@Valid Client body);

    @POST
    @Consumes({ "application/x-www-form-urlencoded" })
<<<<<<< HEAD
    @ApiOperation(value = "Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트", notes = "Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트", authorizations = {
=======
    @ApiOperation(value = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", notes = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", authorizations = {
>>>>>>> ooof
        @Authorization(value = "http_basic_test")
    }, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        @ApiResponse(code = 404, message = "User not found", response = Void.class) })
    Response testEndpointParameters(@FormParam(value = "number")  BigDecimal number,@FormParam(value = "double")  Double _double,@FormParam(value = "pattern_without_delimiter")  String patternWithoutDelimiter,@FormParam(value = "byte")  byte[] _byte,@FormParam(value = "integer")  Integer integer,@FormParam(value = "int32")  Integer int32,@FormParam(value = "int64")  Long int64,@FormParam(value = "float")  Float _float,@FormParam(value = "string")  String string, @FormParam(value = "binary") InputStream binaryInputStream,@FormParam(value = "date")  LocalDate date,@FormParam(value = "dateTime")  Date dateTime,@FormParam(value = "password")  String password,@FormParam(value = "callback")  String paramCallback);

    @GET
    @Consumes({ "application/x-www-form-urlencoded" })
    @ApiOperation(value = "To test enum parameters", notes = "To test enum parameters", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid request", response = Void.class),
        @ApiResponse(code = 404, message = "Not found", response = Void.class) })
    Response testEnumParameters(@HeaderParam("enum_header_string_array")   @DefaultValue("new ArrayList<String>()")  @ApiParam("Header parameter enum test (string array)") List<String> enumHeaderStringArray,@HeaderParam("enum_header_string")   @DefaultValue("-efg")  @ApiParam("Header parameter enum test (string)") String enumHeaderString,@QueryParam("enum_query_string_array")   @ApiParam("Query parameter enum test (string array)")  List<String> enumQueryStringArray,@QueryParam("enum_query_string")  @DefaultValue("-efg")  @ApiParam("Query parameter enum test (string)")  String enumQueryString,@QueryParam("enum_query_integer")   @ApiParam("Query parameter enum test (double)")  Integer enumQueryInteger,@QueryParam("enum_query_double")   @ApiParam("Query parameter enum test (double)")  Double enumQueryDouble,@FormParam(value = "enum_form_string_array")  List<String> enumFormStringArray,@FormParam(value = "enum_form_string")  String enumFormString);

    @DELETE
    @ApiOperation(value = "Fake endpoint to test group parameters (optional)", notes = "Fake endpoint to test group parameters (optional)", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Someting wrong", response = Void.class) })
    Response testGroupParameters(@QueryParam("required_string_group") @NotNull   @ApiParam("Required String in group parameters")  Integer requiredStringGroup,@HeaderParam("required_boolean_group") @NotNull    @ApiParam("Required Boolean in group parameters") Boolean requiredBooleanGroup,@QueryParam("required_int64_group") @NotNull   @ApiParam("Required Integer in group parameters")  Long requiredInt64Group,@QueryParam("string_group")   @ApiParam("String in group parameters")  Integer stringGroup,@HeaderParam("boolean_group")    @ApiParam("Boolean in group parameters") Boolean booleanGroup,@QueryParam("int64_group")   @ApiParam("Integer in group parameters")  Long int64Group);

    @POST
<<<<<<< HEAD
    @Path("/inline-additionalProperties")
=======
>>>>>>> ooof
    @Consumes({ "application/json" })
    @ApiOperation(value = "test inline additionalProperties", notes = "", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    Response testInlineAdditionalProperties(@Valid Map<String, String> param);

    @GET
<<<<<<< HEAD
    @Path("/jsonFormData")
=======
>>>>>>> ooof
    @Consumes({ "application/x-www-form-urlencoded" })
    @ApiOperation(value = "test json serialization of form data", notes = "", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    Response testJsonFormData(@FormParam(value = "param")  String param,@FormParam(value = "param2")  String param2);

    @PUT
<<<<<<< HEAD
    @Path("/test-query-paramters")
    @ApiOperation(value = "", notes = "To test the collection format in query parameters", tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Void.class) })
    Response testQueryParameterCollectionFormat(@QueryParam("pipe") @NotNull    List<String> pipe,@QueryParam("ioutil") @NotNull    List<String> ioutil,@QueryParam("http") @NotNull    List<String> http,@QueryParam("url") @NotNull    List<String> url,@QueryParam("context") @NotNull    List<String> context);

    @POST
    @Path("/{petId}/uploadImageWithRequiredFile")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "uploads an image (required)", notes = "", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets")
        })
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class) })
    Response uploadFileWithRequiredFile(@PathParam("petId") @ApiParam("ID of pet to update") Long petId, @FormParam(value = "requiredFile") InputStream requiredFileInputStream,@FormParam(value = "additionalMetadata")  String additionalMetadata);
=======
    @ApiOperation(value = "", notes = "To test the collection format in query parameters", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Void.class) })
    Response testQueryParameterCollectionFormat(@QueryParam("pipe") @NotNull    List<String> pipe,@QueryParam("ioutil") @NotNull    List<String> ioutil,@QueryParam("http") @NotNull    List<String> http,@QueryParam("url") @NotNull    List<String> url,@QueryParam("context") @NotNull    List<String> context);
>>>>>>> ooof
}
