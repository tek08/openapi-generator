//
// MixedPropertiesAndAdditionalPropertiesClass.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

<<<<<<< HEAD


@objc public class MixedPropertiesAndAdditionalPropertiesClass: NSObject, Codable { 

    public var uuid: UUID?
    public var dateTime: Date?
    public var map: [String:Animal]?

    public init(uuid: UUID?, dateTime: Date?, map: [String:Animal]?) {
=======
@objc public class MixedPropertiesAndAdditionalPropertiesClass: NSObject, Codable {

    public var uuid: UUID?
    public var dateTime: Date?
    public var map: [String: Animal]?

    public init(uuid: UUID?, dateTime: Date?, map: [String: Animal]?) {
>>>>>>> ooof
        self.uuid = uuid
        self.dateTime = dateTime
        self.map = map
    }

}
