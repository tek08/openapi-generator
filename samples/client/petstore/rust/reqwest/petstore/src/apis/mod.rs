use reqwest;
use serde_json;

<<<<<<< HEAD
#[derive(Debug, Clone)]
pub struct ResponseContent<T> {
    pub status: reqwest::StatusCode,
    pub content: String,
    pub entity: Option<T>,
}

#[derive(Debug)]
pub enum Error<T> {
    Reqwest(reqwest::Error),
    Serde(serde_json::Error),
    Io(std::io::Error),
    ResponseError(ResponseContent<T>),
}

impl <T> From<reqwest::Error> for Error<T> {
=======
#[derive(Debug)]
pub enum Error {
    Reqwest(reqwest::Error),
    Serde(serde_json::Error),
    Io(std::io::Error),
}

impl From<reqwest::Error> for Error {
>>>>>>> ooof
    fn from(e: reqwest::Error) -> Self {
        Error::Reqwest(e)
    }
}

<<<<<<< HEAD
impl <T> From<serde_json::Error> for Error<T> {
=======
impl From<serde_json::Error> for Error {
>>>>>>> ooof
    fn from(e: serde_json::Error) -> Self {
        Error::Serde(e)
    }
}

<<<<<<< HEAD
impl <T> From<std::io::Error> for Error<T> {
=======
impl From<std::io::Error> for Error {
>>>>>>> ooof
    fn from(e: std::io::Error) -> Self {
        Error::Io(e)
    }
}

pub fn urlencode<T: AsRef<str>>(s: T) -> String {
    ::url::form_urlencoded::byte_serialize(s.as_ref().as_bytes()).collect()
}

<<<<<<< HEAD
pub mod pet_api;
pub mod store_api;
pub mod user_api;

pub mod client;
pub mod configuration;
=======
mod pet_api;
pub use self::pet_api::{ PetApi, PetApiClient };
mod store_api;
pub use self::store_api::{ StoreApi, StoreApiClient };
mod user_api;
pub use self::user_api::{ UserApi, UserApiClient };

pub mod configuration;
pub mod client;
>>>>>>> ooof
