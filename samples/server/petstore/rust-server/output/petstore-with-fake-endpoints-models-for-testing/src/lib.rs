#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]

<<<<<<< HEAD
use async_trait::async_trait;
use futures::Stream;
use std::error::Error;
use std::task::{Poll, Context};
use swagger::{ApiError, ContextWrapper};

type ServiceError = Box<dyn Error + Send + Sync + 'static>;
=======
use futures::Stream;
use std::io::Error;

#[deprecated(note = "Import swagger-rs directly")]
pub use swagger::{ApiError, ContextWrapper};
#[deprecated(note = "Import futures directly")]
pub use futures::Future;
>>>>>>> ooof

pub const BASE_PATH: &'static str = "/v2";
pub const API_VERSION: &'static str = "1.0.0";

#[derive(Debug, PartialEq)]
pub enum TestSpecialTagsResponse {
    /// successful operation
    SuccessfulOperation
    (models::Client)
}

#[derive(Debug, PartialEq)]
pub enum Call123exampleResponse {
    /// success
    Success
}

#[derive(Debug, PartialEq)]
pub enum FakeOuterBooleanSerializeResponse {
    /// Output boolean
    OutputBoolean
    (bool)
}

#[derive(Debug, PartialEq)]
pub enum FakeOuterCompositeSerializeResponse {
    /// Output composite
    OutputComposite
    (models::OuterComposite)
}

#[derive(Debug, PartialEq)]
pub enum FakeOuterNumberSerializeResponse {
    /// Output number
    OutputNumber
    (f64)
}

#[derive(Debug, PartialEq)]
pub enum FakeOuterStringSerializeResponse {
    /// Output string
    OutputString
    (String)
}

#[derive(Debug, PartialEq)]
pub enum FakeResponseWithNumericalDescriptionResponse {
    /// 1234
    Status200
}

#[derive(Debug, PartialEq)]
pub enum HyphenParamResponse {
    /// Success
    Success
}

#[derive(Debug, PartialEq)]
pub enum TestBodyWithQueryParamsResponse {
    /// Success
    Success
}

#[derive(Debug, PartialEq)]
pub enum TestClientModelResponse {
    /// successful operation
    SuccessfulOperation
    (models::Client)
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum TestEndpointParametersResponse {
    /// Invalid username supplied
    InvalidUsernameSupplied
    ,
    /// User not found
    UserNotFound
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum TestEnumParametersResponse {
    /// Invalid request
    InvalidRequest
    ,
    /// Not found
    NotFound
}

#[derive(Debug, PartialEq)]
pub enum TestInlineAdditionalPropertiesResponse {
    /// successful operation
    SuccessfulOperation
}

#[derive(Debug, PartialEq)]
pub enum TestJsonFormDataResponse {
    /// successful operation
    SuccessfulOperation
}

#[derive(Debug, PartialEq)]
pub enum TestClassnameResponse {
    /// successful operation
    SuccessfulOperation
    (models::Client)
}

#[derive(Debug, PartialEq)]
pub enum AddPetResponse {
    /// Invalid input
    InvalidInput
}

#[derive(Debug, PartialEq)]
pub enum DeletePetResponse {
    /// Invalid pet value
    InvalidPetValue
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum FindPetsByStatusResponse {
    /// successful operation
    SuccessfulOperation
    (Vec<models::Pet>)
    ,
    /// Invalid status value
    InvalidStatusValue
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum FindPetsByTagsResponse {
    /// successful operation
    SuccessfulOperation
    (Vec<models::Pet>)
    ,
    /// Invalid tag value
    InvalidTagValue
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum GetPetByIdResponse {
    /// successful operation
    SuccessfulOperation
    (models::Pet)
    ,
    /// Invalid ID supplied
    InvalidIDSupplied
    ,
    /// Pet not found
    PetNotFound
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum UpdatePetResponse {
    /// Invalid ID supplied
    InvalidIDSupplied
    ,
    /// Pet not found
    PetNotFound
    ,
    /// Validation exception
    ValidationException
}

#[derive(Debug, PartialEq)]
pub enum UpdatePetWithFormResponse {
    /// Invalid input
    InvalidInput
}

#[derive(Debug, PartialEq)]
pub enum UploadFileResponse {
    /// successful operation
    SuccessfulOperation
    (models::ApiResponse)
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum DeleteOrderResponse {
    /// Invalid ID supplied
    InvalidIDSupplied
    ,
    /// Order not found
    OrderNotFound
}

#[derive(Debug, PartialEq)]
pub enum GetInventoryResponse {
    /// successful operation
    SuccessfulOperation
    (std::collections::HashMap<String, i32>)
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum GetOrderByIdResponse {
    /// successful operation
    SuccessfulOperation
    (models::Order)
    ,
    /// Invalid ID supplied
    InvalidIDSupplied
    ,
    /// Order not found
    OrderNotFound
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum PlaceOrderResponse {
    /// successful operation
    SuccessfulOperation
    (models::Order)
    ,
    /// Invalid Order
    InvalidOrder
}

#[derive(Debug, PartialEq)]
pub enum CreateUserResponse {
    /// successful operation
    SuccessfulOperation
}

#[derive(Debug, PartialEq)]
pub enum CreateUsersWithArrayInputResponse {
    /// successful operation
    SuccessfulOperation
}

#[derive(Debug, PartialEq)]
pub enum CreateUsersWithListInputResponse {
    /// successful operation
    SuccessfulOperation
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum DeleteUserResponse {
    /// Invalid username supplied
    InvalidUsernameSupplied
    ,
    /// User not found
    UserNotFound
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum GetUserByNameResponse {
    /// successful operation
    SuccessfulOperation
    (models::User)
    ,
    /// Invalid username supplied
    InvalidUsernameSupplied
    ,
    /// User not found
    UserNotFound
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum LoginUserResponse {
    /// successful operation
    SuccessfulOperation
    {
        body: String,
<<<<<<< HEAD
        x_rate_limit:
        Option<
        i32
        >
        ,
        x_expires_after:
        Option<
        chrono::DateTime::<chrono::Utc>
        >
=======
        x_rate_limit: i32,
        x_expires_after: chrono::DateTime::<chrono::Utc>
>>>>>>> ooof
    }
    ,
    /// Invalid username/password supplied
    InvalidUsername
}

#[derive(Debug, PartialEq)]
pub enum LogoutUserResponse {
    /// successful operation
    SuccessfulOperation
}

#[derive(Debug, PartialEq)]
#[must_use]
pub enum UpdateUserResponse {
    /// Invalid user supplied
    InvalidUserSupplied
    ,
    /// User not found
    UserNotFound
}

/// API
<<<<<<< HEAD
#[async_trait]
pub trait Api<C: Send + Sync> {
    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>> {
        Poll::Ready(Ok(()))
    }

    /// To test special tags
    async fn test_special_tags(
        &self,
        body: models::Client,
        context: &C) -> Result<TestSpecialTagsResponse, ApiError>;

    async fn call123example(
        &self,
        context: &C) -> Result<Call123exampleResponse, ApiError>;

    async fn fake_outer_boolean_serialize(
        &self,
        body: Option<models::OuterBoolean>,
        context: &C) -> Result<FakeOuterBooleanSerializeResponse, ApiError>;

    async fn fake_outer_composite_serialize(
        &self,
        body: Option<models::OuterComposite>,
        context: &C) -> Result<FakeOuterCompositeSerializeResponse, ApiError>;

    async fn fake_outer_number_serialize(
        &self,
        body: Option<models::OuterNumber>,
        context: &C) -> Result<FakeOuterNumberSerializeResponse, ApiError>;

    async fn fake_outer_string_serialize(
        &self,
        body: Option<models::OuterString>,
        context: &C) -> Result<FakeOuterStringSerializeResponse, ApiError>;

    async fn fake_response_with_numerical_description(
        &self,
        context: &C) -> Result<FakeResponseWithNumericalDescriptionResponse, ApiError>;

    async fn hyphen_param(
        &self,
        hyphen_param: String,
        context: &C) -> Result<HyphenParamResponse, ApiError>;

    async fn test_body_with_query_params(
        &self,
        query: String,
        body: models::User,
        context: &C) -> Result<TestBodyWithQueryParamsResponse, ApiError>;

    /// To test \"client\" model
    async fn test_client_model(
        &self,
        body: models::Client,
        context: &C) -> Result<TestClientModelResponse, ApiError>;

    /// Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
    async fn test_endpoint_parameters(
=======
pub trait Api<C> {
    /// To test special tags
    fn test_special_tags(
        &self,
        body: models::Client,
        context: &C) -> Box<dyn Future<Item=TestSpecialTagsResponse, Error=ApiError> + Send>;

    fn call123example(
        &self,
        context: &C) -> Box<dyn Future<Item=Call123exampleResponse, Error=ApiError> + Send>;

    fn fake_outer_boolean_serialize(
        &self,
        body: Option<models::OuterBoolean>,
        context: &C) -> Box<dyn Future<Item=FakeOuterBooleanSerializeResponse, Error=ApiError> + Send>;

    fn fake_outer_composite_serialize(
        &self,
        body: Option<models::OuterComposite>,
        context: &C) -> Box<dyn Future<Item=FakeOuterCompositeSerializeResponse, Error=ApiError> + Send>;

    fn fake_outer_number_serialize(
        &self,
        body: Option<models::OuterNumber>,
        context: &C) -> Box<dyn Future<Item=FakeOuterNumberSerializeResponse, Error=ApiError> + Send>;

    fn fake_outer_string_serialize(
        &self,
        body: Option<models::OuterString>,
        context: &C) -> Box<dyn Future<Item=FakeOuterStringSerializeResponse, Error=ApiError> + Send>;

    fn fake_response_with_numerical_description(
        &self,
        context: &C) -> Box<dyn Future<Item=FakeResponseWithNumericalDescriptionResponse, Error=ApiError> + Send>;

    fn hyphen_param(
        &self,
        hyphen_param: String,
        context: &C) -> Box<dyn Future<Item=HyphenParamResponse, Error=ApiError> + Send>;

    fn test_body_with_query_params(
        &self,
        query: String,
        body: models::User,
        context: &C) -> Box<dyn Future<Item=TestBodyWithQueryParamsResponse, Error=ApiError> + Send>;

    /// To test \"client\" model
    fn test_client_model(
        &self,
        body: models::Client,
        context: &C) -> Box<dyn Future<Item=TestClientModelResponse, Error=ApiError> + Send>;

    /// Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
    fn test_endpoint_parameters(
>>>>>>> ooof
        &self,
        number: f64,
        double: f64,
        pattern_without_delimiter: String,
        byte: swagger::ByteArray,
        integer: Option<i32>,
        int32: Option<i32>,
        int64: Option<i64>,
        float: Option<f32>,
        string: Option<String>,
        binary: Option<swagger::ByteArray>,
        date: Option<chrono::DateTime::<chrono::Utc>>,
        date_time: Option<chrono::DateTime::<chrono::Utc>>,
        password: Option<String>,
        callback: Option<String>,
<<<<<<< HEAD
        context: &C) -> Result<TestEndpointParametersResponse, ApiError>;

    /// To test enum parameters
    async fn test_enum_parameters(
=======
        context: &C) -> Box<dyn Future<Item=TestEndpointParametersResponse, Error=ApiError> + Send>;

    /// To test enum parameters
    fn test_enum_parameters(
>>>>>>> ooof
        &self,
        enum_header_string_array: Option<&Vec<String>>,
        enum_header_string: Option<String>,
        enum_query_string_array: Option<&Vec<String>>,
        enum_query_string: Option<String>,
        enum_query_integer: Option<i32>,
        enum_query_double: Option<f64>,
        enum_form_string: Option<String>,
<<<<<<< HEAD
        context: &C) -> Result<TestEnumParametersResponse, ApiError>;

    /// test inline additionalProperties
    async fn test_inline_additional_properties(
        &self,
        param: std::collections::HashMap<String, String>,
        context: &C) -> Result<TestInlineAdditionalPropertiesResponse, ApiError>;

    /// test json serialization of form data
    async fn test_json_form_data(
        &self,
        param: String,
        param2: String,
        context: &C) -> Result<TestJsonFormDataResponse, ApiError>;

    /// To test class name in snake case
    async fn test_classname(
        &self,
        body: models::Client,
        context: &C) -> Result<TestClassnameResponse, ApiError>;

    /// Add a new pet to the store
    async fn add_pet(
        &self,
        body: models::Pet,
        context: &C) -> Result<AddPetResponse, ApiError>;

    /// Deletes a pet
    async fn delete_pet(
        &self,
        pet_id: i64,
        api_key: Option<String>,
        context: &C) -> Result<DeletePetResponse, ApiError>;

    /// Finds Pets by status
    async fn find_pets_by_status(
        &self,
        status: &Vec<String>,
        context: &C) -> Result<FindPetsByStatusResponse, ApiError>;

    /// Finds Pets by tags
    async fn find_pets_by_tags(
        &self,
        tags: &Vec<String>,
        context: &C) -> Result<FindPetsByTagsResponse, ApiError>;

    /// Find pet by ID
    async fn get_pet_by_id(
        &self,
        pet_id: i64,
        context: &C) -> Result<GetPetByIdResponse, ApiError>;

    /// Update an existing pet
    async fn update_pet(
        &self,
        body: models::Pet,
        context: &C) -> Result<UpdatePetResponse, ApiError>;

    /// Updates a pet in the store with form data
    async fn update_pet_with_form(
=======
        context: &C) -> Box<dyn Future<Item=TestEnumParametersResponse, Error=ApiError> + Send>;

    /// test inline additionalProperties
    fn test_inline_additional_properties(
        &self,
        param: std::collections::HashMap<String, String>,
        context: &C) -> Box<dyn Future<Item=TestInlineAdditionalPropertiesResponse, Error=ApiError> + Send>;

    /// test json serialization of form data
    fn test_json_form_data(
        &self,
        param: String,
        param2: String,
        context: &C) -> Box<dyn Future<Item=TestJsonFormDataResponse, Error=ApiError> + Send>;

    /// To test class name in snake case
    fn test_classname(
        &self,
        body: models::Client,
        context: &C) -> Box<dyn Future<Item=TestClassnameResponse, Error=ApiError> + Send>;

    /// Add a new pet to the store
    fn add_pet(
        &self,
        body: models::Pet,
        context: &C) -> Box<dyn Future<Item=AddPetResponse, Error=ApiError> + Send>;

    /// Deletes a pet
    fn delete_pet(
        &self,
        pet_id: i64,
        api_key: Option<String>,
        context: &C) -> Box<dyn Future<Item=DeletePetResponse, Error=ApiError> + Send>;

    /// Finds Pets by status
    fn find_pets_by_status(
        &self,
        status: &Vec<String>,
        context: &C) -> Box<dyn Future<Item=FindPetsByStatusResponse, Error=ApiError> + Send>;

    /// Finds Pets by tags
    fn find_pets_by_tags(
        &self,
        tags: &Vec<String>,
        context: &C) -> Box<dyn Future<Item=FindPetsByTagsResponse, Error=ApiError> + Send>;

    /// Find pet by ID
    fn get_pet_by_id(
        &self,
        pet_id: i64,
        context: &C) -> Box<dyn Future<Item=GetPetByIdResponse, Error=ApiError> + Send>;

    /// Update an existing pet
    fn update_pet(
        &self,
        body: models::Pet,
        context: &C) -> Box<dyn Future<Item=UpdatePetResponse, Error=ApiError> + Send>;

    /// Updates a pet in the store with form data
    fn update_pet_with_form(
>>>>>>> ooof
        &self,
        pet_id: i64,
        name: Option<String>,
        status: Option<String>,
<<<<<<< HEAD
        context: &C) -> Result<UpdatePetWithFormResponse, ApiError>;

    /// uploads an image
    async fn upload_file(
=======
        context: &C) -> Box<dyn Future<Item=UpdatePetWithFormResponse, Error=ApiError> + Send>;

    /// uploads an image
    fn upload_file(
>>>>>>> ooof
        &self,
        pet_id: i64,
        additional_metadata: Option<String>,
        file: Option<swagger::ByteArray>,
<<<<<<< HEAD
        context: &C) -> Result<UploadFileResponse, ApiError>;

    /// Delete purchase order by ID
    async fn delete_order(
        &self,
        order_id: String,
        context: &C) -> Result<DeleteOrderResponse, ApiError>;

    /// Returns pet inventories by status
    async fn get_inventory(
        &self,
        context: &C) -> Result<GetInventoryResponse, ApiError>;

    /// Find purchase order by ID
    async fn get_order_by_id(
        &self,
        order_id: i64,
        context: &C) -> Result<GetOrderByIdResponse, ApiError>;

    /// Place an order for a pet
    async fn place_order(
        &self,
        body: models::Order,
        context: &C) -> Result<PlaceOrderResponse, ApiError>;

    /// Create user
    async fn create_user(
        &self,
        body: models::User,
        context: &C) -> Result<CreateUserResponse, ApiError>;

    /// Creates list of users with given input array
    async fn create_users_with_array_input(
        &self,
        body: &Vec<models::User>,
        context: &C) -> Result<CreateUsersWithArrayInputResponse, ApiError>;

    /// Creates list of users with given input array
    async fn create_users_with_list_input(
        &self,
        body: &Vec<models::User>,
        context: &C) -> Result<CreateUsersWithListInputResponse, ApiError>;

    /// Delete user
    async fn delete_user(
        &self,
        username: String,
        context: &C) -> Result<DeleteUserResponse, ApiError>;

    /// Get user by user name
    async fn get_user_by_name(
        &self,
        username: String,
        context: &C) -> Result<GetUserByNameResponse, ApiError>;

    /// Logs user into the system
    async fn login_user(
        &self,
        username: String,
        password: String,
        context: &C) -> Result<LoginUserResponse, ApiError>;

    /// Logs out current logged in user session
    async fn logout_user(
        &self,
        context: &C) -> Result<LogoutUserResponse, ApiError>;

    /// Updated user
    async fn update_user(
        &self,
        username: String,
        body: models::User,
        context: &C) -> Result<UpdateUserResponse, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[async_trait]
pub trait ApiNoContext<C: Send + Sync> {

    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>>;

    fn context(&self) -> &C;

    /// To test special tags
    async fn test_special_tags(
        &self,
        body: models::Client,
        ) -> Result<TestSpecialTagsResponse, ApiError>;

    async fn call123example(
        &self,
        ) -> Result<Call123exampleResponse, ApiError>;

    async fn fake_outer_boolean_serialize(
        &self,
        body: Option<models::OuterBoolean>,
        ) -> Result<FakeOuterBooleanSerializeResponse, ApiError>;

    async fn fake_outer_composite_serialize(
        &self,
        body: Option<models::OuterComposite>,
        ) -> Result<FakeOuterCompositeSerializeResponse, ApiError>;

    async fn fake_outer_number_serialize(
        &self,
        body: Option<models::OuterNumber>,
        ) -> Result<FakeOuterNumberSerializeResponse, ApiError>;

    async fn fake_outer_string_serialize(
        &self,
        body: Option<models::OuterString>,
        ) -> Result<FakeOuterStringSerializeResponse, ApiError>;

    async fn fake_response_with_numerical_description(
        &self,
        ) -> Result<FakeResponseWithNumericalDescriptionResponse, ApiError>;

    async fn hyphen_param(
        &self,
        hyphen_param: String,
        ) -> Result<HyphenParamResponse, ApiError>;

    async fn test_body_with_query_params(
        &self,
        query: String,
        body: models::User,
        ) -> Result<TestBodyWithQueryParamsResponse, ApiError>;

    /// To test \"client\" model
    async fn test_client_model(
        &self,
        body: models::Client,
        ) -> Result<TestClientModelResponse, ApiError>;

    /// Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
    async fn test_endpoint_parameters(
=======
        context: &C) -> Box<dyn Future<Item=UploadFileResponse, Error=ApiError> + Send>;

    /// Delete purchase order by ID
    fn delete_order(
        &self,
        order_id: String,
        context: &C) -> Box<dyn Future<Item=DeleteOrderResponse, Error=ApiError> + Send>;

    /// Returns pet inventories by status
    fn get_inventory(
        &self,
        context: &C) -> Box<dyn Future<Item=GetInventoryResponse, Error=ApiError> + Send>;

    /// Find purchase order by ID
    fn get_order_by_id(
        &self,
        order_id: i64,
        context: &C) -> Box<dyn Future<Item=GetOrderByIdResponse, Error=ApiError> + Send>;

    /// Place an order for a pet
    fn place_order(
        &self,
        body: models::Order,
        context: &C) -> Box<dyn Future<Item=PlaceOrderResponse, Error=ApiError> + Send>;

    /// Create user
    fn create_user(
        &self,
        body: models::User,
        context: &C) -> Box<dyn Future<Item=CreateUserResponse, Error=ApiError> + Send>;

    /// Creates list of users with given input array
    fn create_users_with_array_input(
        &self,
        body: &Vec<models::User>,
        context: &C) -> Box<dyn Future<Item=CreateUsersWithArrayInputResponse, Error=ApiError> + Send>;

    /// Creates list of users with given input array
    fn create_users_with_list_input(
        &self,
        body: &Vec<models::User>,
        context: &C) -> Box<dyn Future<Item=CreateUsersWithListInputResponse, Error=ApiError> + Send>;

    /// Delete user
    fn delete_user(
        &self,
        username: String,
        context: &C) -> Box<dyn Future<Item=DeleteUserResponse, Error=ApiError> + Send>;

    /// Get user by user name
    fn get_user_by_name(
        &self,
        username: String,
        context: &C) -> Box<dyn Future<Item=GetUserByNameResponse, Error=ApiError> + Send>;

    /// Logs user into the system
    fn login_user(
        &self,
        username: String,
        password: String,
        context: &C) -> Box<dyn Future<Item=LoginUserResponse, Error=ApiError> + Send>;

    /// Logs out current logged in user session
    fn logout_user(
        &self,
        context: &C) -> Box<dyn Future<Item=LogoutUserResponse, Error=ApiError> + Send>;

    /// Updated user
    fn update_user(
        &self,
        username: String,
        body: models::User,
        context: &C) -> Box<dyn Future<Item=UpdateUserResponse, Error=ApiError> + Send>;

}

/// API without a `Context`
pub trait ApiNoContext {
    /// To test special tags
    fn test_special_tags(
        &self,
        body: models::Client,
        ) -> Box<dyn Future<Item=TestSpecialTagsResponse, Error=ApiError> + Send>;

    fn call123example(
        &self,
        ) -> Box<dyn Future<Item=Call123exampleResponse, Error=ApiError> + Send>;

    fn fake_outer_boolean_serialize(
        &self,
        body: Option<models::OuterBoolean>,
        ) -> Box<dyn Future<Item=FakeOuterBooleanSerializeResponse, Error=ApiError> + Send>;

    fn fake_outer_composite_serialize(
        &self,
        body: Option<models::OuterComposite>,
        ) -> Box<dyn Future<Item=FakeOuterCompositeSerializeResponse, Error=ApiError> + Send>;

    fn fake_outer_number_serialize(
        &self,
        body: Option<models::OuterNumber>,
        ) -> Box<dyn Future<Item=FakeOuterNumberSerializeResponse, Error=ApiError> + Send>;

    fn fake_outer_string_serialize(
        &self,
        body: Option<models::OuterString>,
        ) -> Box<dyn Future<Item=FakeOuterStringSerializeResponse, Error=ApiError> + Send>;

    fn fake_response_with_numerical_description(
        &self,
        ) -> Box<dyn Future<Item=FakeResponseWithNumericalDescriptionResponse, Error=ApiError> + Send>;

    fn hyphen_param(
        &self,
        hyphen_param: String,
        ) -> Box<dyn Future<Item=HyphenParamResponse, Error=ApiError> + Send>;

    fn test_body_with_query_params(
        &self,
        query: String,
        body: models::User,
        ) -> Box<dyn Future<Item=TestBodyWithQueryParamsResponse, Error=ApiError> + Send>;

    /// To test \"client\" model
    fn test_client_model(
        &self,
        body: models::Client,
        ) -> Box<dyn Future<Item=TestClientModelResponse, Error=ApiError> + Send>;

    /// Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
    fn test_endpoint_parameters(
>>>>>>> ooof
        &self,
        number: f64,
        double: f64,
        pattern_without_delimiter: String,
        byte: swagger::ByteArray,
        integer: Option<i32>,
        int32: Option<i32>,
        int64: Option<i64>,
        float: Option<f32>,
        string: Option<String>,
        binary: Option<swagger::ByteArray>,
        date: Option<chrono::DateTime::<chrono::Utc>>,
        date_time: Option<chrono::DateTime::<chrono::Utc>>,
        password: Option<String>,
        callback: Option<String>,
<<<<<<< HEAD
        ) -> Result<TestEndpointParametersResponse, ApiError>;

    /// To test enum parameters
    async fn test_enum_parameters(
=======
        ) -> Box<dyn Future<Item=TestEndpointParametersResponse, Error=ApiError> + Send>;

    /// To test enum parameters
    fn test_enum_parameters(
>>>>>>> ooof
        &self,
        enum_header_string_array: Option<&Vec<String>>,
        enum_header_string: Option<String>,
        enum_query_string_array: Option<&Vec<String>>,
        enum_query_string: Option<String>,
        enum_query_integer: Option<i32>,
        enum_query_double: Option<f64>,
        enum_form_string: Option<String>,
<<<<<<< HEAD
        ) -> Result<TestEnumParametersResponse, ApiError>;

    /// test inline additionalProperties
    async fn test_inline_additional_properties(
        &self,
        param: std::collections::HashMap<String, String>,
        ) -> Result<TestInlineAdditionalPropertiesResponse, ApiError>;

    /// test json serialization of form data
    async fn test_json_form_data(
        &self,
        param: String,
        param2: String,
        ) -> Result<TestJsonFormDataResponse, ApiError>;

    /// To test class name in snake case
    async fn test_classname(
        &self,
        body: models::Client,
        ) -> Result<TestClassnameResponse, ApiError>;

    /// Add a new pet to the store
    async fn add_pet(
        &self,
        body: models::Pet,
        ) -> Result<AddPetResponse, ApiError>;

    /// Deletes a pet
    async fn delete_pet(
        &self,
        pet_id: i64,
        api_key: Option<String>,
        ) -> Result<DeletePetResponse, ApiError>;

    /// Finds Pets by status
    async fn find_pets_by_status(
        &self,
        status: &Vec<String>,
        ) -> Result<FindPetsByStatusResponse, ApiError>;

    /// Finds Pets by tags
    async fn find_pets_by_tags(
        &self,
        tags: &Vec<String>,
        ) -> Result<FindPetsByTagsResponse, ApiError>;

    /// Find pet by ID
    async fn get_pet_by_id(
        &self,
        pet_id: i64,
        ) -> Result<GetPetByIdResponse, ApiError>;

    /// Update an existing pet
    async fn update_pet(
        &self,
        body: models::Pet,
        ) -> Result<UpdatePetResponse, ApiError>;

    /// Updates a pet in the store with form data
    async fn update_pet_with_form(
=======
        ) -> Box<dyn Future<Item=TestEnumParametersResponse, Error=ApiError> + Send>;

    /// test inline additionalProperties
    fn test_inline_additional_properties(
        &self,
        param: std::collections::HashMap<String, String>,
        ) -> Box<dyn Future<Item=TestInlineAdditionalPropertiesResponse, Error=ApiError> + Send>;

    /// test json serialization of form data
    fn test_json_form_data(
        &self,
        param: String,
        param2: String,
        ) -> Box<dyn Future<Item=TestJsonFormDataResponse, Error=ApiError> + Send>;

    /// To test class name in snake case
    fn test_classname(
        &self,
        body: models::Client,
        ) -> Box<dyn Future<Item=TestClassnameResponse, Error=ApiError> + Send>;

    /// Add a new pet to the store
    fn add_pet(
        &self,
        body: models::Pet,
        ) -> Box<dyn Future<Item=AddPetResponse, Error=ApiError> + Send>;

    /// Deletes a pet
    fn delete_pet(
        &self,
        pet_id: i64,
        api_key: Option<String>,
        ) -> Box<dyn Future<Item=DeletePetResponse, Error=ApiError> + Send>;

    /// Finds Pets by status
    fn find_pets_by_status(
        &self,
        status: &Vec<String>,
        ) -> Box<dyn Future<Item=FindPetsByStatusResponse, Error=ApiError> + Send>;

    /// Finds Pets by tags
    fn find_pets_by_tags(
        &self,
        tags: &Vec<String>,
        ) -> Box<dyn Future<Item=FindPetsByTagsResponse, Error=ApiError> + Send>;

    /// Find pet by ID
    fn get_pet_by_id(
        &self,
        pet_id: i64,
        ) -> Box<dyn Future<Item=GetPetByIdResponse, Error=ApiError> + Send>;

    /// Update an existing pet
    fn update_pet(
        &self,
        body: models::Pet,
        ) -> Box<dyn Future<Item=UpdatePetResponse, Error=ApiError> + Send>;

    /// Updates a pet in the store with form data
    fn update_pet_with_form(
>>>>>>> ooof
        &self,
        pet_id: i64,
        name: Option<String>,
        status: Option<String>,
<<<<<<< HEAD
        ) -> Result<UpdatePetWithFormResponse, ApiError>;

    /// uploads an image
    async fn upload_file(
=======
        ) -> Box<dyn Future<Item=UpdatePetWithFormResponse, Error=ApiError> + Send>;

    /// uploads an image
    fn upload_file(
>>>>>>> ooof
        &self,
        pet_id: i64,
        additional_metadata: Option<String>,
        file: Option<swagger::ByteArray>,
<<<<<<< HEAD
        ) -> Result<UploadFileResponse, ApiError>;

    /// Delete purchase order by ID
    async fn delete_order(
        &self,
        order_id: String,
        ) -> Result<DeleteOrderResponse, ApiError>;

    /// Returns pet inventories by status
    async fn get_inventory(
        &self,
        ) -> Result<GetInventoryResponse, ApiError>;

    /// Find purchase order by ID
    async fn get_order_by_id(
        &self,
        order_id: i64,
        ) -> Result<GetOrderByIdResponse, ApiError>;

    /// Place an order for a pet
    async fn place_order(
        &self,
        body: models::Order,
        ) -> Result<PlaceOrderResponse, ApiError>;

    /// Create user
    async fn create_user(
        &self,
        body: models::User,
        ) -> Result<CreateUserResponse, ApiError>;

    /// Creates list of users with given input array
    async fn create_users_with_array_input(
        &self,
        body: &Vec<models::User>,
        ) -> Result<CreateUsersWithArrayInputResponse, ApiError>;

    /// Creates list of users with given input array
    async fn create_users_with_list_input(
        &self,
        body: &Vec<models::User>,
        ) -> Result<CreateUsersWithListInputResponse, ApiError>;

    /// Delete user
    async fn delete_user(
        &self,
        username: String,
        ) -> Result<DeleteUserResponse, ApiError>;

    /// Get user by user name
    async fn get_user_by_name(
        &self,
        username: String,
        ) -> Result<GetUserByNameResponse, ApiError>;

    /// Logs user into the system
    async fn login_user(
        &self,
        username: String,
        password: String,
        ) -> Result<LoginUserResponse, ApiError>;

    /// Logs out current logged in user session
    async fn logout_user(
        &self,
        ) -> Result<LogoutUserResponse, ApiError>;

    /// Updated user
    async fn update_user(
        &self,
        username: String,
        body: models::User,
        ) -> Result<UpdateUserResponse, ApiError>;
=======
        ) -> Box<dyn Future<Item=UploadFileResponse, Error=ApiError> + Send>;

    /// Delete purchase order by ID
    fn delete_order(
        &self,
        order_id: String,
        ) -> Box<dyn Future<Item=DeleteOrderResponse, Error=ApiError> + Send>;

    /// Returns pet inventories by status
    fn get_inventory(
        &self,
        ) -> Box<dyn Future<Item=GetInventoryResponse, Error=ApiError> + Send>;

    /// Find purchase order by ID
    fn get_order_by_id(
        &self,
        order_id: i64,
        ) -> Box<dyn Future<Item=GetOrderByIdResponse, Error=ApiError> + Send>;

    /// Place an order for a pet
    fn place_order(
        &self,
        body: models::Order,
        ) -> Box<dyn Future<Item=PlaceOrderResponse, Error=ApiError> + Send>;

    /// Create user
    fn create_user(
        &self,
        body: models::User,
        ) -> Box<dyn Future<Item=CreateUserResponse, Error=ApiError> + Send>;

    /// Creates list of users with given input array
    fn create_users_with_array_input(
        &self,
        body: &Vec<models::User>,
        ) -> Box<dyn Future<Item=CreateUsersWithArrayInputResponse, Error=ApiError> + Send>;

    /// Creates list of users with given input array
    fn create_users_with_list_input(
        &self,
        body: &Vec<models::User>,
        ) -> Box<dyn Future<Item=CreateUsersWithListInputResponse, Error=ApiError> + Send>;

    /// Delete user
    fn delete_user(
        &self,
        username: String,
        ) -> Box<dyn Future<Item=DeleteUserResponse, Error=ApiError> + Send>;

    /// Get user by user name
    fn get_user_by_name(
        &self,
        username: String,
        ) -> Box<dyn Future<Item=GetUserByNameResponse, Error=ApiError> + Send>;

    /// Logs user into the system
    fn login_user(
        &self,
        username: String,
        password: String,
        ) -> Box<dyn Future<Item=LoginUserResponse, Error=ApiError> + Send>;

    /// Logs out current logged in user session
    fn logout_user(
        &self,
        ) -> Box<dyn Future<Item=LogoutUserResponse, Error=ApiError> + Send>;

    /// Updated user
    fn update_user(
        &self,
        username: String,
        body: models::User,
        ) -> Box<dyn Future<Item=UpdateUserResponse, Error=ApiError> + Send>;
>>>>>>> ooof

}

/// Trait to extend an API to make it easy to bind it to a context.
<<<<<<< HEAD
pub trait ContextWrapperExt<C: Send + Sync> where Self: Sized
{
    /// Binds this API to a context.
    fn with_context(self: Self, context: C) -> ContextWrapper<Self, C>;
}

impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ContextWrapperExt<C> for T {
    fn with_context(self: T, context: C) -> ContextWrapper<T, C> {
=======
pub trait ContextWrapperExt<'a, C> where Self: Sized {
    /// Binds this API to a context.
    fn with_context(self: &'a Self, context: C) -> ContextWrapper<'a, Self, C>;
}

impl<'a, T: Api<C> + Sized, C> ContextWrapperExt<'a, C> for T {
    fn with_context(self: &'a T, context: C) -> ContextWrapper<'a, T, C> {
>>>>>>> ooof
         ContextWrapper::<T, C>::new(self, context)
    }
}

<<<<<<< HEAD
#[async_trait]
impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ApiNoContext<C> for ContextWrapper<T, C> {
    fn poll_ready(&self, cx: &mut Context) -> Poll<Result<(), ServiceError>> {
        self.api().poll_ready(cx)
    }

    fn context(&self) -> &C {
        ContextWrapper::context(self)
    }

    /// To test special tags
    async fn test_special_tags(
        &self,
        body: models::Client,
        ) -> Result<TestSpecialTagsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().test_special_tags(body, &context).await
    }

    async fn call123example(
        &self,
        ) -> Result<Call123exampleResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().call123example(&context).await
    }

    async fn fake_outer_boolean_serialize(
        &self,
        body: Option<models::OuterBoolean>,
        ) -> Result<FakeOuterBooleanSerializeResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().fake_outer_boolean_serialize(body, &context).await
    }

    async fn fake_outer_composite_serialize(
        &self,
        body: Option<models::OuterComposite>,
        ) -> Result<FakeOuterCompositeSerializeResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().fake_outer_composite_serialize(body, &context).await
    }

    async fn fake_outer_number_serialize(
        &self,
        body: Option<models::OuterNumber>,
        ) -> Result<FakeOuterNumberSerializeResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().fake_outer_number_serialize(body, &context).await
    }

    async fn fake_outer_string_serialize(
        &self,
        body: Option<models::OuterString>,
        ) -> Result<FakeOuterStringSerializeResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().fake_outer_string_serialize(body, &context).await
    }

    async fn fake_response_with_numerical_description(
        &self,
        ) -> Result<FakeResponseWithNumericalDescriptionResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().fake_response_with_numerical_description(&context).await
    }

    async fn hyphen_param(
        &self,
        hyphen_param: String,
        ) -> Result<HyphenParamResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().hyphen_param(hyphen_param, &context).await
    }

    async fn test_body_with_query_params(
        &self,
        query: String,
        body: models::User,
        ) -> Result<TestBodyWithQueryParamsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().test_body_with_query_params(query, body, &context).await
    }

    /// To test \"client\" model
    async fn test_client_model(
        &self,
        body: models::Client,
        ) -> Result<TestClientModelResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().test_client_model(body, &context).await
    }

    /// Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
    async fn test_endpoint_parameters(
=======
impl<'a, T: Api<C>, C> ApiNoContext for ContextWrapper<'a, T, C> {
    /// To test special tags
    fn test_special_tags(
        &self,
        body: models::Client,
        ) -> Box<dyn Future<Item=TestSpecialTagsResponse, Error=ApiError> + Send>
    {
        self.api().test_special_tags(body, &self.context())
    }

    fn call123example(
        &self,
        ) -> Box<dyn Future<Item=Call123exampleResponse, Error=ApiError> + Send>
    {
        self.api().call123example(&self.context())
    }

    fn fake_outer_boolean_serialize(
        &self,
        body: Option<models::OuterBoolean>,
        ) -> Box<dyn Future<Item=FakeOuterBooleanSerializeResponse, Error=ApiError> + Send>
    {
        self.api().fake_outer_boolean_serialize(body, &self.context())
    }

    fn fake_outer_composite_serialize(
        &self,
        body: Option<models::OuterComposite>,
        ) -> Box<dyn Future<Item=FakeOuterCompositeSerializeResponse, Error=ApiError> + Send>
    {
        self.api().fake_outer_composite_serialize(body, &self.context())
    }

    fn fake_outer_number_serialize(
        &self,
        body: Option<models::OuterNumber>,
        ) -> Box<dyn Future<Item=FakeOuterNumberSerializeResponse, Error=ApiError> + Send>
    {
        self.api().fake_outer_number_serialize(body, &self.context())
    }

    fn fake_outer_string_serialize(
        &self,
        body: Option<models::OuterString>,
        ) -> Box<dyn Future<Item=FakeOuterStringSerializeResponse, Error=ApiError> + Send>
    {
        self.api().fake_outer_string_serialize(body, &self.context())
    }

    fn fake_response_with_numerical_description(
        &self,
        ) -> Box<dyn Future<Item=FakeResponseWithNumericalDescriptionResponse, Error=ApiError> + Send>
    {
        self.api().fake_response_with_numerical_description(&self.context())
    }

    fn hyphen_param(
        &self,
        hyphen_param: String,
        ) -> Box<dyn Future<Item=HyphenParamResponse, Error=ApiError> + Send>
    {
        self.api().hyphen_param(hyphen_param, &self.context())
    }

    fn test_body_with_query_params(
        &self,
        query: String,
        body: models::User,
        ) -> Box<dyn Future<Item=TestBodyWithQueryParamsResponse, Error=ApiError> + Send>
    {
        self.api().test_body_with_query_params(query, body, &self.context())
    }

    /// To test \"client\" model
    fn test_client_model(
        &self,
        body: models::Client,
        ) -> Box<dyn Future<Item=TestClientModelResponse, Error=ApiError> + Send>
    {
        self.api().test_client_model(body, &self.context())
    }

    /// Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
    fn test_endpoint_parameters(
>>>>>>> ooof
        &self,
        number: f64,
        double: f64,
        pattern_without_delimiter: String,
        byte: swagger::ByteArray,
        integer: Option<i32>,
        int32: Option<i32>,
        int64: Option<i64>,
        float: Option<f32>,
        string: Option<String>,
        binary: Option<swagger::ByteArray>,
        date: Option<chrono::DateTime::<chrono::Utc>>,
        date_time: Option<chrono::DateTime::<chrono::Utc>>,
        password: Option<String>,
        callback: Option<String>,
<<<<<<< HEAD
        ) -> Result<TestEndpointParametersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().test_endpoint_parameters(number, double, pattern_without_delimiter, byte, integer, int32, int64, float, string, binary, date, date_time, password, callback, &context).await
    }

    /// To test enum parameters
    async fn test_enum_parameters(
=======
        ) -> Box<dyn Future<Item=TestEndpointParametersResponse, Error=ApiError> + Send>
    {
        self.api().test_endpoint_parameters(number, double, pattern_without_delimiter, byte, integer, int32, int64, float, string, binary, date, date_time, password, callback, &self.context())
    }

    /// To test enum parameters
    fn test_enum_parameters(
>>>>>>> ooof
        &self,
        enum_header_string_array: Option<&Vec<String>>,
        enum_header_string: Option<String>,
        enum_query_string_array: Option<&Vec<String>>,
        enum_query_string: Option<String>,
        enum_query_integer: Option<i32>,
        enum_query_double: Option<f64>,
        enum_form_string: Option<String>,
<<<<<<< HEAD
        ) -> Result<TestEnumParametersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().test_enum_parameters(enum_header_string_array, enum_header_string, enum_query_string_array, enum_query_string, enum_query_integer, enum_query_double, enum_form_string, &context).await
    }

    /// test inline additionalProperties
    async fn test_inline_additional_properties(
        &self,
        param: std::collections::HashMap<String, String>,
        ) -> Result<TestInlineAdditionalPropertiesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().test_inline_additional_properties(param, &context).await
    }

    /// test json serialization of form data
    async fn test_json_form_data(
        &self,
        param: String,
        param2: String,
        ) -> Result<TestJsonFormDataResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().test_json_form_data(param, param2, &context).await
    }

    /// To test class name in snake case
    async fn test_classname(
        &self,
        body: models::Client,
        ) -> Result<TestClassnameResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().test_classname(body, &context).await
    }

    /// Add a new pet to the store
    async fn add_pet(
        &self,
        body: models::Pet,
        ) -> Result<AddPetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().add_pet(body, &context).await
    }

    /// Deletes a pet
    async fn delete_pet(
        &self,
        pet_id: i64,
        api_key: Option<String>,
        ) -> Result<DeletePetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_pet(pet_id, api_key, &context).await
    }

    /// Finds Pets by status
    async fn find_pets_by_status(
        &self,
        status: &Vec<String>,
        ) -> Result<FindPetsByStatusResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().find_pets_by_status(status, &context).await
    }

    /// Finds Pets by tags
    async fn find_pets_by_tags(
        &self,
        tags: &Vec<String>,
        ) -> Result<FindPetsByTagsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().find_pets_by_tags(tags, &context).await
    }

    /// Find pet by ID
    async fn get_pet_by_id(
        &self,
        pet_id: i64,
        ) -> Result<GetPetByIdResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_pet_by_id(pet_id, &context).await
    }

    /// Update an existing pet
    async fn update_pet(
        &self,
        body: models::Pet,
        ) -> Result<UpdatePetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_pet(body, &context).await
    }

    /// Updates a pet in the store with form data
    async fn update_pet_with_form(
=======
        ) -> Box<dyn Future<Item=TestEnumParametersResponse, Error=ApiError> + Send>
    {
        self.api().test_enum_parameters(enum_header_string_array, enum_header_string, enum_query_string_array, enum_query_string, enum_query_integer, enum_query_double, enum_form_string, &self.context())
    }

    /// test inline additionalProperties
    fn test_inline_additional_properties(
        &self,
        param: std::collections::HashMap<String, String>,
        ) -> Box<dyn Future<Item=TestInlineAdditionalPropertiesResponse, Error=ApiError> + Send>
    {
        self.api().test_inline_additional_properties(param, &self.context())
    }

    /// test json serialization of form data
    fn test_json_form_data(
        &self,
        param: String,
        param2: String,
        ) -> Box<dyn Future<Item=TestJsonFormDataResponse, Error=ApiError> + Send>
    {
        self.api().test_json_form_data(param, param2, &self.context())
    }

    /// To test class name in snake case
    fn test_classname(
        &self,
        body: models::Client,
        ) -> Box<dyn Future<Item=TestClassnameResponse, Error=ApiError> + Send>
    {
        self.api().test_classname(body, &self.context())
    }

    /// Add a new pet to the store
    fn add_pet(
        &self,
        body: models::Pet,
        ) -> Box<dyn Future<Item=AddPetResponse, Error=ApiError> + Send>
    {
        self.api().add_pet(body, &self.context())
    }

    /// Deletes a pet
    fn delete_pet(
        &self,
        pet_id: i64,
        api_key: Option<String>,
        ) -> Box<dyn Future<Item=DeletePetResponse, Error=ApiError> + Send>
    {
        self.api().delete_pet(pet_id, api_key, &self.context())
    }

    /// Finds Pets by status
    fn find_pets_by_status(
        &self,
        status: &Vec<String>,
        ) -> Box<dyn Future<Item=FindPetsByStatusResponse, Error=ApiError> + Send>
    {
        self.api().find_pets_by_status(status, &self.context())
    }

    /// Finds Pets by tags
    fn find_pets_by_tags(
        &self,
        tags: &Vec<String>,
        ) -> Box<dyn Future<Item=FindPetsByTagsResponse, Error=ApiError> + Send>
    {
        self.api().find_pets_by_tags(tags, &self.context())
    }

    /// Find pet by ID
    fn get_pet_by_id(
        &self,
        pet_id: i64,
        ) -> Box<dyn Future<Item=GetPetByIdResponse, Error=ApiError> + Send>
    {
        self.api().get_pet_by_id(pet_id, &self.context())
    }

    /// Update an existing pet
    fn update_pet(
        &self,
        body: models::Pet,
        ) -> Box<dyn Future<Item=UpdatePetResponse, Error=ApiError> + Send>
    {
        self.api().update_pet(body, &self.context())
    }

    /// Updates a pet in the store with form data
    fn update_pet_with_form(
>>>>>>> ooof
        &self,
        pet_id: i64,
        name: Option<String>,
        status: Option<String>,
<<<<<<< HEAD
        ) -> Result<UpdatePetWithFormResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_pet_with_form(pet_id, name, status, &context).await
    }

    /// uploads an image
    async fn upload_file(
=======
        ) -> Box<dyn Future<Item=UpdatePetWithFormResponse, Error=ApiError> + Send>
    {
        self.api().update_pet_with_form(pet_id, name, status, &self.context())
    }

    /// uploads an image
    fn upload_file(
>>>>>>> ooof
        &self,
        pet_id: i64,
        additional_metadata: Option<String>,
        file: Option<swagger::ByteArray>,
<<<<<<< HEAD
        ) -> Result<UploadFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().upload_file(pet_id, additional_metadata, file, &context).await
    }

    /// Delete purchase order by ID
    async fn delete_order(
        &self,
        order_id: String,
        ) -> Result<DeleteOrderResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_order(order_id, &context).await
    }

    /// Returns pet inventories by status
    async fn get_inventory(
        &self,
        ) -> Result<GetInventoryResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_inventory(&context).await
    }

    /// Find purchase order by ID
    async fn get_order_by_id(
        &self,
        order_id: i64,
        ) -> Result<GetOrderByIdResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_order_by_id(order_id, &context).await
    }

    /// Place an order for a pet
    async fn place_order(
        &self,
        body: models::Order,
        ) -> Result<PlaceOrderResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().place_order(body, &context).await
    }

    /// Create user
    async fn create_user(
        &self,
        body: models::User,
        ) -> Result<CreateUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_user(body, &context).await
    }

    /// Creates list of users with given input array
    async fn create_users_with_array_input(
        &self,
        body: &Vec<models::User>,
        ) -> Result<CreateUsersWithArrayInputResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_users_with_array_input(body, &context).await
    }

    /// Creates list of users with given input array
    async fn create_users_with_list_input(
        &self,
        body: &Vec<models::User>,
        ) -> Result<CreateUsersWithListInputResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_users_with_list_input(body, &context).await
    }

    /// Delete user
    async fn delete_user(
        &self,
        username: String,
        ) -> Result<DeleteUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_user(username, &context).await
    }

    /// Get user by user name
    async fn get_user_by_name(
        &self,
        username: String,
        ) -> Result<GetUserByNameResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_user_by_name(username, &context).await
    }

    /// Logs user into the system
    async fn login_user(
        &self,
        username: String,
        password: String,
        ) -> Result<LoginUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().login_user(username, password, &context).await
    }

    /// Logs out current logged in user session
    async fn logout_user(
        &self,
        ) -> Result<LogoutUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().logout_user(&context).await
    }

    /// Updated user
    async fn update_user(
        &self,
        username: String,
        body: models::User,
        ) -> Result<UpdateUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_user(username, body, &context).await
=======
        ) -> Box<dyn Future<Item=UploadFileResponse, Error=ApiError> + Send>
    {
        self.api().upload_file(pet_id, additional_metadata, file, &self.context())
    }

    /// Delete purchase order by ID
    fn delete_order(
        &self,
        order_id: String,
        ) -> Box<dyn Future<Item=DeleteOrderResponse, Error=ApiError> + Send>
    {
        self.api().delete_order(order_id, &self.context())
    }

    /// Returns pet inventories by status
    fn get_inventory(
        &self,
        ) -> Box<dyn Future<Item=GetInventoryResponse, Error=ApiError> + Send>
    {
        self.api().get_inventory(&self.context())
    }

    /// Find purchase order by ID
    fn get_order_by_id(
        &self,
        order_id: i64,
        ) -> Box<dyn Future<Item=GetOrderByIdResponse, Error=ApiError> + Send>
    {
        self.api().get_order_by_id(order_id, &self.context())
    }

    /// Place an order for a pet
    fn place_order(
        &self,
        body: models::Order,
        ) -> Box<dyn Future<Item=PlaceOrderResponse, Error=ApiError> + Send>
    {
        self.api().place_order(body, &self.context())
    }

    /// Create user
    fn create_user(
        &self,
        body: models::User,
        ) -> Box<dyn Future<Item=CreateUserResponse, Error=ApiError> + Send>
    {
        self.api().create_user(body, &self.context())
    }

    /// Creates list of users with given input array
    fn create_users_with_array_input(
        &self,
        body: &Vec<models::User>,
        ) -> Box<dyn Future<Item=CreateUsersWithArrayInputResponse, Error=ApiError> + Send>
    {
        self.api().create_users_with_array_input(body, &self.context())
    }

    /// Creates list of users with given input array
    fn create_users_with_list_input(
        &self,
        body: &Vec<models::User>,
        ) -> Box<dyn Future<Item=CreateUsersWithListInputResponse, Error=ApiError> + Send>
    {
        self.api().create_users_with_list_input(body, &self.context())
    }

    /// Delete user
    fn delete_user(
        &self,
        username: String,
        ) -> Box<dyn Future<Item=DeleteUserResponse, Error=ApiError> + Send>
    {
        self.api().delete_user(username, &self.context())
    }

    /// Get user by user name
    fn get_user_by_name(
        &self,
        username: String,
        ) -> Box<dyn Future<Item=GetUserByNameResponse, Error=ApiError> + Send>
    {
        self.api().get_user_by_name(username, &self.context())
    }

    /// Logs user into the system
    fn login_user(
        &self,
        username: String,
        password: String,
        ) -> Box<dyn Future<Item=LoginUserResponse, Error=ApiError> + Send>
    {
        self.api().login_user(username, password, &self.context())
    }

    /// Logs out current logged in user session
    fn logout_user(
        &self,
        ) -> Box<dyn Future<Item=LogoutUserResponse, Error=ApiError> + Send>
    {
        self.api().logout_user(&self.context())
    }

    /// Updated user
    fn update_user(
        &self,
        username: String,
        body: models::User,
        ) -> Box<dyn Future<Item=UpdateUserResponse, Error=ApiError> + Send>
    {
        self.api().update_user(username, body, &self.context())
>>>>>>> ooof
    }

}

<<<<<<< HEAD

=======
>>>>>>> ooof
#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

#[cfg(feature = "server")]
pub mod context;

pub mod models;

#[cfg(any(feature = "client", feature = "server"))]
pub(crate) mod header;
