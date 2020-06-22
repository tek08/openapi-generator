//! Main library entry point for no_example_v3 implementation.

#![allow(unused_imports)]

<<<<<<< HEAD
use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::Http;
use hyper::service::Service;
use log::info;
use openssl::ssl::SslAcceptorBuilder;
use std::future::Future;
use std::marker::PhantomData;
use std::net::SocketAddr;
use std::sync::{Arc, Mutex};
use std::task::{Context, Poll};
=======
mod errors {
    error_chain::error_chain!{}
}

pub use self::errors::*;

use chrono;
use futures::{future, Future, Stream};
use hyper::server::conn::Http;
use hyper::service::MakeService as _;
use log::info;
use openssl::ssl::SslAcceptorBuilder;
use std::marker::PhantomData;
use std::net::SocketAddr;
use std::sync::{Arc, Mutex};
use swagger;
>>>>>>> ooof
use swagger::{Has, XSpanIdString};
use swagger::auth::MakeAllowAllAuthenticator;
use swagger::EmptyContext;
use tokio::net::TcpListener;

<<<<<<< HEAD
=======

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use tokio_openssl::SslAcceptorExt;
>>>>>>> ooof
#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use openssl::ssl::{SslAcceptor, SslFiletype, SslMethod};

use no_example_v3::models;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
/// Builds an SSL implementation for Simple HTTPS from some hard-coded file names
<<<<<<< HEAD
pub async fn create(addr: &str, https: bool) {
=======
pub fn create(addr: &str, https: bool) -> Box<dyn Future<Item = (), Error = ()> + Send> {
>>>>>>> ooof
    let addr = addr.parse().expect("Failed to parse bind address");

    let server = Server::new();

<<<<<<< HEAD
    let service = MakeService::new(server);

    let service = MakeAllowAllAuthenticator::new(service, "cosmo");

    let mut service =
        no_example_v3::server::context::MakeAddContext::<_, EmptyContext>::new(
            service
=======
    let service_fn = MakeService::new(server);

    let service_fn = MakeAllowAllAuthenticator::new(service_fn, "cosmo");

    let service_fn =
        no_example_v3::server::context::MakeAddContext::<_, EmptyContext>::new(
            service_fn
>>>>>>> ooof
        );

    if https {
        #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
        {
            unimplemented!("SSL is not implemented for the examples on MacOS, Windows or iOS");
        }

        #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
        {
            let mut ssl = SslAcceptor::mozilla_intermediate_v5(SslMethod::tls()).expect("Failed to create SSL Acceptor");

            // Server authentication
            ssl.set_private_key_file("examples/server-key.pem", SslFiletype::PEM).expect("Failed to set private key");
            ssl.set_certificate_chain_file("examples/server-chain.pem").expect("Failed to set cerificate chain");
            ssl.check_private_key().expect("Failed to check private key");

<<<<<<< HEAD
            let tls_acceptor = Arc::new(ssl.build());
            let mut tcp_listener = TcpListener::bind(&addr).await.unwrap();
            let mut incoming = tcp_listener.incoming();

            while let (Some(tcp), rest) = incoming.into_future().await {
                if let Ok(tcp) = tcp {
                    let addr = tcp.peer_addr().expect("Unable to get remote address");
                    let service = service.call(addr);
                    let tls_acceptor = Arc::clone(&tls_acceptor);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::accept(&*tls_acceptor, tcp).await.map_err(|_| ())?;

                        let service = service.await.map_err(|_| ())?;

                        Http::new().serve_connection(tls, service).await.map_err(|_| ())
                    });
                }

                incoming = rest;
            }
        }
    } else {
        // Using HTTP
        hyper::server::Server::bind(&addr).serve(service).await.unwrap()
=======
            let tls_acceptor = ssl.build();
            let service_fn = Arc::new(Mutex::new(service_fn));
            let tls_listener = TcpListener::bind(&addr).unwrap().incoming().for_each(move |tcp| {
                let addr = tcp.peer_addr().expect("Unable to get remote address");

                let service_fn = service_fn.clone();

                hyper::rt::spawn(tls_acceptor.accept_async(tcp).map_err(|_| ()).and_then(move |tls| {
                    let ms = {
                        let mut service_fn = service_fn.lock().unwrap();
                        service_fn.make_service(&addr)
                    };

                    ms.and_then(move |service| {
                        Http::new().serve_connection(tls, service)
                    }).map_err(|_| ())
                }));

                Ok(())
            }).map_err(|_| ());

            Box::new(tls_listener)
        }
    } else {
        // Using HTTP
        Box::new(hyper::server::Server::bind(&addr).serve(service_fn).map_err(|e| panic!("{:?}", e)))
>>>>>>> ooof
    }
}

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}


use no_example_v3::{
    Api,
<<<<<<< HEAD
    OpGetResponse,
};
use no_example_v3::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    async fn op_get(
        &self,
        inline_object: models::InlineObject,
        context: &C) -> Result<OpGetResponse, ApiError>
    {
        let context = context.clone();
        info!("op_get({:?}) - X-Span-ID: {:?}", inline_object, context.get().0.clone());
        Err("Generic failuare".into())
=======
    ApiError,
    OpGetResponse,
};
use no_example_v3::server::MakeService;

impl<C> Api<C> for Server<C> where C: Has<XSpanIdString>{
    fn op_get(
        &self,
        inline_object: models::InlineObject,
        context: &C) -> Box<dyn Future<Item=OpGetResponse, Error=ApiError> + Send>
    {
        let context = context.clone();
        info!("op_get({:?}) - X-Span-ID: {:?}", inline_object, context.get().0.clone());
        Box::new(future::err("Generic failure".into()))
>>>>>>> ooof
    }

}
