#!/bin/sh

<<<<<<< HEAD
pod install && xcodebuild test -workspace "SwaggerClient.xcworkspace" -scheme "SwaggerClient-Example" -destination "platform=iOS Simulator,name=iPhone 8,OS=13.1" | xcpretty && exit ${PIPESTATUS[0]}
=======
pod install && xcodebuild test -workspace "SwaggerClient.xcworkspace" -scheme "SwaggerClient-Example" -destination "platform=iOS Simulator,name=iPhone 5s,OS=9.3" | xcpretty && exit ${PIPESTATUS[0]}
>>>>>>> ooof
