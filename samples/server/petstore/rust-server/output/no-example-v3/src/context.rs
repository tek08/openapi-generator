<<<<<<< HEAD
use futures::future::BoxFuture;
use hyper::header::HeaderName;
use hyper::{Error, Request, Response, StatusCode, service::Service};
=======
use futures::Future;
use hyper;
use hyper::header::HeaderName;
use hyper::{Error, Request, Response, StatusCode, service::Service, body::Payload};
>>>>>>> ooof
use url::form_urlencoded;
use std::default::Default;
use std::io;
use std::marker::PhantomData;
<<<<<<< HEAD
use std::task::{Poll, Context};
use swagger::auth::{AuthData, Authorization, Bearer, Scopes};
=======
use swagger::auth::{AuthData, Authorization, Bearer, Scopes};
use swagger::context::ContextualPayload;
>>>>>>> ooof
use swagger::{EmptyContext, Has, Pop, Push, XSpanIdString};
use crate::Api;

pub struct MakeAddContext<T, A> {
    inner: T,
    marker: PhantomData<A>,
}

impl<T, A, B, C, D> MakeAddContext<T, A>
where
    A: Default + Push<XSpanIdString, Result = B>,
    B: Push<Option<AuthData>, Result = C>,
    C: Push<Option<Authorization>, Result = D>,
{
    pub fn new(inner: T) -> MakeAddContext<T, A> {
        MakeAddContext {
            inner,
            marker: PhantomData,
        }
    }
}

// Make a service that adds context.
<<<<<<< HEAD
impl<Target, T, A, B, C, D> Service<Target> for
    MakeAddContext<T, A>
where
    Target: Send,
    A: Default + Push<XSpanIdString, Result = B> + Send,
    B: Push<Option<AuthData>, Result = C>,
    C: Push<Option<Authorization>, Result = D>,
    D: Send + 'static,
    T: Service<Target> + Send,
    T::Future: Send + 'static
{
    type Error = T::Error;
    type Response = AddContext<T::Response, A, B, C, D>;
    type Future = BoxFuture<'static, Result<Self::Response, Self::Error>>;

    fn poll_ready(&mut self, cx: &mut Context<'_>) -> Poll<Result<(), Self::Error>> {
        self.inner.poll_ready(cx)
    }

    fn call(&mut self, target: Target) -> Self::Future {
        let service = self.inner.call(target);

        Box::pin(async move {
            Ok(AddContext::new(service.await?))
        })
    }
}

/// Middleware to add context data from the request
pub struct AddContext<T, A, B, C, D>
where
    A: Default + Push<XSpanIdString, Result = B>,
    B: Push<Option<AuthData>, Result = C>,
    C: Push<Option<Authorization>, Result = D>
{
=======
impl<'a, T, SC, A, B, C, D, E, ME, S, OB, F> hyper::service::MakeService<&'a SC> for
    MakeAddContext<T, A>
where
    A: Default + Push<XSpanIdString, Result = B>,
    B: Push<Option<AuthData>, Result = C>,
    C: Push<Option<Authorization>, Result = D>,
    D: Send + 'static,
    T: hyper::service::MakeService<
            &'a SC,
            Error = E,
            MakeError = ME,
            Service = S,
            ReqBody = ContextualPayload<hyper::Body, D>,
            ResBody = OB,
            Future = F
    >,
    S: Service<
            Error = E,
            ReqBody = ContextualPayload<hyper::Body, D>,
            ResBody = OB> + 'static,
    ME: swagger::ErrorBound,
    E: swagger::ErrorBound,
    F: Future<Item=S, Error=ME> + Send + 'static,
    S::Future: Send,
    OB: Payload,
{
    type ReqBody = hyper::Body;
    type ResBody = OB;
    type Error = E;
    type MakeError = ME;
    type Service = AddContext<S, A>;
    type Future = Box<dyn Future<Item = Self::Service, Error = ME> + Send + 'static>;

    fn make_service(&mut self, ctx: &'a SC) -> Self::Future {
        Box::new(self.inner.make_service(ctx).map(|s| AddContext::new(s)))
    }
}

/// Middleware to extract authentication data from request
pub struct AddContext<T, A> {
>>>>>>> ooof
    inner: T,
    marker: PhantomData<A>,
}

<<<<<<< HEAD
impl<T, A, B, C, D> AddContext<T, A, B, C, D>
=======
impl<T, A, B, C, D> AddContext<T, A>
>>>>>>> ooof
where
    A: Default + Push<XSpanIdString, Result = B>,
    B: Push<Option<AuthData>, Result = C>,
    C: Push<Option<Authorization>, Result = D>,
<<<<<<< HEAD
{
    pub fn new(inner: T) -> Self {
=======
    T: Service,
{
    pub fn new(inner: T) -> AddContext<T, A> {
>>>>>>> ooof
        AddContext {
            inner,
            marker: PhantomData,
        }
    }
}

<<<<<<< HEAD
impl<T, A, B, C, D, ReqBody> Service<Request<ReqBody>> for AddContext<T, A, B, C, D>
=======
impl<T, A, B, C, D> Service for AddContext<T, A>
>>>>>>> ooof
    where
        A: Default + Push<XSpanIdString, Result=B>,
        B: Push<Option<AuthData>, Result=C>,
        C: Push<Option<Authorization>, Result=D>,
        D: Send + 'static,
<<<<<<< HEAD
        T: Service<(Request<ReqBody>, D)>
{
    type Error = T::Error;
    type Future = T::Future;
    type Response = T::Response;

    fn poll_ready(&mut self, cx: &mut Context<'_>) -> Poll<Result<(), Self::Error>> {
        self.inner.poll_ready(cx)
    }


    fn call(&mut self, request: Request<ReqBody>) -> Self::Future {
        let context = A::default().push(XSpanIdString::get_or_generate(&request));
        let headers = request.headers();
=======
        T: Service<ReqBody = ContextualPayload<hyper::Body, D>>,
        T::Future: Future<Item=Response<T::ResBody>, Error=T::Error> + Send + 'static
{
    type ReqBody = hyper::Body;
    type ResBody = T::ResBody;
    type Error = T::Error;
    type Future = Box<dyn Future<Item=Response<T::ResBody>, Error=T::Error> + Send + 'static>;

    fn call(&mut self, req: Request<Self::ReqBody>) -> Self::Future {
        let context = A::default().push(XSpanIdString::get_or_generate(&req));
        let (head, body) = req.into_parts();
        let headers = head.headers.clone();
>>>>>>> ooof


        let context = context.push(None::<AuthData>);
        let context = context.push(None::<Authorization>);
<<<<<<< HEAD

        self.inner.call((request, context))
=======
        let body = ContextualPayload {
            inner: body,
            context: context,
        };

        Box::new(self.inner.call(hyper::Request::from_parts(head, body)))
>>>>>>> ooof
    }
}
