use std::rc::Rc;

use super::configuration::Configuration;

pub struct APIClient {
<<<<<<< HEAD
    default_api: Box<dyn crate::apis::default_api::DefaultApi>,
=======
    default_api: Box<dyn crate::apis::DefaultApi>,
>>>>>>> ooof
}

impl APIClient {
    pub fn new(configuration: Configuration) -> APIClient {
        let rc = Rc::new(configuration);

        APIClient {
<<<<<<< HEAD
            default_api: Box::new(crate::apis::default_api::DefaultApiClient::new(rc.clone())),
        }
    }

    pub fn default_api(&self) -> &dyn crate::apis::default_api::DefaultApi{
=======
            default_api: Box::new(crate::apis::DefaultApiClient::new(rc.clone())),
        }
    }

    pub fn default_api(&self) -> &dyn crate::apis::DefaultApi{
>>>>>>> ooof
        self.default_api.as_ref()
    }

}
