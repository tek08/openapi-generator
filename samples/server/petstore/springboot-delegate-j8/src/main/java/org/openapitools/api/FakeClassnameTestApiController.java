package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
<<<<<<< HEAD
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
=======

>>>>>>> ooof
@Controller
@RequestMapping("${openapi.openAPIPetstore.base-path:/v2}")
public class FakeClassnameTestApiController implements FakeClassnameTestApi {

    private final FakeClassnameTestApiDelegate delegate;

    public FakeClassnameTestApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) FakeClassnameTestApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new FakeClassnameTestApiDelegate() {});
    }

    @Override
    public FakeClassnameTestApiDelegate getDelegate() {
        return delegate;
    }

}
