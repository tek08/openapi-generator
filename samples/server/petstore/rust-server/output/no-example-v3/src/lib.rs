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

pub const BASE_PATH: &'static str = "";
pub const API_VERSION: &'static str = "0.0.1";

#[derive(Debug, PartialEq)]
pub enum OpGetResponse {
    /// OK
    OK
}

/// API
<<<<<<< HEAD
#[async_trait]
pub trait Api<C: Send + Sync> {
    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>> {
        Poll::Ready(Ok(()))
    }

    async fn op_get(
        &self,
        inline_object: models::InlineObject,
        context: &C) -> Result<OpGetResponse, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[async_trait]
pub trait ApiNoContext<C: Send + Sync> {

    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>>;

    fn context(&self) -> &C;

    async fn op_get(
        &self,
        inline_object: models::InlineObject,
        ) -> Result<OpGetResponse, ApiError>;
=======
pub trait Api<C> {
    fn op_get(
        &self,
        inline_object: models::InlineObject,
        context: &C) -> Box<dyn Future<Item=OpGetResponse, Error=ApiError> + Send>;

}

/// API without a `Context`
pub trait ApiNoContext {
    fn op_get(
        &self,
        inline_object: models::InlineObject,
        ) -> Box<dyn Future<Item=OpGetResponse, Error=ApiError> + Send>;
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

    async fn op_get(
        &self,
        inline_object: models::InlineObject,
        ) -> Result<OpGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().op_get(inline_object, &context).await
=======
impl<'a, T: Api<C>, C> ApiNoContext for ContextWrapper<'a, T, C> {
    fn op_get(
        &self,
        inline_object: models::InlineObject,
        ) -> Box<dyn Future<Item=OpGetResponse, Error=ApiError> + Send>
    {
        self.api().op_get(inline_object, &self.context())
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
