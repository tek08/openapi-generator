// swift-tools-version:5.0

import PackageDescription

let package = Package(
    name: "PetstoreClient",
    platforms: [
        .iOS(.v9),
        .macOS(.v10_11),
        .tvOS(.v9),
        .watchOS(.v3)
    ],
    products: [
        // Products define the executables and libraries produced by a package, and make them visible to other packages.
        .library(
            name: "PetstoreClient",
<<<<<<< HEAD
            targets: ["PetstoreClient"]),
    ],
    dependencies: [
        // Dependencies declare other packages that this package depends on.
        .package(url: "https://github.com/Alamofire/Alamofire.git", from: "4.9.1"),
=======
            targets: ["PetstoreClient"])
    ],
    dependencies: [
        // Dependencies declare other packages that this package depends on.
        .package(url: "https://github.com/Alamofire/Alamofire.git", from: "4.9.1")
>>>>>>> ooof
    ],
    targets: [
        // Targets are the basic building blocks of a package. A target can define a module or a test suite.
        // Targets can depend on other targets in this package, and on products in packages which this package depends on.
        .target(
            name: "PetstoreClient",
<<<<<<< HEAD
            dependencies: ["Alamofire", ],
            path: "PetstoreClient/Classes"
        ),
=======
            dependencies: ["Alamofire" ],
            path: "PetstoreClient/Classes"
        )
>>>>>>> ooof
    ]
)
