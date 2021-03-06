/*
 * Rust client test spec
 *
 * Special testing for the Rust client generator
 *
 * The version of the OpenAPI document: 1.0.7
 * 
 * Generated by: https://openapi-generator.tech
 */

<<<<<<< HEAD
#[allow(unused_imports)]
use std::rc::Rc;
use std::borrow::Borrow;
=======
use std::rc::Rc;
use std::borrow::Borrow;
#[allow(unused_imports)]
>>>>>>> ooof
use std::option::Option;

use reqwest;

<<<<<<< HEAD
use crate::apis::ResponseContent;
=======
>>>>>>> ooof
use super::{Error, configuration};

pub struct DefaultApiClient {
    configuration: Rc<configuration::Configuration>,
}

impl DefaultApiClient {
    pub fn new(configuration: Rc<configuration::Configuration>) -> DefaultApiClient {
        DefaultApiClient {
            configuration,
        }
    }
}


<<<<<<< HEAD
/// struct for typed errors of method `dummy_get`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DummyGetError {
    UnknownValue(serde_json::Value),
}


pub trait DefaultApi {
    fn dummy_get(&self, ) -> Result<(), Error<DummyGetError>>;
}

impl DefaultApi for DefaultApiClient {
    fn dummy_get(&self, ) -> Result<(), Error<DummyGetError>> {
=======
pub trait DefaultApi {
    fn dummy_get(&self, ) -> Result<(), Error>;
}

impl DefaultApi for DefaultApiClient {
    fn dummy_get(&self, ) -> Result<(), Error> {
>>>>>>> ooof
        let configuration: &configuration::Configuration = self.configuration.borrow();
        let client = &configuration.client;

        let uri_str = format!("{}/dummy", configuration.base_path);
        let mut req_builder = client.get(uri_str.as_str());

        if let Some(ref user_agent) = configuration.user_agent {
            req_builder = req_builder.header(reqwest::header::USER_AGENT, user_agent.clone());
        }

<<<<<<< HEAD
        let req = req_builder.build()?;
        let mut resp = client.execute(req)?;

        let status = resp.status();
        let content = resp.text()?;

        if status.is_success() {
            Ok(())
        } else {
            let entity: Option<DummyGetError> = serde_json::from_str(&content).ok();
            let error = ResponseContent { status, content, entity };
            Err(Error::ResponseError(error))
        }
=======
        // send request
        let req = req_builder.build()?;

        client.execute(req)?.error_for_status()?;
        Ok(())
>>>>>>> ooof
    }

}
